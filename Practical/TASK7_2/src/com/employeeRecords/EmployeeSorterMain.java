package com.employeeRecords;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorterMain {
    public static void main(String[] args) {
        // Create a list of employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 60000));
        employees.add(new Employee(102, "Bob", "Engineering", 75000));
        employees.add(new Employee(103, "Charlie", "Finance", 50000));
        employees.add(new Employee(104, "David", "Engineering", 90000));
        employees.add(new Employee(105, "Eve", "HR", 65000));

        // Sorting employees by Salary (Ascending)
        Collections.sort(employees, EmployeeComparator.salaryAscending);
        System.out.println("Sorted by Salary (Ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting employees by Salary (Descending)
        Collections.sort(employees, EmployeeComparator.salaryDescending);
        System.out.println("\nSorted by Salary (Descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting employees by Name (Alphabetical Order)
        Collections.sort(employees, EmployeeComparator.nameComparator);
        System.out.println("\nSorted by Name (Alphabetical Order):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting employees by Department (Alphabetical Order)
        Collections.sort(employees, EmployeeComparator.departmentComparator);
        System.out.println("\nSorted by Department (Alphabetical Order):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
