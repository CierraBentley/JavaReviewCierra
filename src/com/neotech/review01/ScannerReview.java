package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 
 System.out.println("--------------------");
 System.out.println("Please enter your first name:");
 String firstName = scan.nextLine();
 System.out.println(("please nenter your last name"));
 String lastName = scan.nextLine();
 System.out.println("Your full name is: " + firstName + " " + lastName);

 System.out.println("PLease enter a int, boolean and double");
 int num = scan.nextInt();
 boolean b = scan.nextBoolean();
 double d = scan.nextDouble();
 
 System.out.println("Ypu entered: " + num + " " + b + " " + d);
 
 
	}

}
