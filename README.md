# Bug Tracking Application

## Introduction

The Bug Tracking Application is designed in Java to assist software development teams in efficiently tracking and managing bugs. This tool allows users to log new bugs, update their details, and monitor the progress of bug resolution. The application includes a `Bug` class to represent each bug and a `BugTracker` class to oversee the collection and management of these bugs.

## Key Features

- **Log New Bugs:** Users can report bugs by providing detailed descriptions, setting priority levels, and assigning statuses.
- **Update Bug Information:** Modify the status, priority, or assignment of any existing bug as needed.
- **Monitor Bugs:** The application maintains a list of all reported bugs, which can be searched, filtered, and sorted based on various criteria.

## Core Components

- **Bug:** A class that encapsulates all the necessary details about a bug, such as its ID, description, priority, and status.
  - **Data Structure:** Utilizes fields like `String`, `int`, and `enum` to store bug attributes.
  
- **BugTracker:** A class that manages the collection of bugs, offering methods to add, update, and retrieve bug information.
  - **Data Structure:** Uses a `List<Bug>` (e.g., `ArrayList<Bug>`) to store and manipulate the list of `Bug` objects, supporting dynamic changes and efficient access.
  - **Filtering and Sorting:** The list structure allows easy application of filters and sorting operations on the bugs.

### Data Structures in Use

1. **ArrayList (or List Interface):**
   - **Purpose:** To manage and store the collection of `Bug` objects.
   - **Benefits:** Supports dynamic resizing, fast iteration, and direct access to elements.
   - **Operations:**
     - Add a bug: `add(Bug bug)`
     - Remove a bug: `remove(Bug bug)`
     - Search bugs: Loop through the list or use methods like `contains(Bug bug)`.

2. **Enum:**
   - **Purpose:** Defines the possible statuses of a bug (e.g., `OPEN`, `IN_PROGRESS`, `RESOLVED`).
   - **Benefits:** Improves code readability and enforces type safety by restricting the values to a predefined set.

## Setup Instructions

### Requirements

- Java Development Kit (JDK) version 8 or later
- Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse

### Installation Steps

1. **Download the Files:**
   - Download the individual Java files (`Bug.java`, `BugTracker.java`) to your local machine.

2. **Open the Files in Your IDE:**
   - **IntelliJ IDEA:**
     - Select `File` > `Open` and navigate to the directory where the files are saved.
     - Open the individual `.java` files or create a new project and add these files to it.
   - **Eclipse:**
     - Select `File` > `Import`, then choose `General > File System`.
     - Navigate to the directory where the files are saved and import them into a new or existing project.

3. **Compile the Project:**
   - Your IDE should automatically compile the Java files when they are opened. If not, use the IDE’s build or compile option.

4. **Run the Application:**
   - Locate the `BugTracker` class within the IDE.
   - Right-click on `BugTracker` and select `Run` to start the application.

## How to Use

1. **Log Bugs:** Enter details about a bug, such as its description, priority, and current status.
2. **Update Bugs:** Modify the information of existing bugs, including status changes or priority adjustments.
3. **Review Bugs:** Browse through the list of bugs and use search or filter options to find specific bugs based on your criteria.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for full details.

## Contact

If you have any questions or feedback, please reach out to [Pritika Bugga](mailto:pritikabugga@gmail.com).
