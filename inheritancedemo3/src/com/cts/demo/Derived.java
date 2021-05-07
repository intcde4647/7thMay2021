package com.cts.demo;

public class Derived extends Base {
   
	// Overriding 
	public void display()
   {  
		super.display(); // calling the base class display method
	   System.out.println("Derived display");
   }
}
