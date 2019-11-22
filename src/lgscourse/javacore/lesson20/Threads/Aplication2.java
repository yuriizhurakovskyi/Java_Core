package lgscourse.javacore.lesson20.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Aplication2 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService1 = Executors.newFixedThreadPool(1);
		executorService1.execute(new MyThread(10));
		executorService1.awaitTermination(12, TimeUnit.SECONDS);
		ExecutorService executorService2 = Executors.newScheduledThreadPool(1);
		System.out.println();
		executorService2.execute(new RunnableThread("Runnable2",10));
		executorService2.shutdown();
		
	}

}
