package com.cts.demo;

public class StringConcat {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		String str3=str1+" "+str2;
		System.out.println(str3);
        String str4=str1.concat(" ").concat(str2);
        System.out.println(str4);
	}

}
