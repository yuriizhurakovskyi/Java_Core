package lgscourse.javacore.lesson11.Seasons;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("\n���� 2020 AD: ");
		System.out.println("1. ��������� �� � ����� �����.");
		System.out.println("2. ������� �� ����� � ����� � ����� ����.");
		System.out.println("3. ������� �� ����� �� ����� ���� ���� ������� ���.");
		System.out.println("4. ������� �� ����� �� ����� �� ����� ����� ������� ���.");
		System.out.println("5. ������� �� ����� �� ����� �� ����� ����� ������� ���.");
		System.out.println("6. ������� �� ����� �������� ���� ����.");
		System.out.println("7. ������� �� ����� ��������� ���� ����.");
		System.out.println("8. ������� �� ����� �� ����� �� ����� ����� ������� ���.");
		System.out.println("9. ������� �� ����� �� ����� �� ����� ������� ������� ���.");
		System.out.println("10. ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���.\n");
		System.out.println("exit - ����� � ��������");
}
	
	public static void main(String[] args) {
		ArrayList <Months> months = new ArrayList <Months>();
		months.addAll(Arrays.asList(Months.values()));
		ArrayList <Seasons> seasons =  new ArrayList <Seasons>();
		seasons.addAll(Arrays.asList(Seasons.values()));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			menu();
			switch(scanner.next().toLowerCase()) {
			case "1":
				System.out.println("\n������ ����� ");
				scanner = new Scanner(System.in); 
				String monthS = scanner.next();
				boolean exists = isExistingASuchMonth(months, monthS);
				if(!exists)
					System.out.println("������ ����� ����!\n");
				else System.out.println("̳���� " + monthS.toUpperCase() + " ����!\n");
				break;
			case "2":
				System.out.println("\n������ ����� ��� ���� ���� ");
				scanner = new Scanner(System.in); 
				String monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\n���������� ������ ���. ������ ����� �� ���� ���� ����!\n");
					}
					else {
						showMonthsOfSeason(months, Seasons.valueOf(monthOrSeason.toUpperCase()));
					}
				}
				else showMonthsOfSeason(months, Months.valueOf(monthOrSeason.toUpperCase()).getSeason());
				break;
			case "3":
				System.out.println("\n������ ����� ��� ������� ��� ");
				scanner = new Scanner(System.in); 
				String monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsTheSameNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n������� ���������� ������� ��� ��� ����� �����\n");
			        }
				}
				else {
					System.out.println("̳���� " + Months.valueOf(monthOrDays.toUpperCase()) + " �� " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" ���");
					showMonthsTheSameNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
				}
				break;
			case "4":
				System.out.println("\n������ ����� ��� ������� ��� ");
				scanner = new Scanner(System.in); 
				monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsFewerNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n������� ���������� ������� ��� ��� ����� �����\n");
			        }
				}
				else {
					System.out.println("̳���� " + Months.valueOf(monthOrDays.toUpperCase()) + " �� " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" ���");
					showMonthsFewerNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
				}
				break;
			case "5":
				System.out.println("\n������ ����� ��� ������� ��� ");
				scanner = new Scanner(System.in); 
				monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsMoreNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n������� ���������� ������� ��� ��� ����� �����\n");
			        }
				}
				else {
					System.out.println("̳���� " + Months.valueOf(monthOrDays.toUpperCase()) + " �� " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" ���");
					showMonthsMoreNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
				}
				break;
			case "6":
				System.out.println("\n������ ����� ��� ���� ���� ");
				scanner = new Scanner(System.in); 
				monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\n���������� ������ ���. ������ ����� �� ���� ���� ����!\n");
					}
					else {
						 showNextSeason(seasons,  monthOrSeason.toUpperCase());
					}
				}
				else {
					System.out.println("̳���� " +  Months.valueOf(monthOrSeason.toUpperCase()) + " - �� " + Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
					showNextSeason(seasons,  Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
				}
				break;
			case "7":
				System.out.println("\n������ ����� ��� ���� ���� ");
				scanner = new Scanner(System.in); 
				monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\n���������� ������ ���. ������ ����� �� ���� ���� ����!\n");
					}
					else {
						showPreviousSeason(seasons,  monthOrSeason.toUpperCase());
					}
				}
				else {
					System.out.println("̳���� " +  Months.valueOf(monthOrSeason.toUpperCase()) + " - �� " + Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
					showPreviousSeason(seasons,  Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
				}
				break;
			case "8":
				displayAllMonthsAnEvenNumberOfDays(months);
				break;
			case "9":
				displayAllMonthsAnOddNumberOfDays(months);
				break;
			case "10":
				System.out.println("\n������ ����� ");
				scanner = new Scanner(System.in); 
				monthS = scanner.next();
				exists = isExistingASuchMonth(months, monthS);
				if(!exists)
					System.out.println("������ ����� ����!\n");
				else displayMonthAnEvenOrAnOddNumberOfDays(monthS);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("������ ������ ���� ����. ������� �� ���");
				break;
			}
		}
	}

	private static boolean isExistingASuchSeason(ArrayList<Seasons> seasons, String monthOrSeason) {
		boolean exists = false;
		for (Seasons season : seasons) {
			if(monthOrSeason.equalsIgnoreCase(season.name()))
			{
				exists = true;
				System.out.println("���� ���� " + season.name() + " ����!\n");
			}
		}
		return exists;
	}

	private static boolean isExistingASuchMonth(ArrayList<Months> months, String monthS) {
		boolean exists = false;
		for (Months month : months) {
			if(monthS.equalsIgnoreCase(month.name()))
			{
				exists = true;
			}
		}
		return exists;
	}
	
	private static void showMonthsOfSeason(ArrayList<Months> months, Seasons season) {
		System.out.println("\nMonths of " + season.name() + ": \n");
		for (Months month : months) {
			if(month.getSeason().name().equals(season.name()))
				System.out.println(month.name());
		}
		System.out.println();
	}

	private static void showMonthsTheSameNumberOfDays(ArrayList<Months> months, int days) {
		System.out.println("\n Months with " + days + " days: \n");
		for (Months month : months) {
			if(month.getDays() == days)
				System.out.println(month.name());
		}
		System.out.println();
	}
	
	private static void showMonthsFewerNumberOfDays(ArrayList<Months> months, int days) {
		int min = months.get(0).getDays();
		for (Months month : months) {
			if(month.getDays() < min)
				min = month.getDays();
		}
		if(days == min) {
			System.out.println("���� ������ � ������ ������� ���, �� " + days + " � ����� ����");
		}else {
			System.out.println("\n Months with a fewer number than " + days + " days: \n");
			for (Months month : months) {
				if(month.getDays() < days) {
					System.out.println(month.name() + " - " + month.getDays() + " days");
				}
			}
			System.out.println();
		}
	}
	
	private static void showMonthsMoreNumberOfDays(ArrayList<Months> months, int days) {
		if(days >= 31)System.out.println( "̳����� � �����, �� 31 ����� �� ����");
		else {
			System.out.println("\n Months with more than" + days + " days: \n");
			for (Months month : months) {
				if(month.getDays() > days)
					System.out.println(month.name() + " - " + month.getDays() + " days");
			}
			System.out.println();
		}
	}
	
	private static void showNextSeason(ArrayList<Seasons> seasons, String season) {
		System.out.println("\n �������� ���� ���� ���� " + Seasons.valueOf(season).name() + " - �� ");
		if(seasons.get(seasons.size()-1).name().equalsIgnoreCase(season))
			System.out.println(seasons.get(0).name());
		else {
			System.out.println(seasons.get(Seasons.valueOf(season).ordinal() + 1).name());
		}
	}
	
	private static void showPreviousSeason(ArrayList<Seasons> seasons, String season) {
		System.out.println("\n ��������� ���� ���� ����� " + Seasons.valueOf(season).name() + " - �� ");
		if(seasons.get(0).name().equalsIgnoreCase(season))
			System.out.println(seasons.get(seasons.size()-1).name());
		else {
			System.out.println(seasons.get(Seasons.valueOf(season).ordinal() - 1).name());
		}
	}
	
	private static void displayAllMonthsAnEvenNumberOfDays(ArrayList<Months> months) {
		System.out.println("\n ̳����, �� ����� ����� ������� ���: ");
		for (Months month : months) {
			if(month.getDays() % 2 == 0)
				System.out.println(month.name() + " - " + month.getDays() + " ���");
		}
	}
	
	private static void displayAllMonthsAnOddNumberOfDays(ArrayList<Months> months) {
		System.out.println("\n ̳����, �� ����� ������� ������� ���: ");
		for (Months month : months) {
			if(month.getDays() % 2 != 0)
				System.out.println(month.name() + " - " + month.getDays() + " ���");
		}
	}
	
	private static void displayMonthAnEvenOrAnOddNumberOfDays(String month) {
		if(Months.valueOf(month.toUpperCase()).getDays() % 2 == 0)
				System.out.println("̳���� " + Months.valueOf(month.toUpperCase()).name() + " �� ����� ������� ��� - " + Months.valueOf(month.toUpperCase()).getDays());
		else System.out.println("̳���� " + Months.valueOf(month.toUpperCase()).name() + " �� ������� ������� ��� - " + Months.valueOf(month.toUpperCase()).getDays());
	}
}
