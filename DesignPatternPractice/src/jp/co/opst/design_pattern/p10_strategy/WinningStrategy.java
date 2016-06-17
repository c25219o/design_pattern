package jp.co.opst.design_pattern.p10_strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

	private Random random;
	private boolean won;
	private Hand prevHand;

	public WinningStrategy(int seed) {
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		return won ? prevHand : Hand.get(random.nextInt(3));
	}

	@Override
	public void study(boolean isWin) {
		won = isWin;
	}

}
