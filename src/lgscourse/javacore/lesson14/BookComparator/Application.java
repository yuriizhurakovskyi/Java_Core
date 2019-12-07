package lgscourse.javacore.lesson14.BookComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		System.out.println("Невідсоротаваний HashSet список:");
		
		Set<Book> set1 = new HashSet<>();
		set1.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set1.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set1.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set1.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set1.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		
		for (Book book : set1) {
			System.out.println(book);
		}
		
		System.out.println("\nLinkedHashSet список:");
		
		Set<Book> set2 = new LinkedHashSet<>();
		set2.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set2.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set2.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set2.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set2.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		
		for (Book book : set2) {
			System.out.println(book);
		}
		
		System.out.println("\nВідсоротаваний список TreeSet за назвою:");
		
		Set<Book> set3 = new TreeSet<>();
		set3.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set3.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set3.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set3.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set3.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		
		for (Book book : set3) {
			System.out.println(book);
		}
		
		System.out.println("\nВідсоротаваний список TreeSet за кількістю сторінок:");
		
		Set<Book> set4 = new TreeSet<>( new BookPagesComparator());
		set4.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set4.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set4.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set4.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set4.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		
		for (Book book : set4) {
			System.out.println(book);
		}
		
		System.out.println("\nВідсоротаваний список TreeSet за кількістю сторінок та назвами:");
		
		set4 = new TreeSet<>( new BookAllFieldsComparator());
		set4.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		set4.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		set4.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		set4.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		set4.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		set4.add(new Book("Бог ніколи не моргає. 50 уроків, які змінять твоє життя", 272));
		set4.add(new Book("Електроніка для початківців", 424));
		
		for (Book book : set4) {
			System.out.println(book);
		}
		
		System.out.println("\nЧерга:");
		
		Queue<Book> queue = new PriorityQueue<>(5, new BookAllFieldsComparator());
		queue.add(new Book("До біса почуття. Як вибратись з лайна", 424));
		queue.add(new Book("В оточенні ідіотів, або Як зрозуміти тих, кого неможливо зрозуміти", 256));
		queue.add(new Book("Навчитися вчитися. Як запустити свій мозок на повну", 272));
		queue.add(new Book("Сила інтровертів. Тихі люди у світі, що не може мовчати", 368));
		queue.add(new Book("Бeзжaльнa пpaвдa пpo нeщaдний бiзнec. Poзбудoвa бiзнecу в умoвax нeвизнaчeнocтi", 264));
		
		for (Book book : queue) {
			System.out.println(book);
		}
	}

}
