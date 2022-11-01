package com.neotech.review03;

public class Max2DArray {

	public static void main(String[] args) {
		
		
	//FIND THE BIGGEST NUMBER IN A 2D ARRAY
		
		int[][] b = {
				{-2,3,5},
				{2,4,7},
				{8,1,-9},
				{3,5,1}
		};
		
		int biggest = b[0][0]; //we don't start with zero, numbers might be negative
		//starting with first number in array by doing b[0][0]
		
		for (int row = 0; row < b.length; row++)
		{
			for (int col = 0; col < b[row].length; col++)
			{
				int element = b[row][col];
				if (element > biggest )
				{
					//I found a bigger element 
					biggest = element;
				}
			}
		}
		
		System.out.println("The biggest number is: " + biggest);
		
		int max = b[0][0];
		for ( int[] row : b) 
		{
			for (int element : row ) 
			{
				if (element > max)
				{
					max = element;
				}
			}
		}
		
		System.out.println("The max number is: " + max); 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
