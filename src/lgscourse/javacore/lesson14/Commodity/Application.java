package lgscourse.javacore.lesson14.Commodity;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		CommoditySet set = new CommoditySet();
		do {
			showMenu();
			choice = scanner.nextLine();
			switch(choice) {
			case "1":
				System.out.println("������ ����� ������");
				String name = scanner.nextLine();
				try {
					System.out.println("������ ������� ������, ��");
					double length = Double.parseDouble(scanner.nextLine());
					System.out.println("������ ������ ������, ��");
					double width = Double.parseDouble(scanner.nextLine());
					System.out.println("������ ���� ������, ��");
					double weight = Double.parseDouble(scanner.nextLine());
					set.add(new Commodity(name, length, width, weight));
					System.out.println(set);
				}catch (NumberFormatException nfe){
					System.out.println("������ ������ ������ ���");
				}
				break;
			case "2":
				System.out.println("������ ����� ������");
				name = scanner.nextLine();
				set.remove(name);
				System.out.println(set);
				break;
			case "3":
				System.out.println("������ ����� ������, ���� �� ������ �������");
				name = scanner.nextLine();
				try {
					System.out.println("������ ����� ������, �� ���� �� ������ �������");
					String name2 = scanner.nextLine();
					System.out.println("������ ������� ������, �� ���� �� ������ �������, ��");
					double length2 = Double.parseDouble(scanner.nextLine());
					System.out.println("������ ������ ������, �� ���� �� ������ �������, ��");
					double width2 = Double.parseDouble(scanner.nextLine());
					System.out.println("������ ���� ������, �� ���� �� ������ �������, ��");
					double weight2 = Double.parseDouble(scanner.nextLine());
					set.put(name, new Commodity(name2, length2, width2, weight2));
					System.out.println(set);
				}catch (NumberFormatException nfe){
					System.out.println("������ ������ ������ ���");
				}
				break;
			case "4":
				set.sortByName();
				System.out.println(set);
				break;
			case "5":
				set.sortByLength();
				System.out.println(set);
				break;
			case "6":
				set.sortByWidth();
				System.out.println(set);
				break;
			case "7":
				set.sortByWeight();
				System.out.println(set);
				break;
			case "8":
				System.out.println("������ ����� ������(������� �� 1): ");
				try {
					int index = Integer.parseInt(scanner.nextLine());
					set.showCommodity(index);
				}catch(NumberFormatException nfe) {
					System.out.println("������ ������ ������ ���");
				}
				break;
			case "9":
			case "exit":
				scanner.close();
				exit();
				break;
			default:
				System.out.println("\n�� ����� ����! ��������� �� ���\n");
				break;
			}
			
			
		}while(true);
	}
	public static void showMenu() {
		System.out.println("\n����");
		System.out.println("1, ��� ������ �����");
		System.out.println("2, ��� �������� �����");
		System.out.println("3, ��� ������� �����");
		System.out.println("4, ��� ��������� �� ������");
		System.out.println("5, ��� ��������� �� ��������");
		System.out.println("6, ��� ��������� �� �������");
		System.out.println("7, ��� ��������� �� �����");
		System.out.println("8, ��� ������� �-��� ������� ��������");
		System.out.println("exit ��� 9, ��� ����� � ��������\n");
	}
	
	public static void exit() {
		System.exit(0);
	}
}
