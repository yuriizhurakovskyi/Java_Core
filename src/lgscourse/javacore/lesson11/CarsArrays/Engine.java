package lgscourse.javacore.lesson11.CarsArrays;

public class Engine {
	private int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	
	@Override
	public String toString() {
		return "Engine : Number of cylinders = " + numberOfCylinders;
	}
	
}
