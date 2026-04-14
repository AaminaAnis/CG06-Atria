package com.tnsif.encpsulationdemo;
class Human1{
	//separate class with data members and member functions
	private int age;
	private String name; //data members
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//member functions

public class Encapsulationprogram {
	public static void main(String[] args) {
		Human1 h= new Human1();
		h.setAge(21);
		h.setName("Aamina");
		System.out.println(h.getAge());
		System.out.println(h.getName());
		h.setAge(11);
		h.setName("Ali");
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
	}

}
