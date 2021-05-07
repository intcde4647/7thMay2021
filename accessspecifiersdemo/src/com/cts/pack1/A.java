package com.cts.pack1;

public class A {
  private int a;
  int b;
  protected int c;
  public int d;
  // all the access specifiers are accessed in the same class
  public void display()
  {
	  System.out.println("The private member "+a);
	  System.out.println("The default member "+b);
	  System.out.println("The protected member "+c);
	  System.out.println("The public member "+d);
  }
}
