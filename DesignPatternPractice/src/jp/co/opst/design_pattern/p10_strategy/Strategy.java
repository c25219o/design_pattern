package jp.co.opst.design_pattern.p10_strategy;

public interface Strategy {
	public abstract Hand nextHand();

	public abstract void study(boolean isWin);
}
