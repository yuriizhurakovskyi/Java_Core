package lgscourse.javacore.lesson23.min.Parlament;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		while (true) {
			showMenu();
			String choice = scanner.nextLine().toLowerCase();
			switch (choice) {
			case "1":
				System.out.println("Введіть назву фракції: ");
				verkhovnaRada.addParliamentaryParty(new ParliamentaryParty(scanner.nextLine()));
				break;
			case "2":
				System.out.println("Введіть назву фракції: ");
				verkhovnaRada.removeParliamentaryParty(scanner.nextLine());
				break;
			case "3":
				verkhovnaRada.showAllParliamentaryPartyNames();
				break;
			case "4":
				System.out.println("Введіть назву фракції: ");
				try {
					verkhovnaRada.clearParliamentaryParty(scanner.nextLine());
				} catch (NoSuchElementException nsee) {
					System.out.println("Такої фракції у Верховній раді немає");
				}
				break;
			case "5":
				System.out.println("Введіть назву фракції: ");
				try {
					verkhovnaRada.showParliamentaryParty(scanner.nextLine());
				} catch (NoSuchElementException e) {
					System.out.println("Такої фракції немає");
				}
				break;
			case "6":
				System.out.println("Введіть назву фракції: ");
				String parliamentaryPartyName = scanner.nextLine();
				System.out.println("Введіть ім'я депутата");
				String firstName = scanner.nextLine();
				System.out.println("Введіть прізвище депутата");
				String lastName = scanner.nextLine();
				System.out.println("Введіть вік депутата");
				try {
					int age = Integer.parseInt(scanner.nextLine());
					System.out.println("Чи депутат є хабарником? Введіть так або ні");
					boolean isBriberied = false;
					String res = scanner.nextLine();
					if (res.equalsIgnoreCase("так"))
						isBriberied = true;
					MP mp = new MP(firstName, lastName, age, isBriberied);
					mp.giveBribery(new Random().nextInt(5000));
					verkhovnaRada.addRepresentativeToParliamentaryParty(mp, parliamentaryPartyName);
				} catch (NumberFormatException nfe) {
					System.out.println("Введено невірно дані");
				} catch (NoSuchElementException nsee) {
					System.out.println("Такої фракції у Верховній раді немає");
				}
				break;
			case "7":
				System.out.println("Введіть ім'я депутата");
				String firstName1 = scanner.nextLine();
				System.out.println("Введіть прізвище депутата");
				String lastName1 = scanner.nextLine();
				System.out.println("Введіть вік депутата");
				try {
					int age = Integer.parseInt(scanner.nextLine());
					verkhovnaRada
							.deleteRepresentative(verkhovnaRada.getRepresentativeIfExists(firstName1, lastName1, age));
				} catch (NumberFormatException nfe) {
					System.out.println("Введено невірно дані");
				} catch (NoSuchElementException exc) {
					System.out.println("Такого депутата немає");
				}
				break;
			case "8":
				System.out.println("Введіть назву фракції: ");
				try {
					verkhovnaRada.showALLBriberied(scanner.nextLine());
				} catch (NoSuchElementException nsee) {
					System.out.println("В цій фракції нема хабарників або такої фракції немає");
				}
				break;
			case "9":
				System.out.println("Введіть назву фракції: ");
				try {
					verkhovnaRada.showTheMostBriberied(scanner.nextLine());
				} catch (NoSuchElementException exc) {
					System.out.println("В цій фракції немає хабарників");
				}
				break;
			case "exit":
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Невірний вибір");
				break;
			}
		}
	}

	private static void showMenu() {
		System.out.println("\nМеню :");
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.out.println("exit - щоб вийти\n");
	}

}
