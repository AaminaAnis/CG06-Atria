package com.tnsif.exceptionhandling;

public class Stringindexoutofbound {
public static void main(String[] args) {
	String str="JAVA";

try {
char ch=str.charAt(20);
}
catch(StringIndexOutOfBoundsException r){
	System.out.println(r);
}
System.out.println("caught exception");
}
}