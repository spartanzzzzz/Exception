package com.obsqura.training.exception;

public class ArithmeticExceptionThrow {
	public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException ("Cannot divide by zero");
        }

        return numerator / denominator;
    }

}
