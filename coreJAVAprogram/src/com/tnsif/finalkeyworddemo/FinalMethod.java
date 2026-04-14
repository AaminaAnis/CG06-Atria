package com.tnsif.finalkeyworddemo;
final class Ecommerceplatform{
	final void calculate() {
		System.out.println("base offer10%");
	}
}
class Amazon extends Ecommerceplatform{ 
	//cant inherit
	@Override
	void calculate() {//cant override
		System.out.println("cant inherit");
	}
}
public class FinalMethod {
Amazon a= new Amazon();
}
