package lgscourse.javacore.lesson12.CarsArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		ArrayList <ArrayList<Car>> cars = new ArrayList <ArrayList<Car>> ();
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
	
	
	public static void showCars(ArrayList<ArrayList<Car>> cars) {
		System.out.println("\n\n\n");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(Arrays.deepToString(cars.get(i).toArray()));
		}
		System.out.println("\n\n\n");
	}
	
	public static void fillRandomCarArray(ArrayList<ArrayList<Car>> cars) {
		Random random = new Random();
		int size1 = random.nextInt(100) + 1, size2 = 0;
		for (int i = 0; i < size1; i++) {
			cars.add(new ArrayList<Car>());
		}
		for (int k = 0; k < cars.size(); k++) {
			size2 = random.nextInt(100) + 1;
			for (int j = 0; j < size2; j++) {
				cars.get(k).add( new Car(random.nextInt(110-45+1)+45,
						random.nextInt(2019-2000+1)+2000, 
						new SteeringWheel(random.nextInt(49-35+1)+35, Material.values()[random.nextInt(2)]),
						new Engine(random.nextInt(16-2+1)+2)));
			}
		}
	}
	public static void fillOneRandomCarArray(ArrayList<ArrayList<Car>> cars) {
		Random random = new Random();
		Car car = new Car(random.nextInt(110-45+1)+45,
				random.nextInt(2019-2000+1)+2000, 
				new SteeringWheel(random.nextInt(49-35+1)+35, Material.values()[random.nextInt(2)]),
				new Engine(random.nextInt(16-2+1)+2));
		for (int i = 0; i < cars.size(); i++) {
			for (int j = 0; j < cars.get(i).size(); j++) {
				cars.get(i).remove(j);
				cars.get(i).add(j, car);
			}
		}
	}
}
