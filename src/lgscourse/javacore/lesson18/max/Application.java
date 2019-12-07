package lgscourse.javacore.lesson18.max;

public class Application {

	public static void main(String[] args) {
		Map <String, Integer> map = new Map<>();
		map.addElement("Іграшки", 125);
		map.addElement("Книги", 58);
		map.addElement("Ручки", 158);
		map.addElement("Зошити", 38);
		map.addElement("Блокноти", 18);
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
		
		System.out.println("Видалити зошити");
		map.deleteByKey("Зошити");
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
		
		System.out.println("Видалити товару, якого 58 одиниць");
		map.deleteByValue(58);
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
	}

}
