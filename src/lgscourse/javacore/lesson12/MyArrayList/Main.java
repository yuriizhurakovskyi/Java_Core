package lgscourse.javacore.lesson12.MyArrayList;

import java.util.Random;

import lgscourse.javacore.lesson12.CarsArrayLists.Car;
import lgscourse.javacore.lesson12.CarsArrayLists.Engine;
import lgscourse.javacore.lesson12.CarsArrayLists.Material;
import lgscourse.javacore.lesson12.CarsArrayLists.SteeringWheel;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> names = new MyArrayList<>();
		names.add("Ivan");
		names.add("Pavlo");
		names.add("Ihor");
		names.add("Stepan");
		names.add("Oleh");
		System.out.println(names);
		names.remove(3);
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		
		MyArrayList<Double> doubles = new MyArrayList<>();
		doubles.add(6.4);
		doubles.add(9.2);
		doubles.add(8.0);
		doubles.add(4.54);
		doubles.add(3.4);
		System.out.println(doubles);
		doubles.remove(3);
		System.out.println(doubles);
		doubles.remove(1);
		System.out.println(doubles);
		doubles.remove(1);
		System.out.println(doubles);
		doubles.remove(0);
		System.out.println(doubles);
		doubles.remove(0);
		System.out.println(doubles);
		
		Random random = new Random();
		MyArrayList<Car> cars = new MyArrayList<>();
		for (int i = 0; i < 5; i++) {
			cars.add(new Car(random.nextInt(110-45+1)+45,
				random.nextInt(2019-2000+1)+2000, 
				new SteeringWheel(random.nextInt(49-35+1)+35, Material.values()[random.nextInt(2)]),
				new Engine(random.nextInt(16-2+1)+2)));
		}
		
		System.out.println(cars);
		cars.remove(3);
		cars.remove(1);
		System.out.println();
		System.out.println(cars);
		
	}

}
