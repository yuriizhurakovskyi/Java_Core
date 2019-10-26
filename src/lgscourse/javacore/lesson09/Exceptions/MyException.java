package lgscourse.javacore.lesson09.Exceptions;

public class MyException extends Exception{
	String message;

	public String getMessage() {
		return message;
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
