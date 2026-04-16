package com.tnsif.exceptionhandling;

public class Nestedtrycatch {

	public static void check() {//static method call by using class name
		// TODO Auto-generated method stub
String str1="TNS";
int slength=str1.length();
System.out.println("String length"+slength);
String str2= null;
int y=6;
try {
	try {
		System.out.println(str1.charAt(y));
	}
	catch(StringIndexOutOfBoundsException ex) {
		System.out.println(ex.getMessage());
	}
	System.out.println("string length "+str2.length());
}
catch(NullPointerException n) {
	System.out.println(n.getMessage());
}
	}


public static void main(String[] args) {
	Nestedtrycatch.check();
}
}