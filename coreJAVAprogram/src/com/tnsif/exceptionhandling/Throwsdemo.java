package com.tnsif.exceptionhandling;
// demo for throws keyword
public class Throwsdemo {
        static void divide()throws ArithmeticException{
                int a=10/0;
        }
        public static void main(String[] args) {
                try {
                        divide();
                }
                catch(ArithmeticException e) {
                        System.out.println("cannot be divide by zero");
                }
        }

}