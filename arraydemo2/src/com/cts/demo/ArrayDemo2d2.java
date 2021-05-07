package com.cts.demo;

public class ArrayDemo2d2 {

	public static void main(String[] args) {
		  
		  int num[][]= {{1,2,3},{4,5,6},{7,8,9}};
		   System.out.println("The number of rows "+num.length); //3
		   System.out.println("The number of cols in row 0"+num[0].length); // So the line returns the number of cols/elements in row 0
 		   for(int row=0;row<num.length;row++)
		  {
			  for(int col=0;col<num[row].length;col++)
			  {
				  System.out.print(num[row][col]+"\t");
			  }
		      System.out.println();
		  }

	}

}
