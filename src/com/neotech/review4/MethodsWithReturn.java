package com.neotech.review4;

public class MethodsWithReturn {
public static void main (String [] args) {
	String name = "Cierra";
	int numOfChars = name.length();
	
	System.out.println("The length of " + name + " is " + numOfChars);
	
	MethodsWithReturn m = new MethodsWithReturn();
	boolean res = m.isOdd(57);
	System.out.println("The number 57 is odd? " + res);
} 

boolean isOdd (int num) 
{
	boolean result;
	if (num % 2 == 1 )
	{ 
		result = true;
	}
	else {
		result = false;
	}
	return result;
	}
	
	
	
	
	
}	

