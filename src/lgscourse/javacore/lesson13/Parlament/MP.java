package lgscourse.javacore.lesson13.Parlament;

public class MP extends Person{
	private String firstName;
	private String lastName;
	private int age;
	private boolean isBriberied;
	private int briberySize;
	public MP(String firstName, String lastName, int age, boolean isBriberied) {
		super(200, 100);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isBriberied = isBriberied;
	}
	
	public MP(int weight, int height, String firstName, String lastName, int age, boolean isBriberied,
			int briberySize) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isBriberied = isBriberied;
		this.briberySize = briberySize;
	}


	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public boolean isBriberied() {
		return isBriberied;
	}
	public int getBriberySize() {
		return briberySize;
	}
	
	public void giveBribery(int amount) {
		if(!isBriberied)
			System.out.println("Цей депутат не бере хабарів");
		else {
			if(amount > 5000)
				System.out.println("Поліція ув'язнить депутата");
			else briberySize = amount;
		}
	}
	@Override
	public String toString() {
		return "Депутат [Ім'я=" + firstName + ", Прізвище=" + lastName + ", Вік=" + age + ", Чи є хабарником=" + isBriberied
				+ ", Розмір хабаря=" + briberySize + "]\n";
	}
	
}
