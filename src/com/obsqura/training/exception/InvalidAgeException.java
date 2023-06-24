package com.obsqura.training.exception;

public class InvalidAgeException extends Throwable {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
        super(message);
	}
	
	public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new InvalidAgeException("Invalid age: " + age);
            }
           
        } catch (InvalidAgeException a) {
            System.out.println(a.getMessage());
          
        }
    }

}


