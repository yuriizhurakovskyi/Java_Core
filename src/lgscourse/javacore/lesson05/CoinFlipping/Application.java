package lgscourse.javacore.lesson05.CoinFlipping;

public class Application {
	public static void main(String[] args) {
		CoinFlipping.flipCoin();
		CoinFlipping.showResult();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CoinFlipping.flipCoin();
		CoinFlipping.showResult();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CoinFlipping.flipCoin();
		CoinFlipping.showResult();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CoinFlipping.flipCoin();
		CoinFlipping.showResult();
	}
}
