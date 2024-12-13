package com.dhinagaran.assignment.utilities;

import com.dhinagaran.assignment.employees.Employee;
import com.dhinagaran.assignment.employees.Manager;
import com.dhinagaran.assignment.employees.Developer;

/**
 * Provides utility methods to perform operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * @param employee The employee whose details are to be printed.
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Calculates a salary increment for the employee.
     * @param employee The employee whose salary is to be incremented.
     * @param percentage The percentage of increment.
     */
    public void incrementSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * (percentage / 100));
        employee.setSalary(newSalary);
        System.out.println("Updated Salary for " + employee.getName() + ": " + newSalary);
    }
}
