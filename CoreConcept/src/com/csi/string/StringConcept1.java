package com.csi.string;

public class StringConcept1 {
public static void main(String[] args) {
	String s1= "PRADIP";
	String s3= "PRADIP";
	char ar[]= {'P','R','A','D','I','P'};
	String s2= new String(ar);
	// System.out.println(s3.equals(s1));
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(ar);
	String s5=s1.concat(" "+s2);
	System.out.println(s5);
	String s6= s3+" Prakash";
	System.out.println(s6);
	char c1=s1.charAt(1);
	System.out.println(c1);
}
}
