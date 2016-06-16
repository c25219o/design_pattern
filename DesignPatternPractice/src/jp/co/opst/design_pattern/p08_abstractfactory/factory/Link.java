package jp.co.opst.design_pattern.p08_abstractfactory.factory;

public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

}
