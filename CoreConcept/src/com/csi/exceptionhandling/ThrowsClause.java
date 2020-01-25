package com.csi.exceptionhandling;
 class BException{
	public static void get()  throws Exception 		
	 {throw new IllegalAccessException("Exception ");
	 
}
}
public class ThrowsClause {
	
	
	public static void main(String[] args){
		BException b=new BException();	
		try{
			b.get();
		}
		catch(Exception e){
			System.out.println("testing :"+e);
		}
	}

}
