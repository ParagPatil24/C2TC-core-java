package com.exception;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			
			  int i , sum;
			  sum =10;
			  for (i = 1; i <3;i++)
			  {
				  sum = (sum/0);
			  
				  System.out.println(i);}
			
			//  throw new NullPointerException ("Heo");
			  
		  }
		  catch(ArithmeticException e){
			  System.out.println(e+" Having error");
			  
		  }
		  System.out.println("End of code with exception handled ");
		  
			}

		
	}


