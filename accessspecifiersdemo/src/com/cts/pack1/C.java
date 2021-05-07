package com.cts.pack1;

public class C extends A {
	
	public void display()
	{
		// In the derived class same package private member is not accessible
		//  System.out.println("The private member "+a);
		  System.out.println("The default member "+b);
		  System.out.println("The protected member "+c);
		  System.out.println("The public member "+d);
	}

}
