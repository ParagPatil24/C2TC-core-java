package com.exception;

import java.nio.channels.AlreadyBoundException;

public class OutOfBound {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
try {
int arr[] = {1,3,5,7};
System.out.println(arr[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e+" \nsome Error in code");
	}
finally {
	System.out.println("In Finally block");
}
	}

}