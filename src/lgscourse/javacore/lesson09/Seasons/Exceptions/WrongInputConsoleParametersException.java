/*
 * Homework LGS IA Enums, Months and Seasons, WrongInputConsoleParametersException Class
 * 
 * */

package lgscourse.javacore.lesson09.Seasons.Exceptions;


/**
 * @since java 1.8
 * @author Yurii 
 * @version 1.1
 **/
public class WrongInputConsoleParametersException extends Exception{
	
	/* message of exception */
	private String message;

	/* this is constructor */
	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}

	/* get message of exception */
	public String getMessage() {
		return message;
	}
	
	
}
