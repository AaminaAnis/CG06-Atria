package com.tnsif.multithreading;

public class Tsynch {
	public static void main(String[] args) {
		Example e=new Example();
		
		Test t1=new Test(e);
		Test t2=new Test(e);
		Test t3=new Test(e);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
