package com.cts.pack2;

import com.cts.pack1.A;

public class D {
	public void display()
	   {
		   A a=new A();
		   
		 // System.out.println("The private member "+a.a);
	     // System.out.println("The default member "+a.b);
		 //System.out.println("The protected member "+a.c);  
	      // Non derived or not a subclass will be able to access only the public member
		   System.out.println("The public member "+a.d);
	   }  
}
