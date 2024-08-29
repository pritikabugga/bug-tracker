import java.util.UUID;

public class Bug {
    private String id;
    private String title;
    private String description;
    private String status;
    private String assignedTo;

    public Bug(String title, String description) {
        this.id = UUID.randomUUID().toString();  // Generate a unique ID
        this.title = title;
        this.description = description;
        this.status = "Open";
        this.assignedTo = "Unassigned";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    // Method to update the description of the bug
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bug ID: " + id + "\nTitle: " + title + "\nDescription: " + description +
                "\nStatus: " + status + "\nAssigned To: " + assignedTo + "\n";
    }
}
