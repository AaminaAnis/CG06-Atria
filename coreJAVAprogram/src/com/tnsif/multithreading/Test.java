package com.tnsif.multithreading;

public class Test extends Thread{
	Example e;
	Test(Example e){
		this.e=e;
	}
	public void run() {
		e.display();
	}

}