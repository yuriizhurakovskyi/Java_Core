package lgscourse.javacore.lesson21.Min;

public class Book {
	@Genreser("Book title")
	private String name;
	private int pages;
	private String publisher;
	@Genreser("Book author")
	private String author;
	@Genreser("Book genre")
	private String genre;
	
	public Book(String name, int pages, String publisher, String author, String genre) {
		this.name = name;
		this.pages = pages;
		this.publisher = publisher;
		this.author = author;
		this.genre = genre;
	}
	

	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + ", publisher=" + publisher + ", author=" + author + "]";
	}
	
	
}
