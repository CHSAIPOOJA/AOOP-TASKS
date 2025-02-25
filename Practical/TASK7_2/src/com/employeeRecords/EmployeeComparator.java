package com.employeeRecords;

import java.util.Comparator;

public class EmployeeComparator {
    // Comparator for sorting by Salary (Ascending)
    public static Comparator<Employee> salaryAscending = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

    // Comparator for sorting by Salary (Descending)
    public static Comparator<Employee> salaryDescending = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e2.getSalary(), e1.getSalary());
        }
    };

    // Comparator for sorting by Name (Alphabetical Order)
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareToIgnoreCase(e2.getName());
        }
    };

    // Comparator for sorting by Department (Alphabetical Order)
    public static Comparator<Employee> departmentComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        }
    };
}
