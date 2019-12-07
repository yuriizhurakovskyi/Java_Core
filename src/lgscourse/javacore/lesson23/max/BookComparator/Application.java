package lgscourse.javacore.lesson23.max.BookComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		System.out.println("�������������� ������ �� ������� �������");

		Set<Book> set1 = new HashSet<>();
		set1.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set1.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set1.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set1.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set1.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		set1 = set1.stream().sorted(new BookPagesComparator()).collect(Collectors.toCollection(LinkedHashSet::new));
		set1.forEach(System.out::println);

		System.out.println("\n �������������� ������ �� �������:");

		set1 = new LinkedHashSet<>();
		set1.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set1.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set1.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set1.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set1.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		set1 = set1.stream().sorted().collect(Collectors.toCollection(TreeSet::new));
		set1.forEach(System.out::println);

		System.out.println("\n�������������� ������ �� ������� ������� �� �������:");

		set1 = new TreeSet<>();
		set1.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set1.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set1.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
    	set1.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set1.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		set1.add(new Book("��� ����� �� �����. 50 �����, �� ������ ��� �����", 272));
		set1.add(new Book("���������� ��� ����������", 424));
		set1 = set1.stream().sorted(new BookAllFieldsComparator()).collect(Collectors.toCollection(TreeSet::new));
		set1.forEach(System.out::println);
	}

}
