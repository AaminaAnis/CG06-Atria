package com.tnsif.exceptionhandling;
//demo for throw example
public class ThrowExample {
public static void main(String[] args) {
	int age=16;
	if(age<18) {
		//manually throw exception
		throw new ArithmeticException("you cannot vote");
	}
	else {
		System.out.println("you can vote");
	}
}
}
