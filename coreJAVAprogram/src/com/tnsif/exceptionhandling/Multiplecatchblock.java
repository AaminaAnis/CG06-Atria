package com.tnsif.exceptionhandling;

public class Multiplecatchblock {
public static void main(String[] args) {
	int number []= new int[4];
try {
	int i=number[8];
}
catch(ArithmeticException h){
	System.out.println(h);
}
catch(StringIndexOutOfBoundsException f) {
	System.out.println(f);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
catch(Exception g) {
	System.out.println(g);
}
}
}
