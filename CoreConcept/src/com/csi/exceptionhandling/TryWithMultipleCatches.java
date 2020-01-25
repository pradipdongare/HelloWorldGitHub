package com.csi.exceptionhandling;


public class TryWithMultipleCatches {
public static void main(String[] args) {
try {
	int a[]={};

	System.out.println(a.length);
	int i;
	for(i=0;i<=a.length;i++)
	{
		System.out.println("value at position :"+i+"\n"+a[i] );
	}
	System.out.println("welcome to csi pune");
}	

catch
	(ArrayIndexOutOfBoundsException e){
		System.out.println("array is out of bound : plese check the upper bound of array");
	}
	catch(Exception e){
		System.out.println("exception"+e);
	}
		
	}
}
	


	





