package lgscourse.javacore.lesson07;


public abstract class Airplane{
	protected float length;
	protected float width;
	protected int weight;
	
	public Airplane(float length, float width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public void startEngines() {
		System.out.println("Time before departure is " +(20 + (int)(Math.random()*89)) + "min");
	}
	
	public void takeoffAirplane() {
		System.out.println("The plane can fly " + Math.round(Math.random()*1000*1000)/1000 + "km");
	}
	
	public void landingAirplane() {
		System.out.println("The plane is landing");
	}

	@Override
	public String toString() {
		return "[length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	
	
	
}
