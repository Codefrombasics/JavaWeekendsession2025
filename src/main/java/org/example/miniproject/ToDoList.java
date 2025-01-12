package org.example.miniproject;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) throws IndexOutOfBoundsException {
        tasks.remove(index);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

