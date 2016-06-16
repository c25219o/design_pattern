package jp.co.opst.design_pattern.p08_abstractfactory.listfactory;

import jp.co.opst.design_pattern.p08_abstractfactory.factory.Factory;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Link;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Page;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
