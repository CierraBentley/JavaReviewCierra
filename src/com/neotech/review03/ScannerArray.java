package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
	
	//Ask the user: HOw many numbers do you want to store in the array?
	//ask him to enter the numbers: Read numbers and enter them into the array 
	//Print the numbers from the array 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();
	
		//Declaring the array
		int[] array = new int[size]; 
	
		//Read the numbers and enter them into the array
		for (int i = 0; i < size; i++)
		{
			System.out.println("Enter a number: ");
			array[i] = input.nextInt();
		}
		
		//Print the numbers from the array
		System.out.println("Let's print the numbers from the array");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array [i] + ", ");
		}
		System.out.println();
		
		//Using enhanced for loop
		System.out.println("Let's print the numbers using enhanced for loop");
		for (int num : array) 
		{
			System.out.print(num + " ");
		}
		
		//HOMEWORK
		//PRINT THE SUM OF THE NUMBERS IN THE ARRAY
		//1. USING FOR LOOP
		//2. USING ENHANCED FOR LOOP
		
		
		
		
		
		
		
		
		
		
	}

}
