package com.cts.demo;

public class StringMethods {

	public static void main(String[] args) {
		String str1="hello";
		int length=str1.length();
		System.out.println("The length of str1 "+length);
		String subString=str1.substring(3);  // 3 is start index
		// of the substring
		System.out.println(subString);
		subString=str1.substring(1,3);  // start index, end index ( but the value picked will end index -1)
        System.out.println(subString);  
	}

}
