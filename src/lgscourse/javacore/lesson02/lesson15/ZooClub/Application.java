package lgscourse.javacore.lesson15.ZooClub;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		ZooClub zooClub= new ZooClub();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("����: ");
			menu();
			System.out.println("������ ��� ����");
			String choice = scanner.nextLine().toLowerCase();
			switch(choice) {
			case "1":
				try {
					System.out.println("������ ��'� ��������");
					String name = scanner.nextLine();
					System.out.println("������ �� ��������");
					int age = Integer.parseInt(scanner.nextLine());
					zooClub.addMemberZooClub(new Person(name, age));
				}catch(NumberFormatException nfe) {
					System.out.println("���������� ������ ������ ���");
				}
				break;
			case "2":
				try {
					System.out.println("������ ��'� ��������");
					String name = scanner.nextLine();
					System.out.println("������ �� ��������");
					int age = Integer.parseInt(scanner.nextLine());
					System.out.println("������ ��'� ��������");
					String animal = scanner.nextLine();
					System.out.println("������ ��� �������� (cat a�� dog)");
					String type = scanner.nextLine();
					AnimalType at;
					if(type.equalsIgnoreCase(AnimalType.CAT.name()))
						at = AnimalType.CAT;
					else at = AnimalType.DOG;
					zooClub.addPet(zooClub.getPersonFromZooClub(name, age), new Pet(at, animal));
				}catch(NumberFormatException nfe) {
					System.out.println("���������� ������ ������ ���");
				}
				break;
			case "3":
				try {
					System.out.println("������ ��'� ��������");
					String name = scanner.nextLine();
					System.out.println("������ �� ��������");
					int age = Integer.parseInt(scanner.nextLine());
					System.out.println("������ ��'� ��������");
					String animal = scanner.nextLine();
					System.out.println("������ ��� �������� (cat a�� dog)");
					String type = scanner.nextLine();
					zooClub.removePet(zooClub.getPersonFromZooClub(name, age), zooClub.getPetFromZooClub(type, animal));
				}catch(NumberFormatException nfe) {
					System.out.println("���������� ������ ������ ���");
				}
				break;
			case "4":
				try {
					System.out.println("������ ��'� ��������");
					String name = scanner.nextLine();
					System.out.println("������ �� ��������");
					int age = Integer.parseInt(scanner.nextLine());
					zooClub.deleteMemberZooClub(zooClub.getPersonFromZooClub(name, age));
				}catch(NumberFormatException nfe) {
					System.out.println("���������� ������ ������ ���");
				}
				break;
			case "5":
				System.out.println("������ ��'� ��������");
				String animal = scanner.nextLine();
				System.out.println("������ ��� �������� (cat a�� dog)");
				String type = scanner.nextLine();
				zooClub.removePet(zooClub.getPetFromZooClub(type, animal));
				break;
			case "6":
				System.out.println(zooClub);
				break;
			case "7":
			case "exit":
				scanner.close();
				exit();
				break;
			default:
				System.out.println("������� ����, ������ ���� �� ���");
				break;
			}
		}
	}
	
	public static void exit() {
		System.exit(0);
	}
	
	public static void menu() {
		System.out.println("1 ������ �������� �����");
		System.out.println("2 ������ �������� �� �������� �����");
		System.out.println("3 �������� �������� � �������� �����");
		System.out.println("4 �������� �������� � �����");
		System.out.println("5 �������� ��������� �������� � ��� ��������");
		System.out.println("6 ������� �� ����� �������");
		System.out.println("7 ��� exit ����� � ��������");
	}
	
}
