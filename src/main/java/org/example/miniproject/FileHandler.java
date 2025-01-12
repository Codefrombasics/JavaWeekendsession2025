package org.example.miniproject;

import java.io.*;
import java.util.List;

public class FileHandler {
    private String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public void saveTasks(List<Task> tasks) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Task task : tasks) {
                bw.write(task.getDescription());
                bw.newLine();
            }
        }
    }

    public void loadTasks(List<Task> tasks) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(new BaseTask(line));
            }
        }
    }
}
