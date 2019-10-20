package lgscourse.javacore.lesson05.Pets;

public class Application {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		cat.voice();
		dog.voice();
		cow.voice();
	}

}
