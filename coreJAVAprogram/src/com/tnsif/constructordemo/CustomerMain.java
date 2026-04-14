package com.tnsif.constructordemo;

import java.util.Scanner;

public class CustomerMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name = sc.next();
	System.out.println("enter the number");
	int number = sc.nextInt();
	System.out.println("enter the roll");
	int roll = sc.nextInt();
	Student s=new Student();
s.setName(name);
s.setNumber(number);
s.setRoll(roll);

}
}
