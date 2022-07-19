package com.training;
import java.util.*;
public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int v=s.nextInt();
      Test m= new Test();
     m.mathchallange(v);
     
	}
	void  mathchallange (int num) {
		int sum=0;
		for(int i=1;i<=num;++i)
		{
			sum=sum+i;
		}
		
		 System.out.println(sum);
		//code for revers order
		// Start
		
		 String S= "TokenGiven"+sum;
		
		 char [] s= S.toCharArray();
		 for(int j =s.length -1;j>=0;j--)
		 System.out.print(s[j]);
		 
	//end
		
		//return num;
		
	}
}
