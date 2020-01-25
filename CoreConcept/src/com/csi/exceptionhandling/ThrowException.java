package com.csi.exceptionhandling;

public class ThrowException {
	/*void get(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
public static void main(String[] args) {
	/*try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}*/
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(""+e);
	}
	
}
}
