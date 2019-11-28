package lgscourse.javacore.lesson22.CoinFlipping;

import java.util.Random;

public class Application {
	public static void main(String[] args) {
		ICoinFlipping coinFlipping = () -> new Random().nextBoolean();
		IShowCoinFlippingResult coinFlippingResult = (b) -> { if(b) System.out.println("Heads"); else System.out.println("Tails");};
		coinFlippingResult.show(coinFlipping.flipCoin());
	}
}
