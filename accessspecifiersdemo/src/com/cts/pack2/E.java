package com.cts.pack2;

import com.cts.pack1.A;

public class E extends A {
	public void display()
	{
		
		  //System.out.println("The private member "+a);
		  //System.out.println("The default member "+b);
		 // If it is a derived class different package then only protected and public members
		// are accessible
		
		System.out.println("The protected member "+c);
		  System.out.println("The public member "+d);
	}
}
