package lgscourse.javacore.lesson14.BookComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		System.out.println("��������������� HashSet ������:");
		
		Set<Book> set1 = new HashSet<>();
		set1.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set1.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set1.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set1.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set1.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		
		for (Book book : set1) {
			System.out.println(book);
		}
		
		System.out.println("\nLinkedHashSet ������:");
		
		Set<Book> set2 = new LinkedHashSet<>();
		set2.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set2.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set2.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set2.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set2.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		
		for (Book book : set2) {
			System.out.println(book);
		}
		
		System.out.println("\n³������������ ������ TreeSet �� ������:");
		
		Set<Book> set3 = new TreeSet<>();
		set3.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set3.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set3.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set3.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set3.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		
		for (Book book : set3) {
			System.out.println(book);
		}
		
		System.out.println("\n³������������ ������ TreeSet �� ������� �������:");
		
		Set<Book> set4 = new TreeSet<>( new BookPagesComparator());
		set4.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set4.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set4.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set4.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set4.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		
		for (Book book : set4) {
			System.out.println(book);
		}
		
		System.out.println("\n³������������ ������ TreeSet �� ������� ������� �� �������:");
		
		set4 = new TreeSet<>( new BookAllFieldsComparator());
		set4.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		set4.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		set4.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		set4.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		set4.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		set4.add(new Book("��� ����� �� �����. 50 �����, �� ������ ��� �����", 272));
		set4.add(new Book("���������� ��� ����������", 424));
		
		for (Book book : set4) {
			System.out.println(book);
		}
		
		System.out.println("\n�����:");
		
		Queue<Book> queue = new PriorityQueue<>(5, new BookAllFieldsComparator());
		queue.add(new Book("�� ��� �������. �� ��������� � �����", 424));
		queue.add(new Book("� ������� �����, ��� �� �������� ���, ���� ��������� ��������", 256));
		queue.add(new Book("��������� �������. �� ��������� ��� ����� �� �����", 272));
		queue.add(new Book("���� ����������. ���� ���� � ���, �� �� ���� �������", 368));
		queue.add(new Book("�e��a���a �pa��a �po �e�a���� �i��ec. Po����o�a �i��ec� � ��o�ax �e����a�e�oc�i", 264));
		
		for (Book book : queue) {
			System.out.println(book);
		}
	}

}
