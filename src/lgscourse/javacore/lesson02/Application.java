package lgscourse.javacore.lesson02;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		System.out.println("����� ������� ������������ = " + rectangle1.getArea());
		System.out.println("�������� ������� ������������ = " + rectangle1.getPerimeter());
		Rectangle rectangle2 = new Rectangle(5, 10);
		System.out.println("����� ������� ������������ = " + rectangle2.getArea());
		System.out.println("�������� ������� ������������ = " + rectangle2.getPerimeter());
		
		
		�ircle circle1 = new �ircle();
		System.out.println("����� ������� �����  = " + circle1.getAreaOfACircle());
		System.out.println("������� ������� ���� = " + circle1.getLengthOfCircumference());
		�ircle circle2 = new �ircle(4);
		System.out.println("����� ������� �����  = " + circle2.getAreaOfACircle());
		System.out.println("������� ������� ���� = " + circle2.getLengthOfCircumference());
	}

}
