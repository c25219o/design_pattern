package jp.co.opst.design_pattern.p08_abstractfactory.factory;

public abstract class Item {

	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}
