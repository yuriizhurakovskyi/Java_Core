package lgscourse.javacore.lesson20.Threads;

public class RunnableThread implements Runnable {
	private String name;
	private Thread thread;
	private int count;
	private int[] fib;
	
	public RunnableThread(int count) {
		this.count = count;
		this.name = "Runnable";
		this.thread = new Thread(this);
		this.thread.start();
	}

	public RunnableThread(String name, int count) {
		this.name = name;
		this.count = count;
	}



	@Override
	public void run() {
		System.out.print("Потік ");
		fib = new int[count];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 2] + fib[i - 1];
		}
		System.out.print(name + ": ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int j = fib.length - 1; j >= 0; j--) {
			System.out.print(fib[j] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public Thread getThread() {
		return thread;
	}

	public int getCount() {
		return count;
	}

	public int[] getFib() {
		return fib;
	}
	
}
