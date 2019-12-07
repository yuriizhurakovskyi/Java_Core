package lgscourse.javacore.lesson05.CoinFlipping;

import java.util.Random;

public class CoinFlipping {
	private static Random random = new Random();
	private static boolean sideOfCoin;
	public static void flipCoin() {
		sideOfCoin = random.nextBoolean();
	}
	public static void showResult() {
		if(sideOfCoin == true) {
			System.out.println("Heads");
		}
		else System.out.println("Tails");
	}
}
