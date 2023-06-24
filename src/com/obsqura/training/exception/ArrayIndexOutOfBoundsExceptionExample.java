package com.obsqura.training.exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            int value = arr[10];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.err.println(e);
            System.out.println("Array is out of Bound");
        }
    }

}
