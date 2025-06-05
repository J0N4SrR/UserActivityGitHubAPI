# GitHub User Activity CLI

This project is a simple Command Line Interface (CLI) application developed in Java to fetch and display a GitHub user's recent activity. It was inspired by and based on the "GitHub User Activity" project from https://roadmap.sh/projects/github-user-activity

## Features

* Retrieves recent activities for a specified GitHub user.
* Displays events like `PushEvent`, `CreateEvent`, and `WatchEvent` directly in the terminal.
* Supports providing the GitHub username as a command-line argument or via interactive input.
* Handles API request errors (non-2xx HTTP statuses) and scenarios where a user has no recent activities.

## Technologies Used

* **Java 17**
* **Apache Maven**: Utilized for dependency management and project building.
* **Jackson**: This library was included for JSON parsing and mapping. The decision to use Jackson was made to streamline the processing of JSON data, as manual parsing would be significantly more complex and error-prone. While the base roadmap.sh project suggests avoiding external libraries for "fetching" data, employing Jackson for "parsing" (processing the received JSON) was considered a practical trade-off for development efficiency and robust data conversion.

## How to Run the Project

### Prerequisites

* Java Development Kit (JDK) 17 or higher.
* Apache Maven.


### Compilation and Execution

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/j0n4srr/UserActivityGitHubAPI.git](https://github.com/j0n4srr/UserActivityGitHubAPI.git)
    cd UserActivityGitHubAPI
    ```
2.  **Compile the project and create the executable JAR (with dependencies):**
    ```bash
    mvn clean install
    ```
    *This command will generate an executable JAR file named `UserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar` in the `target/` directory, bundling all necessary dependencies.*

3.  **Execute the application:**

    * **Passing the username as an argument:**
        ```bash
        java -jar target/UserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar <github_username>
        ```
        Example:
        ```bash
        java -jar target/UserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar kamranahmedse
        ```

    * **Interactive execution (if no argument is provided):**
        ```bash
        java -jar target/UserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar
        ```
        *Expected output:*
        ```
        Você não passou o username como argumento!
        Digite o usuário:
        ```
## Example Output

-Pushed 3 commits to kamranahmedse/developer-roadmap
-Opened a new issue in kamranahmedse/developer-roadmap
-Starred kamranahmedse/developer-roadmap
