package lgscourse.javacore.lesson13.Parlament;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		while(true) {
			showMenu();
			String choice = scanner.nextLine().toLowerCase();
			switch(choice) {
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
				verkhovnaRada.clearParliamentaryParty(scanner.nextLine());
				break;
			case "5":
				System.out.println("Введіть назву фракції: ");
				verkhovnaRada.showParliamentaryParty(scanner.nextLine());
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
					if(res.equalsIgnoreCase("так"))
						isBriberied = true;
					MP mp = new MP(firstName, lastName, age, isBriberied);
					mp.giveBribery(new Random().nextInt(5000));
					verkhovnaRada.addRepresentativeToParliamentaryParty(mp, parliamentaryPartyName);
				}catch(NumberFormatException nfe) {
					System.out.println("Введено невірно дані");
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
					if(verkhovnaRada.getRepresentativeIfExists(firstName1, lastName1, age)!=null) {
						verkhovnaRada.deleteRepresentative(verkhovnaRada.getRepresentativeIfExists(firstName1, lastName1, age));
					}else System.out.println("Такого депутата немає");
				}catch(NumberFormatException nfe) {
					System.out.println("Введено невірно дані");
				}
				break;
			case "8":
				System.out.println("Введіть назву фракції: ");
				verkhovnaRada.showALLBriberied(scanner.nextLine());
				break;
			case "9":
				System.out.println("Введіть назву фракції: ");
				verkhovnaRada.showTheMostBriberied(scanner.nextLine());
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
