package lgscourse.javacore.lesson06.salary;

public class HourlyWagesEmployee implements Salary {
	private int payment_per_hour;
	private int countOfHours;
	@Override
	public void salary() {
		System.out.println("monthly payment " + payment_per_hour*countOfHours);
	}
	public HourlyWagesEmployee(int payment_per_hour, int countOfHours) {
		super();
		this.payment_per_hour = payment_per_hour;
		this.countOfHours = countOfHours;
	}
	
	
}
