package com.exception;


public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		int pp []= new int[1];
		
		try
		{
			System.out.println(arr[7]);
			
			System.out.println("inside try block");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("inside catch block");
			
			
		}
		finally {
			System.out.println("inside finally block");
			
		}
		

	}

}