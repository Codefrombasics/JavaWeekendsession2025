package org.example.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String content = "Welcome to Code From Basics have a nice Weekend!";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(content);
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
