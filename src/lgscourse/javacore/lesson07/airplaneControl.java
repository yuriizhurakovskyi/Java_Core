package lgscourse.javacore.lesson07;


public class airplaneControl implements PlaneControl {
	public void moveUp() {
		System.out.println("move up " + (double)Math.round(Math.random()*200*1000)/1000 + "km");
	}
	
	public void moveDown() {
		System.out.println("move down " + (double)Math.round(Math.random()*200*1000)/1000 + "km");
	}
	
	public void moveLeft() {
		System.out.println("move left " + (double)Math.round(Math.random()*200*1000)/1000 + "km");
	}
	
	public void moveRight() {
		System.out.println("move right " + (double)Math.round(Math.random()*200*1000)/1000 + "km");
	}
}
