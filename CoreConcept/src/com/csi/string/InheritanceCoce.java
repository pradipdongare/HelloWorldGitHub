package com.csi.string;
class person{
	
 void pp(int Id, String name){
	System.out.println(" :"+ Id +"\n :"+name);
}}

	class Sports extends person{
	void push(){
		System.out.println("My name is Pradip");
	
	}
}
public class InheritanceCoce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sports ss= new Sports();
ss.push();
ss.pp(21, "PRADIP");
	}

}
