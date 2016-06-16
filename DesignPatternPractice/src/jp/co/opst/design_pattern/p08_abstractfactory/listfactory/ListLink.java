package jp.co.opst.design_pattern.p08_abstractfactory.listfactory;

import jp.co.opst.design_pattern.p08_abstractfactory.factory.Link;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
