package com.neotech.review01;

import java.util.Scanner;

public class Task2 {
public static void main (String [] args) {

	//If you are a boy
	//If you are rich -- Buy a Ferrari
	//otherwise -- Play soccer

	//If you are a girl
	//If you are rich -- Buy a LV bag
	//otherwise -- Read a book
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your gender (M/F)");
	char gender = scan.next().charAt(0);
	
	System.out.println("Are you rich? (true/false)");
	boolean rich = scan.nextBoolean();
	
	if (gender == 'M')
	{
		if (rich) 
		{
			System.out.println("Buy a Ferrari");
		}
		else 
		{
			System.out.println("Play soccer");
		}
		
	}
	if (gender.equals("F"))
	{
		if (rich)
		{
			System.out.println("Buy a LV bag");	
		}
		else
		{
			System.out.println("Read a book");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}
