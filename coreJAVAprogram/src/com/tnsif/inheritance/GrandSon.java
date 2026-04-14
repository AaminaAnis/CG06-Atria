package com.tnsif.inheritance;

public class GrandSon extends Child{
	public static void main(String[] args) {
		GrandSon g= new GrandSon();
		 System.out.println(g.money);
		 System.out.println(g.car);
		 g.drink();
		 g.read();
	}

}
