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
				System.out.println("Введіть назву товару");
				String name = scanner.nextLine();
				try {
					System.out.println("Введіть довжину товару, см");
					double length = Double.parseDouble(scanner.nextLine());
					System.out.println("Введіть ширину товару, см");
					double width = Double.parseDouble(scanner.nextLine());
					System.out.println("Введіть вагу товару, кг");
					double weight = Double.parseDouble(scanner.nextLine());
					set.add(new Commodity(name, length, width, weight));
					System.out.println(set);
				}catch (NumberFormatException nfe){
					System.out.println("Невірно введені цифрові дані");
				}
				break;
			case "2":
				System.out.println("Введіть назву товару");
				name = scanner.nextLine();
				set.remove(name);
				System.out.println(set);
				break;
			case "3":
				System.out.println("Введіть назву товару, який ви хочете замінити");
				name = scanner.nextLine();
				try {
					System.out.println("Введіть назву товару, на який ви хочете замінити");
					String name2 = scanner.nextLine();
					System.out.println("Введіть довжину товару, на який ви хочете замінити, см");
					double length2 = Double.parseDouble(scanner.nextLine());
					System.out.println("Введіть ширину товару, на який ви хочете замінити, см");
					double width2 = Double.parseDouble(scanner.nextLine());
					System.out.println("Введіть вагу товару, на який ви хочете замінити, кг");
					double weight2 = Double.parseDouble(scanner.nextLine());
					set.put(name, new Commodity(name2, length2, width2, weight2));
					System.out.println(set);
				}catch (NumberFormatException nfe){
					System.out.println("Невірно введені цифрові дані");
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
				System.out.println("Введіть номер товару(рахунок від 1): ");
				try {
					int index = Integer.parseInt(scanner.nextLine());
					set.showCommodity(index);
				}catch(NumberFormatException nfe) {
					System.out.println("Невірно введені цифрові дані");
				}
				break;
			case "9":
			case "exit":
				scanner.close();
				exit();
				break;
			default:
				System.out.println("\nНе вірний вибір! Спробуйте ще раз\n");
				break;
			}
			
			
		}while(true);
	}
	public static void showMenu() {
		System.out.println("\nМеню");
		System.out.println("1, щоб додати товар");
		System.out.println("2, щоб Видалити товар");
		System.out.println("3, щоб Замінити товар");
		System.out.println("4, щоб Сортувати за назвою");
		System.out.println("5, щоб Сортувати за довжиною");
		System.out.println("6, щоб Сортувати за шириною");
		System.out.println("7, щоб Сортувати за вагою");
		System.out.println("8, щоб Вивести і-тий елемент колекції");
		System.out.println("exit або 9, щоб Вийти з програми\n");
	}
	
	public static void exit() {
		System.exit(0);
	}
}
