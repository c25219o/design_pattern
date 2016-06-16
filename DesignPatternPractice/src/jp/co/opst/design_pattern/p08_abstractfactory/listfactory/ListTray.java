package jp.co.opst.design_pattern.p08_abstractfactory.listfactory;

import java.util.Iterator;

import jp.co.opst.design_pattern.p08_abstractfactory.factory.Item;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption);
		sb.append("\n");
		sb.append("<ul>\n");

		Iterator<Item> iterator = tray.iterator();

		while (iterator.hasNext()) {
			sb.append(iterator.next().makeHTML());
		}

		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();
	}

}
