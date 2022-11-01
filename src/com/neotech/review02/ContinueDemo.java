package com.neotech.review02;

public class ContinueDemo {
public static void main (String [] args) {
	
//Task - 5 minutes
//I want to celebrate my son's birthday from 
//11 to 20 (use for loop)
//but not 13th birthday because scared

	
	for (int age = 11; age <=20; age++)
	{
		if (age == 13) {
		continue;
		}
		System.out.println("Happy Birthday! You are " + age 
				+ " years old");
	}

	//WHILE LOOP
	System.out.println("-----------------");
	
	int age2 = 10;
	while (age2 <= 20) {
		age2++;
		if (age2 == 13) {
			System.out.println("No celebration.");
			continue;
		}
		System.out.println("Happy birthday! You are " + age2 
				+ " years old!");
	}
	
	
	
}
}
