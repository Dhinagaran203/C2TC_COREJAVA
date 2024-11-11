package com.tns.ifet.day7.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
        //Dynamic binding assigning child class object to parent class reference variable.
		RBI rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}