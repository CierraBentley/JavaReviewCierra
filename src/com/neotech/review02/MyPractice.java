package com.neotech.review02;

import java.util.Scanner;

public class MyPractice {
public static void main (String [] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Hello, what is your name?");
	String name = scan.next();
	
	System.out.println("Nice to meet you, " + name);
	System.out.println("Do you have any pets, " + name + "?");
	String pet = scan.next();
	System.out.println("That is awesome, " + name + " :) ");
	
	
	
	
	
	
	
}
}
