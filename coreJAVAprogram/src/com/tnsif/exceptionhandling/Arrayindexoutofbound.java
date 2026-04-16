package com.tnsif.exceptionhandling;

public class Arrayindexoutofbound {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	//int arr[]= new int[4];
System.out.println(arr.length);
try {
	int num=arr[10];
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
}
}