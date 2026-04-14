package com.tnsif.polymorphism;
class Personee {
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void display() {
	System.out.println(name+id);
}
}
public class Person
{
	public static void main(String[] args) {
		Personee p= new Personee();
		p.setName("Alia");
		p.setId(12);
		p.display();
	}
}
