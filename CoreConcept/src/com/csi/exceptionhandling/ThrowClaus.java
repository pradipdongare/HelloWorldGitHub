package com.csi.exceptionhandling;
class ThrowException1{
	public static void AException(){
		try {
			throw new NullPointerException("\n Explict null pointer Exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is :"+e);
		}
		
	}
}
public class ThrowClaus {
	public static void main(String[] args) {
		ThrowException1.AException();
	}
}
