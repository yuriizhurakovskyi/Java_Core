package lgscourse.javacore.lesson11.CarsArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Car[][] cars = getNewRandomSizeNullCarArray();
		fillRandomCarArray(cars);
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			showMenu();
			String choice = scanner.nextLine();
			if("exit".equalsIgnoreCase(choice))
				break;
			switch(choice) {
			case "1":
				showCars(cars);
				break;
			case "2":
				fillOneRandomCarArray(cars);
				break;
			case "3":
				fillRandomCarArray(cars);
				break;
			default:
				System.out.println("Некоректний ввід.");
			}
		}while(true);
	}
	
	public static void showMenu() {
		System.out.println("Меню :");
		System.out.println("1. Вивести toString() даних елементів масиву на консоль.");
		System.out.println("2. Для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто. ");
		System.out.println("3. Для всіх обєктів даного масиву засетити різні обєкти класу Авто ");
		System.out.println("exit - щоб вийти");
	}
	
	public static Car[][] getNewRandomSizeNullCarArray() {
		return new Car[new Random().nextInt(100)+1][new Random().nextInt(100)+1];
	}
	
	public static void showCars(Car[][] cars) {
		System.out.println("\n\n\n");
		System.out.println(Arrays.deepToString(cars));
		System.out.println("\n\n\n");
	}
	
	public static void fillRandomCarArray(Car[][] cars) {
		Random random = new Random();
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				cars[i][j] = new Car(random.nextInt(110-45+1)+45,
						random.nextInt(2019-2000+1)+2000, 
						new SteeringWheel(random.nextInt(49-35+1)+35, Material.values()[random.nextInt(2)]),
						new Engine(random.nextInt(16-2+1)+2));
			}
		}
	}
	
	public static void fillOneRandomCarArray(Car[][] cars) {
		Random random = new Random();
		Car car = new Car(random.nextInt(110-45+1)+45,
				random.nextInt(2019-2000+1)+2000, 
				new SteeringWheel(random.nextInt(49-35+1)+35, Material.values()[random.nextInt(2)]),
				new Engine(random.nextInt(16-2+1)+2));
		for (int i = 0; i < cars.length; i++) {
			Arrays.fill(cars[i], car);
		}
	}
}
