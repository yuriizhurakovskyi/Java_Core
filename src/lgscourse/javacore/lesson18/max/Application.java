package lgscourse.javacore.lesson18.max;

public class Application {

	public static void main(String[] args) {
		Map <String, Integer> map = new Map<>();
		map.addElement("�������", 125);
		map.addElement("�����", 58);
		map.addElement("�����", 158);
		map.addElement("������", 38);
		map.addElement("��������", 18);
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
		
		System.out.println("�������� ������");
		map.deleteByKey("������");
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
		
		System.out.println("�������� ������, ����� 58 �������");
		map.deleteByValue(58);
		
		map.show();
		System.out.println(map);
		
		map.showKeys();
		map.showValues();
	}

}
