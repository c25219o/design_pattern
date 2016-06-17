package jp.co.opst.design_pattern.p10_strategy;

import java.util.HashMap;
import java.util.Map;

public enum Hand {

	STONE(0, "ぐー"), SCISSORS(1, "ちょき"), PAPER(2, "ぱー");

	private int handValue;
	private String strValue;

	private static Map<Integer, Hand> handMap = new HashMap<>();

	private Hand(int handValue, String strValue) {
		this.handValue = handValue;
		this.strValue = strValue;
	}

	static {
		for (Hand each : Hand.values()) {
			handMap.put(each.handValue, each);
		}
	}

	@Override
	public String toString() {
		return strValue;
	}

	public boolean equals(Hand hand) {
		return this.handValue == hand.handValue;
	}

	public static Hand get(int value) {
		return handMap.get(value);
	}

	public boolean isStrongerThan(Hand enemy) {
		return fight(enemy) == Match.WIN;
	}

    public boolean isWeakerThan(Hand enemy) {
		return fight(enemy) == Match.LOSE;
    }

	private Match fight(Hand enemy) {
		return Match.fight(this, enemy);
    }

}
