package myStore;

import java.util.*;


public class Array1 {

	public static void main(String[] args) {
		
		int[] A= {0,2,4,1,3};
		int q=A.length;
		System.out.println("length="+q);
		
		for(int i=0;i< A.length;i++) {
			
			try {
				A[i]=A[(A[i]+3)%q];
				
				}
				catch (Exception e){
					System.out.println("ArrayIndexOutOfBoundsException'");
				}
			
			System.out.println(A[i]);
			
		}
		int[][] c= {{1,2},{7,8},{6,9}};
		
		System.out.println(Arrays.toString(A));
		System.out.println(A[0]);
		System.out.println(Arrays.deepToString(c));
	}

	
}
