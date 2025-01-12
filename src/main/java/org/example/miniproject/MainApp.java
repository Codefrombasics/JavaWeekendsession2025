package org.example.miniproject;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final String FILE_PATH = "tasks.txt";

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        FileHandler fileHandler = new FileHandler(FILE_PATH);
        Scanner scanner = new Scanner(System.in);

        // Load tasks from file
        try {
            fileHandler.loadTasks(toDoList.getTasks());
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }

        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addTask(scanner, toDoList); break;
                case 2: viewTasks(toDoList); break;
                case 3: deleteTask(scanner, toDoList); break;
                case 4:
                    // Save tasks to file
                    try {
                        fileHandler.saveTasks(toDoList.getTasks());
                    } catch (IOException e) {
                        System.out.println("Error saving tasks: " + e.getMessage());
                    }
                    System.out.println("Thank you !"); return;
                default: System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner, ToDoList toDoList) {
        System.out.print("Enter a new task: ");
        String description = scanner.nextLine();
        Task task = new BaseTask(description);
        toDoList.addTask(task);
        System.out.println("Task added.");
    }

    private static void viewTasks(ToDoList toDoList) {
        System.out.println("\nYour Tasks:");
        List<Task> tasks = toDoList.getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void deleteTask(Scanner scanner, ToDoList toDoList) {
        viewTasks(toDoList);
        System.out.print("Enter the number of the task to delete: ");
        int taskNumber = scanner.nextInt();
        try {
            toDoList.removeTask(taskNumber - 1);
            System.out.println("Task deleted.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number.");
        }
    }
}
