package com.array;

public class Array1 {
	public static void main(String[] args) {
	/*	int len , i;
		int number [] = {1,2,3,4,5,6};
		len = number.length;
		for ( i = 0; i<len;i++ )
		{
			System.out.println("Number  " + i + " is " + number[i]);
		}*/

		int large ,i,len;
		
		int[] number = {1,2,4,5,3};
		len = number.length;
		large = number[0];
		System.out.println(number[0]);
		
		for(i=0;i<len;i++) {
			if (number[i] > large)
			{
			large = number[i];
			}
		}
		
		
		System.out.println(large);
		
	}
	}

