package com.tns.ifet.day2;
public class NestedForLoopDemo 
{
	public static void main(String[] args) 
	{
		// program to print the multiplication tables in a given range by using nested 
		// for loop 
		int beg=1; 
		int end=10; 
		 
		for (int i = beg; i <= end; i++) 
		{ 
			for (int j = 1; j <= 10; j++) 
			{ 
				System.out.println(i + "*" + j + "= " + i * j); 
		    } 
		    System.out.println(); 
		 
		 }

	}

}
