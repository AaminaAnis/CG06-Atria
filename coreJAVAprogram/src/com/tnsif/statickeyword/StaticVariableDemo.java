package com.tnsif.statickeyword;
//demo for static variable
class Student{
	String name;
	int id;
	static String collegename="Atria";
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.collegename = collegename;
	}

	void showdetails() {
		System.out.println("Student :"+name+"ID :"+id+"College name :"+collegename);
		}
	
}












public class StaticVariableDemo {
	public static void main(String[] args) {
		Student s1=new Student("Aamina",2);
		Student s2=new Student("fhg",4);
		Student s3=new Student("jhefvg",3);
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
	}

}
