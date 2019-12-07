package lgscourse.javacore.lesson16.Reflection;

public abstract class Aircraft implements Flyable {
	protected boolean lighterORHeavierThanAir;

	public Aircraft(boolean lighterORHeavierThanAir) {
		this.lighterORHeavierThanAir = lighterORHeavierThanAir;
	}
	
	
	
}
