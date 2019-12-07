package lgscourse.javacore.lesson23.max.BookComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		System.out.println("Пересортований список за кількістю сторінок");

		Set<Book> set1 = new HashSet<>();
		set1.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set1.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set1.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set1.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set1.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		set1 = set1.stream().sorted(new BookPagesComparator()).collect(Collectors.toCollection(LinkedHashSet::new));
		set1.forEach(System.out::println);

		System.out.println("\n Пересортований список за назвами:");

		set1 = new LinkedHashSet<>();
		set1.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set1.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set1.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set1.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set1.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		set1 = set1.stream().sorted().collect(Collectors.toCollection(TreeSet::new));
		set1.forEach(System.out::println);

		System.out.println("\nПересортований список за кількістю сторінок та назвами:");

		set1 = new TreeSet<>();
		set1.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set1.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set1.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
    	set1.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set1.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		set1.add(new Book("Бог ніколи не моргає. 50 уроків, які змінять твоє життя", 272));
		set1.add(new Book("Електроніка для початківців", 424));
		set1 = set1.stream().sorted(new BookAllFieldsComparator()).collect(Collectors.toCollection(TreeSet::new));
		set1.forEach(System.out::println);
	}

}
