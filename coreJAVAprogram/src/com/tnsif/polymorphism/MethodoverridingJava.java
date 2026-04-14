package com.tnsif.polymorphism;

 class Father {
int a =9;
void drink() {
	System.out.println("tea");
}
}
class son extends Father{
	@Override
	void drink() {
		System.out.println("Frooti");
	}
}



public class MethodoverridingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son s = new son();
s.drink();
	}

}
