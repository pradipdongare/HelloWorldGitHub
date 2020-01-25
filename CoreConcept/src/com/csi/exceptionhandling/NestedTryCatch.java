  package com.csi.exceptionhandling;

public class NestedTryCatch {
public static void main(String[] args) {
	try {
		int x=10,y;
		int k[]=new int[5];
		System.out.println(k.length);
		int i;
		for(i=3;i<args.length;i++){
			System.out.println("values retrieve through command line are "+args[i]);
		}
		try {
			int j;
			for(j=0;j<args.length;j++){
				k[j]=Integer.parseInt(args[j]);
				x=x/k[j];
				System.out.println(x);
			}
			
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("\n Exception is :"+ae);
			System.out.println("Value is divided by zero is not allowed ");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception is :"+e);
		System.out.println("my name is Pradip");
	}

}
}
    