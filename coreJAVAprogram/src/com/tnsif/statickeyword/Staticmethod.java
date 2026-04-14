package com.tnsif.statickeyword;
//demo for static method
class PaymentGateway{
	static void showNotification() {
		System.out.println("supported banks are hdfc and sbi");
	}
}
public class Staticmethod {
public static void main(String[] args) {
	PaymentGateway.showNotification();
}
}
