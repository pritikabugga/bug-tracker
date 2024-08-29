/*
 * Project: Bug Tracking System
 * This project is a basic bug tracking application built in Java.
 * It allows users to:
 *   1. Create new bugs with a unique identifier, title, and description.
 *   2. Display a list of all recorded bugs.
 *   3. Modify the status, description, or assigned developer of a bug using its unique identifier.
 *   4. Assign bugs to specific developers.
 *   5. Remove bugs from the system.
 *
 * Each bug is assigned a unique UUID when created, which is used to manage and identify bugs.
 * The application uses a HashMap to store and retrieve bugs, with the UUID serving as the key.
 *
 * Instructions:
 *   - After creating a bug, note the UUID assigned to it.
 *   - Use the UUID to update, assign, or delete the bug as needed.
 *
 * Author: Pritika Bugga
 * Date: 08/01/2024
 */

import java.util.HashMap;
import java.util.Scanner;

public class BugTracker {
    private HashMap<String, Bug> bugs;  // HashMap to store bugs using their UUID as the key
    private Scanner scanner;

    public BugTracker() {
        bugs = new HashMap<>();  // Initialize the HashMap
        scanner = new Scanner(System.in);  // Initialize the Scanner for user input
    }

    // Method to add a new bug to the tracker
    public void addBug() {
        System.out.print("Enter bug title: ");
        String title = scanner.nextLine();
        System.out.print("Enter bug description: ");
        String description = scanner.nextLine();
        Bug bug = new Bug(title, description);  // Create a new Bug object
        bugs.put(bug.getId(), bug);  // Add the Bug to the HashMap using its UUID as the key
        System.out.println("Bug added successfully with ID: " + bug.getId() + "\n");
    }

    // Method to view all bugs in the tracker
    public void viewBugs() {
        if (bugs.isEmpty()) {
            System.out.println("No bugs found.\n");
        } else {
            for (Bug bug : bugs.values()) {
                System.out.println(bug);
            }
        }
    }

    // Method to update a bug's details in the tracker
    public void updateBug() {
        System.out.print("Enter bug ID to update: ");
        String id = scanner.nextLine();

        if (bugs.containsKey(id)) {
            Bug bug = bugs.get(id);

            System.out.println("What would you like to update?");
            System.out.println("1. Status");
            System.out.println("2. Description");
            System.out.println("3. Assigned Developer");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter new status (Open, In Progress, Resolved): ");
                    String newStatus = scanner.nextLine();
                    bug.setStatus(newStatus);
                    break;

                case 2:
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    bug.setDescription(newDescription);
                    break;

                case 3:
                    System.out.print("Enter new developer name: ");
                    String newDeveloper = scanner.nextLine();
                    bug.setAssignedTo(newDeveloper);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            System.out.println("Bug updated successfully!\n");
        } else {
            System.out.println("Bug not found.\n");
        }
    }

    // Method to assign a developer to a bug
    public void assignBug() {
        System.out.print("Enter bug ID to assign: ");
        String id = scanner.nextLine();

        if (bugs.containsKey(id)) {
            Bug bug = bugs.get(id);
            System.out.print("Enter developer name to assign: ");
            String developer = scanner.nextLine();
            bug.setAssignedTo(developer);
            System.out.println("Bug assigned to " + developer + " successfully!\n");
        } else {
            System.out.println("Bug not found.\n");
        }
    }

    // Method to delete a bug from the tracker
    public void deleteBug() {
        System.out.print("Enter bug ID to delete: ");
        String id = scanner.nextLine();

        if (bugs.containsKey(id)) {
            bugs.remove(id);
            System.out.println("Bug deleted successfully!\n");
        } else {
            System.out.println("Bug not found.\n");
        }
    }

    // Main method to run the bug tracker application
    public static void main(String[] args) {
        BugTracker tracker = new BugTracker();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Bug");
            System.out.println("2. View All Bugs");
            System.out.println("3. Update Bug");
            System.out.println("4. Assign Bug");
            System.out.println("5. Delete Bug");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tracker.addBug();
                    break;
                case 2:
                    tracker.viewBugs();
                    break;
                case 3:
                    tracker.updateBug();
                    break;
                case 4:
                    tracker.assignBug();
                    break;
                case 5:
                    tracker.deleteBug();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
}
