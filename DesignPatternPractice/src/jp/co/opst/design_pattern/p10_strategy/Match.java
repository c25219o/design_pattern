package jp.co.opst.design_pattern.p10_strategy;

public enum Match {

	WIN, LOSE, EVEN;

	public static Match fight(Hand me, Hand enemy) {

		if (me.equals(enemy)) {
			return EVEN;
		}

        switch (me) {
		case STONE:
			if (enemy.equals(Hand.SCISSORS)) {
				return WIN;
			}
			break;

		case SCISSORS:
			if (enemy.equals(Hand.PAPER)) {
				return WIN;
			}
			break;

		case PAPER:
			if (enemy.equals(Hand.STONE)) {
				return WIN;
			}
			break;
        }
		return LOSE;
    }

}
