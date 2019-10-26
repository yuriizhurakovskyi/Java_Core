package lgscourse.javacore.lesson09.Exceptions;

public class Methods {
	public static String add(double a, double b){
		if(a < 0 && b < 0)
			throw new IllegalArgumentException();
		return " " + a + " + " + b + " = " + (a + b);
	}
	
	public static String sub(double a, double b) throws MyException {
		if(a>0 && b>0)
			throw new MyException("PARAMETERS " + a + ">0 AND " + b + ">0");
		return " " + a + " - " + b + " = " + (a - b);
	}
	
	public static String mult(double a, double b) throws IllegalAccessException {
		if (a==0 && b==0)
			throw new IllegalAccessException();
		return " " + a + " * " + b + " = " + (a * b);
	}
	
	public static String div(double a, double b) {
		if((a==0 && b!=0) || (a!=0 && b==0))
			throw new ArithmeticException();
		return " " + a + " / " + b + " = " + (a / b);
	}
}
