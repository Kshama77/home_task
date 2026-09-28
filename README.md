# HomeTask

HomeTask is a basic Java console application for managing household tasks.

## Features

- Add a household task
- View all tasks
- Mark a task as completed
- Delete a task
- Simple menu-driven console interface
- Uses Java classes, ArrayList, loops, methods, and conditionals

## Technologies

- Java 17+
- Maven

## Project Structure

```text
HomeTask/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    └── main/
        └── java/
            └── com/
                └── hometask/
                    ├── HomeTaskApp.java
                    └── Task.java
```

## How to Run

### Using Maven

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.hometask.HomeTaskApp"
```

### Using Java directly

```bash
javac -d out src/main/java/com/hometask/*.java
java -cp out com.hometask.HomeTaskApp
```

## Example Tasks

- Clean the kitchen
- Do laundry
- Take out trash
- Buy groceries
- Water plants

## Learning Goals

This project is intended as a simple Java practice project for GitHub. It demonstrates:

- Classes and objects
- Constructors
- Encapsulation
- ArrayList
- Scanner input
- Methods
- Loops
- If/else conditions
- Basic application structure
