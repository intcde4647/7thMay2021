package com.cts.demo;

public class Demo2 {

	// How we can create String objects 
	public static void main(String[] args) {
	     // The below approach of creating a string object is reffered  
		String str1="Hello";  // str1 is reference variable which is
	      // holding the address of the string object
	      String str2=new String("Hello"); // We create a string object
	      // with new keyword and initialised it with the String object Hello
          char ch[]= {'a','b','c'};
          String str3=new String(ch);
          byte b[]= {65,66,67};
          String str4=new String(b);
          System.out.println(str1);
          System.out.println(str2);
          System.out.println(str3);
          System.out.println(str4);
	}

}
