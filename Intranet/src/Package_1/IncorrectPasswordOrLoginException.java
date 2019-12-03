package Package_1;

import java.lang.*;

/**
 */
public class IncorrectPasswordOrLoginException extends Exception {
    /**
     * @param message 
     */
    public IncorrectPasswordOrLoginException(String message) {
    	super(message);
    }

    /**
     * @param cause 
     * @param message 
     */
    public IncorrectPasswordOrLoginException(String message, Throwable cause) {
    	super(message, cause);
    }
}

