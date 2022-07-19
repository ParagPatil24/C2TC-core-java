package com.training;

public class Array2 {

	public static void main(String[] args) {
		// To find the position number from array to give  sum of number is equal to given
		    //Sum should be
		 int S= 21;
		 // Number of array are given
		  int [] Array= {1,2,3,4,5,6,7,8,9};
		  
		  
		  for(int i=0;i<Array.length-1;i++) {
			  int a=Array[i];
			 
			  for(int j=i+1 ;j<Array.length-1;j++) {
				  a+=Array[j];
				  
				  if(a==S) {
					  System.out.println("from position: "+(i+1)+" To position: "+(j+1));
					  
				  }
				  else if(a>S) {
					  break;
				  }
				  
			  }
			
		  }
		  System.out.println("\nThis Positions of Array will give sum of: "+S);
		  
		  
		}

	}


