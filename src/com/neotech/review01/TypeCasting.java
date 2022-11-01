package com.neotech.review01;

public class TypeCasting {
	
	public static void main (String [] args) {
	
	//byte < short < int < long < float < double 	
	
		int intNumber = 50;
		//widening/implicit casting/automatically
		double doubleNumber = intNumber;
		
	System.out.println("intNumber -> " + intNumber);
	System.out.println("doubleNumber -> " + doubleNumber);
	
	//Narrowing/explicit casting/manually  - making smaller, it flags you
	byte byteNumber = (byte) intNumber; //NARROWING 
					//put here (byte) manually 
	
	//reasinging 
	intNumber = 670;
	
	byte b2 = (byte) intNumber; 
	System.out.println("b2 -> " + b2);
	//We WILL lose data here it prints as -98 
	
	
	byte b3 = 90; 
	int i3 = b3;
	
	
	
	
	
}
}
