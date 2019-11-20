package lgscourse.javacore.lesson19.Serialization;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Robert", 0, 3556.70);
		File file = new File("Employee1.txt");
		try {
			Methods.serialize(file, employee1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Employee employee2 = (Employee) Methods.deserealize(file);
			System.out.println(employee2 + "\n");
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee("Anna", 1, 2486.64));
		set.add(new Employee("George", 2, 3486.64));
		set.add(new Employee("Sarah", 3, 4486.64));
		set.add(new Employee("Robert", 4, 6486.64));
		set.add(new Employee("Mike", 5, 2386.64));
		for (Employee employee : set) {
			System.out.println(employee);
		}
		
		File file1 = new File("set1.txt");
			
			try {
				Methods.serialize(file1, (Serializable) set);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\n");
		try {
			@SuppressWarnings("unchecked")
			Set<Employee> set2 = (Set<Employee>) Methods.deserealize(file1);
			for (@SuppressWarnings("unused") Employee employee : set2) {
				System.out.println(employee);
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
