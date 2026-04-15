package com.tnsif.interfacedemo;
interface Smartdevice{
	void turnOn();
	void turnOff();
	void getStatus();
}
class SmartLight implements Smartdevice{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("off");
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		System.out.println("on or off");
	}
	
}
public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartLight s= new SmartLight();
s.turnOn();
s.turnOff();
s.getStatus();
	}

}
