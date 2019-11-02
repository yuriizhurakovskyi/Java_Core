package lgscourse.javacore.lesson12.CarsArrayLists;

public class SteeringWheel {
	private int diameter;
	private Material material;
	public SteeringWheel(int diameter, Material material) {
		this.diameter = diameter;
		this.material = material;
	}
	
	public int getDiameter() {
		return diameter;
	}
	public Material getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return "Steering wheel : diameter = " + diameter + ", material = " + material.name();
	}
	
}
