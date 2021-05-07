package com.cts.demo;

public class StringToCharArray {

	public static void main(String[] args) {
		String str="Welcome";
		char ch[]=str.toCharArray(); // It will convert from string to character array
        for(char c : ch)
        {
        	System.out.println(c);
        }
	}

}
