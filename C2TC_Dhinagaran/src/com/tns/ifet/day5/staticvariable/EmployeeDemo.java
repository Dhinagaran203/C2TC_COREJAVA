package com.tns.ifet.day5.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Dhiva", 123);
		System.out.println(e);
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Bala", 321);
		System.out.println(e);

	}

}