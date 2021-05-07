package com.cts.demo;

public class StringConcat2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		StringBuffer sb=new StringBuffer();
	    String result=sb.append(str1).append(str2).toString();
        System.out.println(result);
	}

}
