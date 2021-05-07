package com.cts.pack1;

public class B {

	   public void display()
	   {
		   A a=new A();
		   // The private member of class A is not accessible from class B which is in the same package
		  //System.out.println("The private member "+a.a);
	       // The default member of class A is accessible from B  
		   System.out.println("The default member "+a.b);
		   // protected members are meant for inheritance 
		   // which means subclasses can access but if the 
		   // non subclass is in the same package , it can access the protected member
	       System.out.println("The protected member "+a.c);  
	       System.out.println("The public member "+a.d);
	   }  
}
