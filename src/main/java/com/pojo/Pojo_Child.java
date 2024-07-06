package com.pojo;



public class Pojo_Child  {
	
	
	public static void main(String[] args) {
		
		Pojo_Class f = new Pojo_Class();
		int a = f.getA();
		System.out.println(a);
		
		f.setA(13);
		int a2 = f.getA();
		System.out.println(a2);
	}
	
	
	
}
