package lgscourse.javacore.lesson02;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Площа першого прямокутника = " + rectangle1.getArea());
		System.out.println("Периметр першого прямокутника = " + rectangle1.getPerimeter());
		Rectangle rectangle2 = new Rectangle(5, 10);
		System.out.println("Площа другого прямокутника = " + rectangle2.getArea());
		System.out.println("Периметр другого прямокутника = " + rectangle2.getPerimeter());
		
		
		Сircle circle1 = new Сircle();
		System.out.println("Площа першого круга  = " + circle1.getAreaOfACircle());
		System.out.println("Довжина першого кола = " + circle1.getLengthOfCircumference());
		Сircle circle2 = new Сircle(4);
		System.out.println("Площа другого круга  = " + circle2.getAreaOfACircle());
		System.out.println("Довжина другого кола = " + circle2.getLengthOfCircumference());
	}

}
