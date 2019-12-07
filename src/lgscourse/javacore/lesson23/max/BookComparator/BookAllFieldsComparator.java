package lgscourse.javacore.lesson23.max.BookComparator;

import java.util.Comparator;

public class BookAllFieldsComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPages() > o2.getPages())
			return 1;
		else if (o1.getPages() < o2.getPages())
			return -1;
		else if(o1.getName().compareTo(o2.getName()) > 0)
			return 1;
		else if(o1.getName().compareTo(o2.getName()) < 0)
			return -1;
		return 0;
	}

}
