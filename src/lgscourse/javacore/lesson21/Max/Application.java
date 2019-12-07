package lgscourse.javacore.lesson21.Max;

import java.time.*;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(convertToLocalDate(date));
		System.out.println(convertToLocalTime(date));
		System.out.println(convertToLocalDateTime(date));
	}
	
	public static LocalDate convertToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static LocalTime convertToLocalTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

	public static LocalDateTime convertToLocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
}
