package lgscourse.javacore.lesson23.max.BookComparator;

import java.util.Comparator;

public class BookPagesComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		if(arg0.getPages() > arg1.getPages())
			return 1;
		else if (arg0.getPages() < arg1.getPages())
			return -1;
		return 0;
	}
	
}
