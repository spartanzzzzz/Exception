package com.obsqura.training.exception;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException ar) {
            System.out.println("Error: " + ar.getMessage());
            System.out.println("You can't divide a number by 0");
        }
    }
}



