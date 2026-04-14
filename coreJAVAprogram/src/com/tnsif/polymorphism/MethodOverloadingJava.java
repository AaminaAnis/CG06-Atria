package com.tnsif.polymorphism;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverloadingJava {

	public static void main(String[] args) {
Calculator c= new Calculator();
System.out.println(c.add(1, 2));
System.out.println(c.add(12.5, 1.2));
System.out.println(c.add(3, 4, 5));
	}

}
