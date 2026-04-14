package com.tnsif.constructordemo;

public class Student {
	
		private String name;
		private int number;
		private int roll;
		//getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", number=" + number + ", roll=" + roll + "]";
		}
		
}
