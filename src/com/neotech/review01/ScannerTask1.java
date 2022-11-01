package com.neotech.review01;

import java.util.Scanner;

public class ScannerTask1 {
public static void main (String [] args) {
	

//	Ask the user to enter 2 numbers 
//	ask the user for the operator (+,-,*/)
//	Solve it using if-else AND using switch
	
	Scanner scan = new Scanner (System.in);	
	int num1, num2;
	int result = 0; //THIS IS TO DO DIF WAY THAN SYSOUT BELOW, NEEDS TO BE INTIALIZED
	
	System.out.println("Please enter a number");
	num1 = scan.nextInt();
	System.out.println("Please enter another number");
	num2 = scan.nextInt();
	
	System.out.println("Please enter the operator (+.-.*./)");
	String operator = scan.next();
	
	if (operator.equals("+")) 
	{
		//System.out.println("The result is " + (num1 + num2));
		result = num1 + num2;
	}
	else if (operator.equals("-"))
			{
		//System.out.println("The result is " + (num1 - num2));
		result = num1 = num2;
			}
	else if (operator.equals("*"))
	{
		//System.out.println("The result is " + (num1 * num2));
		result = num1 * num2;
	}
	else if (operator.equals("/"))
	{
		//System.out.println("The result is " + (num1 / num2));
		result = num1 / num2;
	}
	else 
	{
		System.out.println("Invalid operator!");
	}
	System.out.println("The result is: " + result);
	
	
}
}
