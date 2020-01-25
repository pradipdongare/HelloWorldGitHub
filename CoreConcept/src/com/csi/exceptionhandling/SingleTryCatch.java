package com.csi.exceptionhandling;

public class SingleTryCatch {
public static void main(String[] args) {
try {int x=5;
int y= 0;
//int z=x/y;
System.out.println(x/y);
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(""+e);

}
System.out.println("A number cannot be divided by zero");

	
}
}
