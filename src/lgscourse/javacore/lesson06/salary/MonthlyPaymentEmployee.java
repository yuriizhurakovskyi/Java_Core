package lgscourse.javacore.lesson06.salary;

public class MonthlyPaymentEmployee implements Salary {

	private int payment_per_hour;
	private final int countOfHours = 160;
	@Override
	public void salary() {
		System.out.println("monthly payment " + payment_per_hour*countOfHours);
	}
	public MonthlyPaymentEmployee(int payment_per_hour) {
		super();
		this.payment_per_hour = payment_per_hour;
	}

}
