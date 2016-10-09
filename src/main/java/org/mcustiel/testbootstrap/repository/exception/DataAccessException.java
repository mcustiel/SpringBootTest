package org.mcustiel.testbootstrap.repository.exception;

public class DataAccessException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = -4944163503532637959L;

    public DataAccessException() {
	super();
    }

    public DataAccessException(String message) {
	super(message);
    }
}
