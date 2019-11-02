package lgscourse.javacore.lesson11.CarsArrayLists;

public class Car {
	private int horsepower;
	private int year;
	SteeringWheel steeringWheel;
	Engine engine;
	
		
	public Car(int horsepower, int year, SteeringWheel steeringWheel, Engine engine) {
		this.horsepower = horsepower;
		this.year = year;
		this.steeringWheel = steeringWheel;
		this.engine = engine;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	
	public int getYear() {
		return year;
	}


	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}


	public Engine getEngine() {
		return engine;
	}
	
	
	@Override
	public String toString() {
		return "\nCar : horsepower = " + horsepower + ", year of manufacturing = " + year + "\n    " + steeringWheel + "\n    " + engine;
	}
	
}
