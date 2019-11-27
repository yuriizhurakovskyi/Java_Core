package lgscourse.javacore.lesson21.Min;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Book> arrayList = new ArrayList<Book>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(new Book("name" + i, 100, "publisher" + i, "author" + i, "genre" + i));
		}
		File file = new File("Books.txt");
		for (Book book : arrayList) {
			try {
				writeInFileAnnotatedBook(file, book);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void writeInFileAnnotatedBook(File file, Book myBook) throws IOException {
		Field[] fields = myBook.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(fields[i].getAnnotation(Genreser.class) instanceof Genreser) {
				Field field = fields[i];
				field.setAccessible(true);
				try {
					Files.write(Paths.get(file.getPath()), (fields[i].getAnnotation(Genreser.class).value() + ": " + fields[i].get(myBook) + "; ").getBytes(), StandardOpenOption.APPEND);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		Files.write(Paths.get(file.getPath()), "\n".getBytes(), StandardOpenOption.APPEND);
	}

}
