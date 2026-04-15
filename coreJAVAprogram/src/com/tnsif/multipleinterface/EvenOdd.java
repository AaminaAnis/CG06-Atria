package com.tnsif.multipleinterface;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		if (a%2==0) {
			System.out.println(a+" it is even");
		}
		else {
			System.out.println(a+ " it is odd");
		}
	}
}
