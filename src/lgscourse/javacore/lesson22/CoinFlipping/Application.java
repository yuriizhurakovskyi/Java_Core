package lgscourse.javacore.lesson22.CoinFlipping;

import java.util.Random;

public class Application {
	public static void main(String[] args) {
		ICoinFlipping coinFlipping = () -> {if(new Random().nextBoolean()) System.out.println("Heads"); else System.out.println("Tails");};
		coinFlipping.flipCoin();
		coinFlipping.flipCoin();
		coinFlipping.flipCoin();
		coinFlipping.flipCoin();
		coinFlipping.flipCoin();
	}
}
