package com.cts.demo;

public class ArrayDemo2d {

	public static void main(String[] args) {
		  int num[][]; // The line signifies that it is a 2-D array
		  num=new int[3][4];  // 3 is number of rows and 4 is nummber of columns
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
