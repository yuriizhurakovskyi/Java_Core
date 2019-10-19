package lgscourse.javacore.lesson03.Cars;

public class Car {
	private String model;
	private int maxSpeed;
	private String typeOfEgine;
	private int tankVolume;
	private int price;
	private String brakesInfo;
	private Coachwork coachwork;
	private Wheel wheel;
	private SteeringWheel steeringWheel;
	
	public Car(String model, int maxSpeed, String typeOfEgine, int tankVolume, int price, String brakesInfo, Coachwork coachwork,
			Wheel wheel, SteeringWheel steeringWheel) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.typeOfEgine = typeOfEgine;
		this.tankVolume = tankVolume;
		this.price = price;
		this.brakesInfo = brakesInfo;
		this.coachwork = coachwork;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getTypeOfEgine() {
		return typeOfEgine;
	}

	public void setTypeOfEgine(String typeOfEgine) {
		this.typeOfEgine = typeOfEgine;
	}

	public int getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume(int tankVolume) {
		this.tankVolume = tankVolume;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrakesInfo() {
		return brakesInfo;
	}

	public void setBrakesInfo(String brakesInfo) {
		this.brakesInfo = brakesInfo;
	}

	public Coachwork getCoachwork() {
		return coachwork;
	}

	public void setCoachwork(Coachwork coachwork) {
		this.coachwork = coachwork;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", typeOfEgine=" + typeOfEgine + ", tankVolume="
				+ tankVolume + ", price=" + price + ", brakesInfo=" + brakesInfo + ", coachwork=" + coachwork
				+ ", wheel=" + wheel + ", steeringWheel=" + steeringWheel + "]";
	}
	
	public void changeWheels(String model, float overallWidth, float wheelDiameter, int offset, int pcd, int holes,
			float centralHole)
	{
		this.wheel.changeWheels(model, overallWidth, wheelDiameter, offset, pcd, holes, centralHole);
	}
	
	public void changeCarSteeringWheel(float wheelDiameter, int spokeQuantity, String shape, String spokeColor, String gripColor,
	String fitment, String brand) {
		this.steeringWheel.changeSteeringWheel(wheelDiameter, spokeQuantity, shape, spokeColor, gripColor, fitment, brand);
	}
	
	public void drive() {
		System.out.println("The car is driving!");
	}
}
	
