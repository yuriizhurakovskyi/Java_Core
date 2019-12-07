package lgscourse.javacore.lesson02;

public class �ircle {
	private double radius;
	private double diameter;
	public �ircle() {
		this.radius = 1;
		this.diameter = 2*radius;
	}
	public �ircle(double radius) {
		this.radius = radius;
		this.diameter = 2*radius;
	}
	public double getAreaOfACircle() {
		return Math.PI*1/4*Math.pow(diameter, 2);
	}
    public double getLengthOfCircumference() {
    	return 2*Math.PI*radius;
    }
}
