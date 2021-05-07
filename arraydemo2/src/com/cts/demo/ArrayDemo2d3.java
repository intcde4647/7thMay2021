package com.cts.demo;

public class ArrayDemo2d3 {

	public static void main(String[] args) {
		  
		  int num[][]= {{1,2,3},{4,5,6},{7,8,9}};
		   System.out.println("The number of rows "+num.length); //3
		    for(int ar[]: num)
		    {
		    	for(int x : ar)
		    	{
		    		System.out.print(x+"\t");
		    	}
		    	System.out.println();
		    }

	}

}
