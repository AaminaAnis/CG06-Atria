package com.tnsif.abstractiondemo;
//demo for abstraction
abstract class Demo{
	public void calling() {//concrete method
		System.out.println("calling");
	}
	public abstract void AllIntegration();//abstract method
	public abstract void Satellitedemo();
	public abstract void healthmonitoring();
}	
 class Test1 extends Demo{
	
	@Override
public void AllIntegration() {
	System.out.println("wlcm");
}

@Override
public void Satellitedemo() {
System.out.println("satellite");	
}

@Override
public void healthmonitoring() {
System.out.println("wlcm to java");
}
 }
	public class Abstractiondemo {
public static void main(String[] args) {
Test1 n = new Test1();
	n.AllIntegration();
	n.Satellitedemo();
	n.healthmonitoring();
	
}
	}
 
 
