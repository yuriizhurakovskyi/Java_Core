package lgscourse.javacore.lesson06.salary;

public class Application {
	public static void main(String[] args) {
		MonthlyPaymentEmployee employee1 = new MonthlyPaymentEmployee(70);
		employee1.salary();
		HourlyWagesEmployee employee2 = new HourlyWagesEmployee(60, 170);
		employee2.salary();
	}
}
