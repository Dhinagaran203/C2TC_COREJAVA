//Program to demonstrate FunctionalInterface - Child Class
package com.tns.ifet.day6.interfaces.functionalinterfaces;

public class GreetClass implements GreetInterface {

	@Override
	public String greet() {		
		return "Welcome to the world of Java";
	}

}