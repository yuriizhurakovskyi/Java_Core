package lgscourse.javacore.lesson14.BookComparator;

public class Book implements Comparable <Book>{
	private String name;
	private int pages;
	public Book(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}
	public String getName() {
		return name;
	}
	public int getPages() {
		return pages;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.getName());
	}
	
	
}
