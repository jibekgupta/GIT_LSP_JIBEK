package org.howard.edu.lsp.assignment5;

/**
 * Exception class specific to the IntegerSet class.
 * It extends the Exception class and is thrown when errors occur during operations on IntegerSet objects.
 */
public class IntegerSetException extends Exception {
    
    /**
     * Constructs a new IntegerSetException with the specified detail message.
     * 
     * @param message The detail message describing the error.
     */
    public IntegerSetException(String message) {
        super(message);
    }
}
