package com.csi.exceptionhandling;
class ThrowExcep{
	//for that we create object
	void get(){
		System.out.println(("I am from get method"));
	}
	static void run(){
		System.out.println("I am from run method");
		
	}
}
 public class TryCatchThrow {
	  static void Fun(){
			try {
				throw new NullPointerException("\n demo");
			} catch (NullPointerException ee) {
				// TODO: handle exception
				System.out.println("Caught inside fun(). ");
				throw ee;
			}
		}
	 
public static void main(String[] args) {
	ThrowExcep te= new ThrowExcep();
	te.get();
	te.run();
	
	try {
		//te.Fun();
		Fun();
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("Exception is :"+e);
	}
}
}
