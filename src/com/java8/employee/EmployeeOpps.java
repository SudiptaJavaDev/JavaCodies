package com.java8.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOpps {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Find out how many male and female employees are there in the organization?
        long maleCount = employeeList.stream().filter(e -> e.getGender().equals("Male")).count();
        long femaleCount = employeeList.stream().filter(e -> e.getGender().equals("Female")).count();
        System.out.println("Male count: " + maleCount);
        System.out.println("Female count: " + femaleCount);
        System.out.println("----------------------------------");

        // Find out the average age of male and female employees?
        double avgMaleAge = employeeList.stream().filter(e -> e.getGender().equals("Male"))
                .mapToInt(e -> e.getAge()).average().orElse(0.0);
        double avgFemaleAge = employeeList.stream().filter(e -> e.getGender().equals("Female"))
                .mapToInt(e -> e.getAge()).average().orElse(0.0);
        System.out.println("Average age of male employees: " + avgMaleAge);
        System.out.println("Average age of female employees: " + avgFemaleAge);
        System.out.println("----------------------------------");

        // Find out the average salary of male and female employees?
        double avgMaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Male"))
                .mapToDouble(e -> e.getSalary()).average().orElse(0.0);
        double avgFemaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Female"))
                .mapToDouble(e -> e.getSalary()).average().orElse(0.0);
        System.out.println("Average salary of male employees: " + avgMaleSalary);
        System.out.println("Average salary of female employees: " + avgFemaleSalary);
        System.out.println("----------------------------------");

        // Find out the minimum and maximum salary of male and female employees?
        double minMaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Male"))
                .mapToDouble(e -> e.getSalary()).min().orElse(0.0);
        double maxMaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Male"))
                .mapToDouble(e -> e.getSalary()).max().orElse(0.0);
        System.out.println("Minimum salary of male employees: " + minMaleSalary);
        System.out.println("Maximum salary of male employees: " + maxMaleSalary);
        System.out.println("----------------------------------");

        double minFemaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Female"))
                .mapToDouble(e -> e.getSalary()).min().orElse(0.0);
        double maxFemaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Female"))
                .mapToDouble(e -> e.getSalary()).max().orElse(0.0);
        System.out.println("Minimum salary of female employees: " + minFemaleSalary);
        System.out.println("Maximum salary of female employees: " + maxFemaleSalary);
        System.out.println("----------------------------------");

        // Find out the total salary of male and female employees?
        double totalMaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Male"))
                .mapToDouble(e -> e.getSalary()).sum();
        double totalFemaleSalary = employeeList.stream().filter(e -> e.getGender().equals("Female"))
                .mapToDouble(e -> e.getSalary()).sum();
        System.out.println("Total salary of male employees: " + totalMaleSalary);
        System.out.println("Total salary of female employees: " + totalFemaleSalary);
        System.out.println("----------------------------------");

        // Find out name of the department in organization?
        employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);
        System.out.println("----------------------------------");

        //Get the details of highest paid employee in the organization?
        Employee highestPaidEmployee = employeeList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get();
        System.out.println("Highest paid employee: " + highestPaidEmployee.getName() + ", Salary: " + highestPaidEmployee.getSalary());
        System.out.println("----------------------------------");
        //Get the details of lowest paid employee in the organization?
        Employee lowestPaidEmployee = employeeList.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get();
        System.out.println("Lowest paid employee: " + lowestPaidEmployee.getName() + ", Salary: " + lowestPaidEmployee.getSalary());
        System.out.println("----------------------------------");
        //Get accending order of employees based on their salary?
        employeeList.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Get descending order of employees based on their salary?
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("----------------------------------");

        //Get the details of oldest employee in the organization?
        Employee oldestEmployee = employeeList.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
        System.out.println("Oldest employee: " + oldestEmployee.getName() + ", Age: " + oldestEmployee.getAge());
        System.out.println("----------------------------------");
        //Get the details of youngest employee in the organization?
        Employee youngestEmployee = employeeList.stream().min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
        System.out.println("Youngest employee: " + youngestEmployee.getName() + ", Age: " + youngestEmployee.getAge());
        System.out.println("----------------------------------");

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName()).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Get the details of employees who are working in the IT department?
        employeeList.stream().filter(e -> e.getDepartment().equals("IT")).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Get the details of employees who are working in the IT department and have joined after 2014 and before 2015?
        employeeList.stream().filter(e -> e.getDepartment().equals("IT")).filter(e -> e.getYearOfJoining() > 2014 && e.getYearOfJoining() < 2015).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Get the details of employees who have joined in 2014 and are working in the IT department?
        employeeList.stream().filter(e -> e.getYearOfJoining() == 2014).filter(e -> e.getDepartment().equals("IT")).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Count the number of employees in each department?
        Map<String, Long> employeeCountByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> employeeCountByDepartmentSet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String, Long> entry : employeeCountByDepartmentSet) {
            System.out.println("Department: " + entry.getKey() + ", Employee count: " + entry.getValue());
        }
        System.out.println("----------------------------------");
        //Get the average salary of employees in each department?
        Map<String, Double> employeeAverageSalaryByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> employeeAverageSalaryByDepartmentSet = employeeAverageSalaryByDepartment.entrySet();
        for (Map.Entry<String, Double> entry : employeeAverageSalaryByDepartmentSet) {
            System.out.println("Department: " + entry.getKey() + ", Average salary: " + entry.getValue());
        }
        System.out.println("----------------------------------");
        //Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =
                employeeList.stream()
                        .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());
        System.out.println("----------------------------------");
        //Who has the most working experience in the organization?
        Optional<Employee> employeeWithMostWorkingExperienceWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getYearOfJoining));
        Employee employeeWithMostWorkingExperience = employeeWithMostWorkingExperienceWrapper.get();
        System.out.println("Employee with most working experience: " + employeeWithMostWorkingExperience.getName() + ", Experience: " + (2022 - employeeWithMostWorkingExperience.getYearOfJoining()));
        System.out.println("----------------------------------");

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName()).forEach(System.out::println);
        System.out.println("----------------------------------");
        //Get the details of employees who are working in the IT department?
        employeeList.stream().filter(e -> e.getDepartment().equals("IT")).forEach(System.out::println);
        System.out.println("----------------------------------");
        //How many male and female employees are there in the sales and marketing team?
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
                employeeList.stream()
                        .filter(e -> e.getDepartment() == "Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInSalesMarketing);
        System.out.println("----------------------------------");

        //List down the names of all employees in each department?
        Map<String, List<Employee>> employeeListByDepartment =


                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet) {
            System.out.println("--------------------------------------");

            System.out.println("Employees In " + entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
    }
}
