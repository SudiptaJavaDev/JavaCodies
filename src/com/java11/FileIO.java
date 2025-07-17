package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    //Java 11 introduced Files.readString() and Files.writeString()
    // methods for reading and writing strings to files, simplifying file I/O operations.
    public static void main(String[] args) {
        try {
            Path path = Paths.get("./resources/example.txt");

            // Writing a string to a file
            Files.writeString(path, "Hello, Java 11....!");

            // Reading a string from a file
            String content = Files.readString(path);
            System.out.println(content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
