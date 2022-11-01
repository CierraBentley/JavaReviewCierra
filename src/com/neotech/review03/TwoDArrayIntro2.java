package com.neotech.review03;

public class TwoDArrayIntro2 {
public static void main (String [] args) {
	
	int [][] nums = 
		{ 
				{6, 3, 7},
				{2,4,8},
				{1,5,-4},
				{8,6,2}
					
				};
			
	System.out.println(nums[1][2]);
	System.out.println(nums[3][0]);
	
	System.out.println(nums[0][0]);
	System.out.println(nums[3][1]);
	
	System.out.println("=================");
	
	//Nested enhanced for loop
	for(int[] row : nums) {
		//iterate the row (1D-Array) with enhanced for loop
		for (int element : row) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	
	System.out.println("--------------------");
	
	//iterate with normal for loop 
	for(int[] row : nums) {
	for (int i =0; i < row.length; i++) 
	{
		System.out.print(row [i] + " ");
	}
	System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
