package com.neotech.review01;

import java.util.Scanner;

public class TAsk1Switch {
public static void main (String [] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the first number");
	int num1 = scan.nextInt();
	
	System.out.println("Please enter the second number");
	int num2 = scan.nextInt();
	
	System.out.println("Please enter the operator (+,-,*,/)");
	String operator = scan.next();
	
	int result = 0;
	
	switch (operator) 
	{
	case "+":
		result = num1 + num2;
		break;
	case "-":
		result = num1 - num2;
		break;
	case "*":
		result = num1 * num2;
		break;
	case "/":
		result = num1 / num2;
		break;
	default:
		System.out.println("Invalid operator");
	}
	
	System.out.println("The result is: " + result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
