/*
 * Homework LGS IA Enums, Months and Seasons, Main Class solution
 * 
 * */


package lgscourse.javacore.lesson09.Seasons.Exceptions;

/**
 * @since java 1.8
 * @author Yurii
 * @version 1.1
 **/


import java.time.Month;
import java.util.Scanner;

public class Main {
	
	/**
	 * @param no input params
	 * @exception WrongInputConsoleParametersException
	 * @author Yurii
	 * @return null
	 * @see java code convention
	 **/

	/*menu of application*/
	static void menu() {
		System.out.println("\nћеню 2020 AD: ");
		System.out.println("1. ѕерев≥рити чи Ї такий м≥с€ць.");
		System.out.println("2. ¬ивести вс≥ м≥с€ц≥ з такою ж порою року.");
		System.out.println("3. ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в.");
		System.out.println("4. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в.");
		System.out.println("5. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в.");
		System.out.println("6. ¬ивести на екран наступну пору року.");
		System.out.println("7. ¬ивести на екран попередню пору року.");
		System.out.println("8. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в.");
		System.out.println("9. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в.");
		System.out.println("10. ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в.\n");
		System.out.println("exit - ¬ийти з програми");
}
	/*main method*/
	public static void main(String[] args) {
		Months[] months = Months.values();
		Seasons[] seasons = Seasons.values();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			menu();
			switch(scanner.next().toLowerCase()) {
			case "1":
				System.out.println("\n¬вед≥ть м≥с€ць ");
				scanner = new Scanner(System.in); 
				String monthS = scanner.next();
				boolean exists = isExistingASuchMonth(months, monthS);
				if(!exists)
					System.out.println("“акого м≥с€ц€ немаЇ!\n");
				else System.out.println("ћ≥с€ць " + monthS.toUpperCase() + " ≥снуЇ!\n");
				break;
			case "2":
				System.out.println("\n¬вед≥ть м≥с€ць або пору року ");
				scanner = new Scanner(System.in); 
				String monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\nЌекоректно введен≥ дан≥. “акого м≥с€ц€ чи пори року немаЇ!\n");
					}
					else {
						showMonthsOfSeason(months, Seasons.valueOf(monthOrSeason.toUpperCase()));
					}
				}
				else showMonthsOfSeason(months, Months.valueOf(monthOrSeason.toUpperCase()).getSeason());
				break;
			case "3":
				System.out.println("\n¬вед≥ть м≥с€ць або к≥льк≥сть дн≥в ");
				scanner = new Scanner(System.in); 
				String monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsTheSameNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n¬ведено некоректну к≥льк≥сть дн≥в або назву м≥с€ц€\n");
			        }
				}
				else {
					System.out.println("ћ≥с€ць " + Months.valueOf(monthOrDays.toUpperCase()) + " маЇ " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" дн≥в");
					showMonthsTheSameNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
				}
				break;
			case "4":
				System.out.println("\n¬вед≥ть м≥с€ць або к≥льк≥сть дн≥в ");
				scanner = new Scanner(System.in); 
				monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsFewerNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n¬ведено некоректну к≥льк≥сть дн≥в або назву м≥с€ц€\n");
			        } catch (WrongInputConsoleParametersException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("ћ≥с€ць " + Months.valueOf(monthOrDays.toUpperCase()) + " маЇ " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" дн≥в");
					try {
						showMonthsFewerNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
					} catch (WrongInputConsoleParametersException e) {
						e.printStackTrace();
					}
				}
				break;
			case "5":
				System.out.println("\n¬вед≥ть м≥с€ць або к≥льк≥сть дн≥в ");
				scanner = new Scanner(System.in); 
				monthOrDays = scanner.next();
				exists = isExistingASuchMonth(months, monthOrDays);
				if(!exists) {
					try {
						showMonthsMoreNumberOfDays(months, Integer.parseInt(monthOrDays));
					} catch (NumberFormatException nfe) {
			            System.out.println("\n¬ведено некоректну к≥льк≥сть дн≥в або назву м≥с€ц€\n");
			        } catch (WrongInputConsoleParametersException wicpe) {
			        	wicpe.printStackTrace();
			        }
				}
				else {
					System.out.println("ћ≥с€ць " + Months.valueOf(monthOrDays.toUpperCase()) + " маЇ " + Months.valueOf(monthOrDays.toUpperCase()).getDays() +
							" дн≥в");
					try {
						showMonthsMoreNumberOfDays(months, Months.valueOf(monthOrDays.toUpperCase()).getDays());
					} catch (WrongInputConsoleParametersException e) {
						e.printStackTrace();
					}
				}
				break;
			case "6":
				System.out.println("\n¬вед≥ть м≥с€ць або пору року ");
				scanner = new Scanner(System.in); 
				monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\nЌекоректно введен≥ дан≥. “акого м≥с€ц€ чи пори року немаЇ!\n");
					}
					else {
						 showNextSeason(seasons,  monthOrSeason.toUpperCase());
					}
				}
				else {
					System.out.println("ћ≥с€ць " +  Months.valueOf(monthOrSeason.toUpperCase()) + " - це " + Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
					showNextSeason(seasons,  Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
				}
				break;
			case "7":
				System.out.println("\n¬вед≥ть м≥с€ць або пору року ");
				scanner = new Scanner(System.in); 
				monthOrSeason = scanner.next();
				exists = isExistingASuchMonth(months, monthOrSeason);
				if(!exists) {
					boolean sExists = isExistingASuchSeason(seasons, monthOrSeason);
					if(!sExists) {
						System.out.println("\nЌекоректно введен≥ дан≥. “акого м≥с€ц€ чи пори року немаЇ!\n");
					}
					else {
						showPreviousSeason(seasons,  monthOrSeason.toUpperCase());
					}
				}
				else {
					System.out.println("ћ≥с€ць " +  Months.valueOf(monthOrSeason.toUpperCase()) + " - це " + Months.valueOf(monthOrSeason.toUpperCase()).getSeason().name());
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
				System.out.println("\n¬вед≥ть м≥с€ць ");
				scanner = new Scanner(System.in); 
				monthS = scanner.next();
				exists = isExistingASuchMonth(months, monthS);
				if(!exists)
					System.out.println("“акого м≥с€ц€ немаЇ!\n");
				else displayMonthAnEvenOrAnOddNumberOfDays(monthS);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("“акого пункту меню немаЇ. ¬ибер≥ть ще раз");
				break;
			}
		}
	}

	/*is existing a such season*/
	private static boolean isExistingASuchSeason(Seasons[] seasons, String monthOrSeason) {
		boolean exists = false;
		for (Seasons season : seasons) {
			if(monthOrSeason.equalsIgnoreCase(season.name()))
			{
				exists = true;
				System.out.println("ѕора року " + season.name() + " ≥снуЇ!\n");
			}
		}
		return exists;
	}

	/*is existing a such month*/
	private static boolean isExistingASuchMonth(Months[] months, String monthS) {
		boolean exists = false;
		for (Months month : months) {
			if(monthS.equalsIgnoreCase(month.name()))
			{
				exists = true;
			}
		}
		return exists;
	}
	
	/*show month of season*/
	private static void showMonthsOfSeason(Months[] months, Seasons season) {
		System.out.println("\nMonths of " + season.name() + ": \n");
		for (Months month : months) {
			if(month.getSeason().name().equals(season.name()))
				System.out.println(month.name());
		}
		System.out.println();
	}

	/*show month with the same number of days*/
	private static void showMonthsTheSameNumberOfDays(Months[] months, int days) {
		System.out.println("\n Months with " + days + " days: \n");
		for (Months month : months) {
			if(month.getDays() == days)
				System.out.println(month.name());
		}
		System.out.println();
	}
	
	/*show month with fewer days */
	private static void showMonthsFewerNumberOfDays(Months[] months, int days) throws WrongInputConsoleParametersException{
		if(days > 31 || days < 28) {
			String message = "ћ≥с€ц≥в з б≥льше, н≥ж 31 або менше 28 дн≥в не ≥снуЇ";
			throw new WrongInputConsoleParametersException(message);
		} else {
			int min = months[0].getDays();
			for (Months month : months) {
				if(month.getDays() < min)
					min = month.getDays();
			}
			if(days == min) {
				System.out.println("ЌемаЇ м≥с€ц≥в з меншою к≥льк≥стю дн≥в, н≥ж " + days + " в цьому роц≥");
			} else {
				System.out.println("\n Months with a fewer number than " + days + " days: \n");
				for (Months month : months) {
					if(month.getDays() < days) {
						System.out.println(month.name() + " - " + month.getDays() + " days");
					}
				}
				System.out.println();
			}
		}
	}
	
	/*show month with more days*/
	private static void showMonthsMoreNumberOfDays(Months[] months, int days) throws WrongInputConsoleParametersException {
		if(days >= 31 || days < 28) {
			String message = "ћ≥с€ц≥в з б≥льше, н≥ж 31 або менше 28 дн≥в не ≥снуЇ";
			throw new WrongInputConsoleParametersException(message);
		}
		else {
			System.out.println("\n Months with more than" + days + " days: \n");
			for (Months month : months) {
				if(month.getDays() > days)
					System.out.println(month.name() + " - " + month.getDays() + " days");
			}
			System.out.println();
		}
	}
	
	/*show next season*/
	private static void showNextSeason(Seasons[] seasons, String season) {
		System.out.println("\n Ќаступна пора року п≥сл€ " + Seasons.valueOf(season).name() + " - це ");
		if(seasons[seasons.length-1].name().equalsIgnoreCase(season))
			System.out.println(seasons[0].name());
		else {
			System.out.println(seasons[Seasons.valueOf(season).ordinal() + 1].name());
		}
	}
	
	/*show previous season*/
	private static void showPreviousSeason(Seasons[] seasons, String season) {
		System.out.println("\n ѕопередн€ пора року перед " + Seasons.valueOf(season).name() + " - це ");
		if(seasons[0].name().equalsIgnoreCase(season))
			System.out.println(seasons[seasons.length-1].name());
		else {
			System.out.println(seasons[Seasons.valueOf(season).ordinal() - 1].name());
		}
	}
	
	/*display months with an even number of days*/
	private static void displayAllMonthsAnEvenNumberOfDays(Months[] months) {
		System.out.println("\n ћ≥с€ц≥, €к≥ мають парну к≥льк≥сть дн≥в: ");
		for (Months month : months) {
			if(month.getDays() % 2 == 0)
				System.out.println(month.name() + " - " + month.getDays() + " дн≥в");
		}
	}
	
	/*display months with an odd number of days*/
	private static void displayAllMonthsAnOddNumberOfDays(Months[] months) {
		System.out.println("\n ћ≥с€ц≥, €к≥ мають непарну к≥льк≥сть дн≥в: ");
		for (Months month : months) {
			if(month.getDays() % 2 != 0)
				System.out.println(month.name() + " - " + month.getDays() + " дн≥в");
		}
	}
	
	/*Even or odd number of days for one month*/
	private static void displayMonthAnEvenOrAnOddNumberOfDays(String month) {
		if(Months.valueOf(month.toUpperCase()).getDays() % 2 == 0)
				System.out.println("ћ≥с€ць " + Months.valueOf(month.toUpperCase()).name() + " маЇ парну к≥льк≥сть дн≥в - " + Months.valueOf(month.toUpperCase()).getDays());
		else System.out.println("ћ≥с€ць " + Months.valueOf(month.toUpperCase()).name() + " маЇ непарну к≥льк≥сть дн≥в - " + Months.valueOf(month.toUpperCase()).getDays());
	}
}
