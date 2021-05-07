package com.cts.demo;

public class StringEqualsDemo {

	public static void main(String[] args) {
		// In the lines 9 and 10 , the object hello is created in  line 8 only
		// In line 9 when we are againg writing str2="Hello" it, there will be a check whether we already have the object Hello in the String pool.
       //If the object is there, both str1 and str2 will point the same string Hello 
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		System.out.println(str1==str2); // true    // It is checking whether
		// both the reference variable are pointing to the same object or not
		System.out.println(str1.equals(str2)); // true
        // while using equals it compares the content and not the addresses.
	    System.out.println(str3==str4); // false
        System.out.println(str3.equals(str4));   //true
	    
	}

}
