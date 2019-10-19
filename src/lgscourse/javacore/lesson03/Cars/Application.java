package lgscourse.javacore.lesson03.Cars;

public class Application {

	public static void main(String[] args) {
		Car car = new Car("Saleen S7", 399, "Ford Windsor 427, naturally aspirated OHV V8", 7, 375000,
				"AFCO 1251-1154 D154 1978-Up GM Metric Pads", 
				new Coachwork("Sports car (S), 2-door coupe", 2, 1981, 1041, 4774, 1300, 1247, 76, 76),
				new Wheel("Yellow & Black OH5SP", 27f, 11.6f, 38, 112, 5, 79.6f),
				new SteeringWheel());
		
		System.out.println(car);
		
		car.changeCarSteeringWheel(360, 3, "Round", "Black", "Black", "Universal Fit", "Honda");
		car.changeWheels("Red & Black OH5", 27f, 11.6f, 38, 112, 5, 79.6f);
		
		System.out.println(car);
		
		car.drive();
	}

}
