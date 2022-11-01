package com.neotech.review01;

public class VariableDemo {
public static void main (String [] args) {

	//Declaring a variable
	String firstName;
	
	//Assigning a value (initialize)
	firstName = "Cierra";
	
	System.out.println("My first name is " + firstName);
	//This prints as "My name is Cierra 
	
	String lastName = "Bentley"; //Declared and assign variable at same time
	
	int age = 23;
	
	System.out.println(firstName + " " +lastName + " " + age);
	//Prints "Cierra Bentley 23" 
	
	//After 5 yers 
	//Reassinging value to variable 
	age +=5;
	lastName = "Damat";
	System.out.println("After 5 years!");
	System.out.println(firstName + " " + lastName + " " + age);
	//Cierra Damat 28
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
