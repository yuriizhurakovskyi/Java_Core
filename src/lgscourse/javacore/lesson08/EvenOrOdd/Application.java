package lgscourse.javacore.lesson08.EvenOrOdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			double number = Double.parseDouble(bufferedReader.readLine());
			if(number % 1 == 0)
			{
				if(number % 2 == 0 )
					System.out.println((int) number + " - парне");
				else System.out.println((int) number + " - непарне");
			}
			else System.out.println("Помилка. Не ціле число");
		} catch (NumberFormatException e) {
			System.out.println("Введені дані не є числом");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
