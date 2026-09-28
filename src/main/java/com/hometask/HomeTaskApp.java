package com.hometask;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTaskApp {

    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int nextId = 1;

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("================================");
        System.out.println("        Welcome to HomeTask     ");
        System.out.println("================================");

        while (running) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addTask();
                case "2" -> viewTasks();
                case "3" -> completeTask();
                case "4" -> deleteTask();
                case "5" -> {
                    running = false;
                    System.out.println("Thank you for using HomeTask!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--------- HomeTask Menu ---------");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addTask() {
        System.out.print("Enter household task: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return;
        }

        tasks.add(new Task(nextId++, name));
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        System.out.println("\n--------- Household Tasks ---------");

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private static void completeTask() {
        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        System.out.print("Enter task ID to complete: ");

        try {
            int id = Integer.parseInt(scanner.nextLine());

            for (Task task : tasks) {
                if (task.getId() == id) {
                    if (task.isCompleted()) {
                        System.out.println("Task is already completed.");
                    } else {
                        task.markCompleted();
                        System.out.println("Task marked as completed!");
                    }
                    return;
                }
            }

            System.out.println("Task ID not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    private static void deleteTask() {
        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        System.out.print("Enter task ID to delete: ");

        try {
            int id = Integer.parseInt(scanner.nextLine());

            for (Task task : tasks) {
                if (task.getId() == id) {
                    tasks.remove(task);
                    System.out.println("Task deleted successfully!");
                    return;
                }
            }

            System.out.println("Task ID not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
