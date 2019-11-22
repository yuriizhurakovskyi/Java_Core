package lgscourse.javacore.lesson20.Threads;

import java.util.Scanner;

public class Application {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int count = Integer.parseInt(scanner.nextLine());
			MyThread myThread = new MyThread(count);
			myThread.start();
			try {
				myThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			RunnableThread myThread2 = new RunnableThread(count);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
