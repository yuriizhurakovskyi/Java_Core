package lgscourse.javacore.lesson05.Amphibia;

public class Frog extends Amphibia {

	@Override
	public void eat() {
		System.out.println("Frog is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Frog is sleeping");
	}

	@Override
	public void swim() {
		System.out.println("Frog is swiming");
	}

	@Override
	public void walk() {
		System.out.println("Frog is walking");
	}

}
