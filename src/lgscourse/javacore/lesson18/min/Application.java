package lgscourse.javacore.lesson18.min;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	    addElements(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// ����� get �� �������� ��� ��� �������� ��������, � ������ ������� ����,
			//� System.out.println �������� toString ��� ����-����� ��'���� 
		 } 
		
		
		//��� ������� ������� ���������, �� ��� ��������� list ���� �������� ��� �������� List<Integer>, ��� ����� ���� ������������� �������
		// ��� ���������� � list
		
	/*  list.add("Hello");
		list.add("this");
		list.add(1.2);
		list.add("is");
		list.add(3.0f);
		list.add("addElements");
		list.add(new String("1.4"));
		list.add("method");
		list.add(new Object());
	*/
		
	//	list.add(Integer.parseInt("Hello")); // ������� java.lang.NumberFormatException, ������� �� String �� ������� �������� �� ���� Integer
		
		
	}
	
	public static void addElements(List list) {
		// � ������ ������� ���������� ��'���� String �� ����� ��'���� � ��������, ������� �� ������������� 
		// ��������� ���������� List, �� �������� ���� �������� ���� � � ������ ������� �������� ����� �������� ��� Object
		list.add("Hello");
		list.add(1);
		list.add("this");
		list.add(1.2);
		list.add("is");
		list.add(3.0f);
		list.add("addElements");
		list.add(new String("1.4"));
		list.add("method");
		list.add(new Object());
	}

}
