package com.tnsif.accessmodifierdemo;
//demo for public access modifier
public class PublicDemo {
	public int a=9;
	public String s="Aamina";
	public void display() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicDemo p= new PublicDemo();
		System.out.println(p.a);
		System.out.println(p.s);
p.display();
	}

}
