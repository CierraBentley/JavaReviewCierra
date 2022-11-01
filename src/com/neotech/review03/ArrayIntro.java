package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
//funny way 
		
	int a = 6;
	int b = 4;
	int c = 9;
	int d = 2;
	
	int sum = a + b + c + d;
	
	System.out.println("Sum is -> " + sum);
	
	
	//1st better way 
	
	int[] arr = new int [4];
	arr[0] = 6;
	arr[2] = 9;
	arr[3] = 2;
	arr[1] = 4;
	
	int sumArr = 0;
	for (int i = 0; i <=3; i++) 
	{ sumArr = sumArr + arr[i];
		
	}
		System.out.println("Sum of the array is -> " + sumArr);
		
	//2nd better way
		
		int [] arr2 = {6, 4, 9, 2} ;
		int sumArr2 = 0;
		for ( int num : arr2 )
		{
			sumArr2 += num;
		}
		
		System.out.println("Sum of the array2 is -> " + sum);
		
		System.out.println("================================");
		
		String[] animals = {"dog", "cat", "pig", "horse", "mouse"};
		for(int i =0; i < animals.length; i++)
		{
			System.out.print(animals[i] + " ");
		}
		
		System.out.println();
		for (String element : animals) 
		{
			System.out.print(element + " ");
			
		}
		
		System.out.println(); 
		
		//Print animals in reverse order
		
		for (int i = 4; i >= 0; i--) 
		{
			System.out.print(animals[i] + " " );
			}
		
		System.out.println(); 
		

		
		
		
		
		
		
	}

}
