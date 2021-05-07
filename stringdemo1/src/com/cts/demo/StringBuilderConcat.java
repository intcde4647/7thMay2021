package com.cts.demo;

public class StringBuilderConcat {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("World");
		sb1.append(sb2);
		
        System.out.println(sb1);
        
        StringBuilder sb3=new StringBuilder("Hi");
        sb3.append("Friends");
        System.out.println(sb3);
        
        StringBuilder sb4=new StringBuilder("Value");
        sb4.append(10);
        System.out.println(sb4);
	}

}
