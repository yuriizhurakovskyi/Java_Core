package lgscourse.javacore.lesson03.Animals;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal("�������", 20, 7);
		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ���� " + "-------------------------------------------------------------------------------");
		animal.setName("���");
		animal.setAge(14);
		animal.setSpeed(2);
		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ���� " + "    -------------------------------------------------------------------------------");
		System.out.println(animal);
	}

}
