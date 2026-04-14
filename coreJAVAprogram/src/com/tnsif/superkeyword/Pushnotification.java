package com.tnsif.superkeyword;

class Notification {
String mes="default notification";
}
public class Pushnotification extends Notification{
	String mes="Push notification";
void display() {
	System.out.println("message of child    :"+mes);
	System.out.println("message of parent    :"+super.mes);
}
public static void main(String[] args) {
	Pushnotification n = new Pushnotification();
	n.display();
}
}
