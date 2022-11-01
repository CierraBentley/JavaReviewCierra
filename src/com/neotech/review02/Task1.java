package com.neotech.review02;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
//ask user to enter a positive number and add it to total
//he should enter -1 to STOP -1 will not be added to total
	
Scanner scan = new Scanner(System.in);

int num = 0;
int total =0;
//FIRST WAY TO DO IT USING WHILE 
//System.out.println("Please enter a positive number! To STOP ener -1");
//num = scan.nextInt();

//while (num != -1) {
	//total += num;
	//System.out.println("Please enter a positive number! To STOP enter -1");
	//num = scan.nextInt();
//}

//System.out.println("Total = " + total);
//------------------------------------------------------------------------------
//							USING DO WHILE 

//do {
//	System.out.println("Please enter a positive number! To STOP enter -1");
//	num = scan.nextInt();
//	if (num != -1) {
//		total += num;
//	 }
//} while (num != -1);
//System.out.println("Total = " + total);

//-----------------------------------------------------------------------------------
	
//							USING FOR LOOP
	
	//1st iteration -> 1. initialization; 2. check condition 
//next iteration -> 1. increment 2. check condition 
//for (int i=1; i<=3; i++) {
	//System.out.println(i);
//}
	
System.out.println("Please enter a psoitive number! To STOP enter -1");
num = scan.nextInt();
for (; num != -1;) {
	total += num;
	System.out.println("Please enter a positive number! To STOP enter -1");
	num = scan.nextInt();
}
	
System.out.println("Total = " + total);

	
	
	
	
	
	
	

	
	}

}
