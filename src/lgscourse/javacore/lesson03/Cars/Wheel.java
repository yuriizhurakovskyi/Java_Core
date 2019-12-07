package lgscourse.javacore.lesson03.Cars;

public class Wheel {
	private String model;
	private float overallWidth;
	private float wheelDiameter;
	private int offset;
	private int pcd;
	private int holes;
	private float centralHole;
	public Wheel() {
		this.model = "MOMO Sentry S";
		this.overallWidth = 5.5f;
		this.wheelDiameter = 19f;
		this.offset = 40;
		this.pcd = 112;
		this.holes = 5;
		this.centralHole = 79.6f;
	}
	public Wheel(String model, float overallWidth, float wheelDiameter, int offset, int pcd, int holes,
			float centralHole) {
		this.model = model;
		this.overallWidth = overallWidth;
		this.wheelDiameter = wheelDiameter;
		this.offset = offset;
		this.pcd = pcd;
		this.holes = holes;
		this.centralHole = centralHole;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getOverallWidth() {
		return overallWidth;
	}
	public void setOverallWidth(float overallWidth) {
		this.overallWidth = overallWidth;
	}
	public float getWheelDiameter() {
		return wheelDiameter;
	}
	public void setWheelDiameter(float wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getPcd() {
		return pcd;
	}
	public void setPcd(int pcd) {
		this.pcd = pcd;
	}
	public int getHoles() {
		return holes;
	}
	public void setHoles(int holes) {
		this.holes = holes;
	}
	public float getCentralHole() {
		return centralHole;
	}
	public void setCentralHole(float centralHole) {
		this.centralHole = centralHole;
	}
	@Override
	public String toString() {
		return "Wheel [Model : " + model + "; Overall width, inch : " + overallWidth + "; Wheel diameter, inch : " + wheelDiameter
				+ "; Offset, mm : " + offset + "; Pitch circle diameter, mm : " + pcd + "; Holes: " + holes + ", Central hole, mm : " + centralHole + "]";
	}
	
	
	public void changeWheelsParameters(float overallWidth, float wheelDiameter, int offset, int pcd, int holes, float centralHole) {
		this.overallWidth = overallWidth;
		this.wheelDiameter = wheelDiameter;
		this.offset = offset; 
		this.pcd = pcd;
		this.holes = holes;
		this.centralHole = centralHole;
	}
	
	public void changeWheels(String model, float overallWidth, float wheelDiameter, int offset, int pcd, int holes,
			float centralHole) {
		this.model = model;
		this.overallWidth = overallWidth;
		this.wheelDiameter = wheelDiameter;
		this.offset = offset;
		this.pcd = pcd;
		this.holes = holes;
		this.centralHole = centralHole;
	}
}
