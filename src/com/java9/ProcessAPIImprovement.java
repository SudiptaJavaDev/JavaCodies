package com.java9;

/*
Process API is used for performing Operating System(OS) level operations for controlling and managing
the processes.Java SE 9 is coming with some improvements in Process API.
They have added couple new classes and methods to ease the controlling and managing of OS processes.

New interface added in Process API are mentioned below:
1. java.lang.ProcessHandle
2. java.lang.ProcessHandle.Info
*/

public class ProcessAPIImprovement {
    public static void main(String[] args) {

        ProcessHandle processHandle = ProcessHandle.current();
        //Get current running process
        System.out.println(processHandle);
        ProcessHandle.Info processInfo = processHandle.info();
        //Get current running process info
        System.out.println(processInfo);
        //Get all running processes
        //ProcessHandle.allProcesses().forEach(System.out::println);
        //Get current user information
        System.out.println(processInfo.user().get());
        System.out.println(processInfo.command().get());
        System.out.println(processInfo.startInstant().get());
        System.out.println("Total CPU Time Acured: " + processInfo.totalCpuDuration().get().toMillis());

    }
}
