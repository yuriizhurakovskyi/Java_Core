package lgscourse.javacore.lesson18.min;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	    addElements(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// метод get не перевіряє тип вже існуючих елементів, а просто повертає його,
			//а System.out.println виводить toString для будь-якого об'єкту 
		 } 
		
		
		//тут винекне помилка компіляції, бо для посилання list явно вказаний тип елементів List<Integer>, дані інших типу викликатимуть помилку
		// при добавлненні в list
		
	/*  list.add("Hello");
		list.add("this");
		list.add(1.2);
		list.add("is");
		list.add(3.0f);
		list.add("addElements");
		list.add(new String("1.4"));
		list.add("method");
		list.add(new Object());
	*/
		
	//	list.add(Integer.parseInt("Hello")); // виникне java.lang.NumberFormatException, оскільки до String не можливо привести до типу Integer
		
		
	}
	
	public static void addElements(List list) {
		// В даному випадку добавлення об'єктів String чи інших об'єктів є можливим, оскільки ми використовуємо 
		// посилання інтерфейсу List, не вказавши типу елементів його і в такому випадку дефолтно типом елементів стає Object
		list.add("Hello");
		list.add(1);
		list.add("this");
		list.add(1.2);
		list.add("is");
		list.add(3.0f);
		list.add("addElements");
		list.add(new String("1.4"));
		list.add("method");
		list.add(new Object());
	}

}
