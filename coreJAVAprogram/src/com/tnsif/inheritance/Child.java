package com.tnsif.inheritance;
//demo for single inheritance
public class Child extends Father{
String cycle="pink";
void read() {
	System.out.println("Java");
}

 public static void main(String[] args) {
	 Child c = new Child();
	 System.out.println(c.money);
	 System.out.println(c.car);
	 c.drink();
	 System.out.println(c.cycle);
	 c.read();
 }
}