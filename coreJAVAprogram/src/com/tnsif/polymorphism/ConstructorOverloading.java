package com.tnsif.polymorphism;
 class A{
	int A(int a ,int b){
		//constructor
		return a+b;
	}
	String A(String r)
	{
		return r;
	}
	int A(int s,int b, int d)	{
return s+b+d;	}
}
 public class ConstructorOverloading{
	public static void main(String[] args) {
		A obj= new A();
		
		System.out.println(obj.A("Aamina"));
		
	}

 }
