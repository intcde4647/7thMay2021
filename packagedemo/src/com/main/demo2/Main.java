package com.main.demo2;

import com.cts.pack1.Employee;

public class Main {
// We want to work with both Employee classes 
	public static void main(String[] args) {
		Employee employee1=new Employee();
		// Whenever we write the class name alongwith its package name , it is 
		// called as Fully qualified name (FQN)
        com.xyz.pack1.Employee employee2=new com.xyz.pack1.Employee();
	}

}
