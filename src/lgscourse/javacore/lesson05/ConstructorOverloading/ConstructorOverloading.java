package lgscourse.javacore.lesson05.ConstructorOverloading;

public class ConstructorOverloading {
	private int a;
	private float b;
	private String c;
	public ConstructorOverloading() {
		super();
		this.a = 5;
		this.b = 10.43f;
	}
	public ConstructorOverloading(String c) {
		this();
		this.c = c;
	}
	@Override
	public String toString() {
		return "ConstructorOverloading [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
