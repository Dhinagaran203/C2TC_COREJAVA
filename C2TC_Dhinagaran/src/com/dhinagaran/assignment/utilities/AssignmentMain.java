package com.dhinagaran.assignment.utilities;

import com.dhinagaran.assignment.employees.Developer;
import com.dhinagaran.assignment.employees.Manager;
import com.dhinagaran.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the usage of Java packages and access modifiers.
 */

public class AssignmentMain {
    public static void main(String[] args) {
    	
        // Creating instances of Manager and Developer
    	
        Manager manager = new Manager("Alice", 101, 90000, "HR");
        Developer developer = new Developer("Bob", 102, 80000, "Java");

        // Using EmployeeUtilities
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Printing details
        System.out.println("Manager Details:");
        utilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        utilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Incrementing salaries
        System.out.println("\nIncrementing Salaries:");
        utilities.incrementSalary(manager, 10);
        utilities.incrementSalary(developer, 15);
    }
}
