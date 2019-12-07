package lgscourse.javacore.lesson07;

public class Su_27 extends Airplane  implements TurboAcceleration, Lowobservable, Nuclearstrikeable {
	private int maxSpeed;
	private String color;
	private PlaneControl planeControl;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public PlaneControl getPlaneControl() {
		return planeControl;
	}

	public Su_27(float length, float width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.planeControl = new airplaneControl();
	}
	
	public Su_27(float length, float width, int weight, int maxSpeed, String color, PlaneControl planeControl) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.planeControl = planeControl;
	}

	@Override
	public void turboAcceleration() {
		System.out.println("Turbo Accelerating, speed " + (maxSpeed + (int)(Math.random()*1100)) + "km/h");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The plane is not visible " + (int)(Math.random()*120) + " min");
		
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Nuclear Strike, " + (1 + (int)(Math.random()*11)) + " bombs" );
	}

	@Override
	public String toString() {
		return "Su_27 [maxSpeed=" + maxSpeed + " km/h, color=" + color + ", Plane Control, length="
				+ length + ", width=" + width + ", weight=" + weight + "]";
	}

	
	

	
}
