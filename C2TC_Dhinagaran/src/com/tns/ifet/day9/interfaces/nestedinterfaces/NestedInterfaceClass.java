//Child class implements inner interface
package com.tns.ifet.day9.interfaces.nestedinterfaces;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		 System.out.println("Print method of nested interface");
	}

	

}