package com.training;

import java.util.Scanner;

public class Test2 {
void mathchallenge(int num1,int num2) {
	if(num2>num1) {
		System.out.println("true");
	}
	else {
		System.out.println("-1");
	}
}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num1=s.nextInt();
		int num2 =s.nextInt();
		Test2 obj = new Test2();
		obj.mathchallenge(num1, num2);
	}

}
