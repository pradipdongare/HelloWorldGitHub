package com.csi.string;
class a {
	public a(){
		System.out.println("I am from  constructor");
	}
	public a(int b){
		System.out.println(b);
	}
	
}
class b extends a{
	public void a(int b){
		System.out.println(b);
	}
}
public class PolymorphismConcept {
public static void main(String[] args) {
	b bb= new b();
	bb.a(21);
//	a a1= new a();
	a a2= new a(23);
}
}
