package org.howard.edu.lsp.assignment4;

/**
 * IntgerSetException is an exception class specific to the IntegerSet class:
 * It extends the Exception class and is thrown when erroe occur during opertaions on IntegerSet objects.
 */

public class IntegerSetException extends Exception {
	/**
	 * Constructs a new IntegerSetException with the specified detail message.
	 * 
	 * @param message the detail message
	 */
	public IntegerSetException(String message) {
		super(message);
	}
}
