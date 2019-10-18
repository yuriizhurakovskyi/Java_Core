package lgscourse.javacore.lesson02;

public class Rectangle {
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public Rectangle() {
		this.height = 18.5;
		this.width = 22.4;
	}
	public double getArea() {
		return height*width;
	}
	public double getPerimeter() {
		return 2*(height+width);
	}
}
