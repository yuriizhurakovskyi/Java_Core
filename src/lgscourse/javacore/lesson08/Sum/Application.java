package lgscourse.javacore.lesson08.Sum;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть першу цифру ");
		String string1 = scanner.next();
		System.out.println("Введіть другу цифру ");
		String string2 = scanner.next();
		if(isNumber(string1) && isNumber(string2))
		{
			double number1 = Double.parseDouble(string1);
			double number2 = Double.parseDouble(string2);
			if(isWholeNumber(number1)&&isWholeNumber(number2))
				sum((int)number1, (int)number2);
			else System.out.println("Некоректно введені дані");
		}else System.out.println("Некоректно введені дані");
		
	}
	private static boolean isNumber(String string) {
		try {
			double number = Double.parseDouble(string);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	private static boolean isWholeNumber(double number) {
		if(number % 1 == 0)
			return true;
		return false;
	}
	
	private static void sum(int a, int b) {
		System.out.println(a + b);
	}

}
