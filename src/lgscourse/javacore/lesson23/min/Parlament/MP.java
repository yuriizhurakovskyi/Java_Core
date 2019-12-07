package lgscourse.javacore.lesson23.min.Parlament;

public class MP extends Person {
	private String firstName;
	private String lastName;
	private int age;
	private boolean isBriberied;
	private int briberySize;

	public MP(String firstName, String lastName, int age, boolean isBriberied) {
		super(200, 100);
		this.firstName = firstName.trim();
		this.lastName = lastName.trim();
		this.age = age;
		this.isBriberied = isBriberied;
	}

	public MP(int weight, int height, String firstName, String lastName, int age, boolean isBriberied,
			int briberySize) {
		super(weight, height);
		this.firstName = firstName.trim();
		this.lastName = lastName.trim();
		this.age = age;
		this.isBriberied = isBriberied;
		if (this.isBriberied)
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
		if (!isBriberied)
			System.out.println("Цей депутат не бере хабарів");
		else {
			if (amount > 5000)
				System.out.println("Поліція ув'язнить депутата");
			else
				briberySize = amount;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MP other = (MP) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Депутат [Ім'я=" + firstName + ", Прізвище=" + lastName + ", Вік=" + age + ", Чи є хабарником="
				+ isBriberied + ", Розмір хабаря=" + briberySize + "]\n";
	}

}
