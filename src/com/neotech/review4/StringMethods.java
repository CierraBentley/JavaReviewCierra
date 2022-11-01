package com.neotech.review4;

public class StringMethods {
public static void main (String [] args) {
	String str = "Cierra";
	
	System.out.println(str.length()); //PRINTS -> 6
	System.out.println(str.isEmpty()); // PRINTS -> false 
	
	System.out.println(str.toUpperCase()); //PRINTS -> CIERRA	
	System.out.println(str.toLowerCase()); // PRINTS -> cierra 
	
	System.out.println(str); //PRINTS -> Cierra
	
	boolean equal = str.equals("cierra");
	System.out.println(equal);
	
	System.out.println(str.equalsIgnoreCase("cierra"));
	
	System.out.println(str.contains("RR"));
	
	
	
}
}
