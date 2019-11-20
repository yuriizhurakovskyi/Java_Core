package lgscourse.javacore.lesson19.Serialization;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.id > e.id)
			return 1;
		else if (this.id < e.id)
			return -1;
		return 0;
	}
	
	
}
