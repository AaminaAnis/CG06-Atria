package com.tnsif.exceptionhandling;

public class ArithematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1=50/5;
System.out.println(no1);
int no2=50/5;
System.out.println(no2);
try {
	int no3=50/0;
	
}
catch(ArithmeticException e) {
	System.out.println(e);
	
}
float no4=70/5;
System.out.println(no4);
	}

}
