package lgscourse.javacore.lesson22.Pets;

public class Application {

	public static void main(String[] args) {
		Pets cow = () -> System.out.println("� ������- ����-����");
		Pets cat = () -> System.out.println("� ��- �����-�����");
		Pets dog = () -> System.out.println("� ���- �����-�����");
		
		cow.voice();
		cat.voice();
		dog.voice();
	}

}
