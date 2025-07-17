package com.java11;

public class NestBasedAccessControl {

    // Nest-Based Access Control is a feature introduced in Java 11 that improves
    // the access control mechanism between nested classes.
    // It allows nested classes to access private members of other nested classes within the same outer class.
    private void display() {
        System.out.println("Hello from private method");
    }

    class InnerClass {

         void innerMethod() {
            display();
        }
    }
    public static void main(String[] args) {
        NestBasedAccessControl nestBasedAccessControl = new NestBasedAccessControl();
        NestBasedAccessControl.InnerClass innerClass = nestBasedAccessControl.new InnerClass();
        innerClass.innerMethod();
    }
}
