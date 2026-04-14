package com.tnsif.superkeyword;
class payment{
	void process() {
		System.out.println("processing the payment");
	}
}
public class Gpay extends payment {
void process() {
	System.out.println("processing via Gpay");
}
void display() {
	process();
	super.process();
}
public static void main(String[] args) {
	Gpay g = new Gpay();
	g.display();
}
}
