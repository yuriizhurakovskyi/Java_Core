package lgscourse.javacore.lesson03.Cars;

public class SteeringWheel {
	private float wheelDiameter;
	private int spokeQuantity;
	private String shape;
	private String spokeColor;
	private String gripColor;
	private String fitment;
	private String brand;
	
	public SteeringWheel() {
		this.wheelDiameter = 390;
		this.spokeQuantity = 3;
		this.shape = "Round";
		this.spokeColor = "Black";
		this.gripColor = "Black";
		this.fitment = "Universal Fit";
		this.brand = "Nardi";
	}
	
	public SteeringWheel(float wheelDiameter, int spokeQuantity, String shape, String spokeColor, String gripColor,
			String fitment, String brand) {
		this.wheelDiameter = wheelDiameter;
		this.spokeQuantity = spokeQuantity;
		this.shape = shape;
		this.spokeColor = spokeColor;
		this.gripColor = gripColor;
		this.fitment = fitment;
		this.brand = brand;
	}
	public float getWheelDiameter() {
		return wheelDiameter;
	}
	public void setWheelDiameter(float wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	public int getSpokeQuantity() {
		return spokeQuantity;
	}
	public void setSpokeQuantity(int spokeQuantity) {
		this.spokeQuantity = spokeQuantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getSpokeColor() {
		return spokeColor;
	}
	public void setSpokeColor(String spokeColor) {
		this.spokeColor = spokeColor;
	}
	public String getGripColor() {
		return gripColor;
	}
	public void setGripColor(String gripColor) {
		this.gripColor = gripColor;
	}
	public String getFitment() {
		return fitment;
	}
	public void setFitment(String fitment) {
		this.fitment = fitment;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "SteeringWheel [Wheel diameter, mm : " + wheelDiameter + "; Spoke quantity : " + spokeQuantity + "; Shape : " + shape
				+ "; Spoke color=" + spokeColor + "; Grip color : " + gripColor + "; Fitment : " + fitment + "; Brand : "
				+ brand + "]";
	}
	public void changeSteeringWheelParameters(float wheelDiameter, int spokeQuantity, String shape, String spokeColor, String gripColor,
			String fitment) {
		this.wheelDiameter = wheelDiameter;
		this.spokeQuantity = spokeQuantity;
		this.shape = shape;
		this.spokeColor = spokeColor;
		this.gripColor = gripColor;
		this.fitment = fitment;
	}
	
	public void changeSteeringWheel(float wheelDiameter, int spokeQuantity, String shape, String spokeColor, String gripColor,
			String fitment, String brand) {
		this.wheelDiameter = wheelDiameter;
		this.spokeQuantity = spokeQuantity;
		this.shape = shape;
		this.spokeColor = spokeColor;
		this.gripColor = gripColor;
		this.fitment = fitment;
		this.brand = brand;
	}
	
}
