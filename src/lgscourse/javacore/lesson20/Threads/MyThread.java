package lgscourse.javacore.lesson20.Threads;

public class MyThread extends Thread {
	private int count;
	private String name;
	private int[] fib;

	public MyThread(int count) {
		this.count = count;
		this.name = "Thread";
	}

	@Override
	public void run() {
		System.out.print("Потік " + name + ": ");
		fib = new int[count];
		fib[0] = 1;
		fib[1] = 1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.print(fib[0]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.print(" " + fib[1]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 2] + fib[i - 1];
			System.out.print(" " + fib[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
