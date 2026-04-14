package com.tnsif.constructordemo;

public class conExample {
	conExample(){
		//constructor
		System.out.println("default con");
	}
	conExample(int a ,String b){
		//constructor
		System.out.println("2 parameters con");
	}
	conExample(int r)
	{
		System.out.println("1 para");
	}
	conExample(int s,int b, int d)	{
		System.out.println("3 para");
	}
	public static void main(String[] args) {
		conExample c=new conExample();
		conExample c1=new conExample(1,"xyz");
		conExample c2=new conExample(23);
		conExample c3=new conExample(3,"abc");
	}
}
