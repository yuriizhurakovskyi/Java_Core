package lgscourse.javacore.lesson03.Animals;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal("Леопард", 20, 7);
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років " + "-------------------------------------------------------------------------------");
		animal.setName("Бик");
		animal.setAge(14);
		animal.setSpeed(2);
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років " + "    -------------------------------------------------------------------------------");
		System.out.println(animal);
	}

}
