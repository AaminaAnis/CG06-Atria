package com.tnsif.multipleinterface;
interface Greet{
	void hi();
}
class Hello implements Greet{

@Override
public void hi() {
	// TODO Auto-generated method stub
	System.out.println("hii");
}
}
public class FuntionalInterface {
public static void main(String[] args) {
	Hello h = new Hello();
	h.hi();
}
}
