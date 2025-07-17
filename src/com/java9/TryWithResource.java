package com.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * In Java SE 9, we can use try-with-resources to automatically close resources.
 * This is a more convenient way to decleare the resource outside the try with resource block. We no longer
 * need to create local variable to access the resource.
 */
public class TryWithResource {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("./resources/trywithresource.txt");
        try (fos) {
            fos.write("Welcome to Java9 TryWithResource".getBytes());
            System.out.println("File written successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
