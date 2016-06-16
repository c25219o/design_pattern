package jp.co.opst.design_pattern.p08_abstractfactory.listfactory;

import java.util.Iterator;

import jp.co.opst.design_pattern.p08_abstractfactory.factory.Item;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();

		sb.append("<html><head><title>");
		sb.append(title);
		sb.append("</title></head>\n");

		sb.append("<body>\n");

		sb.append("<h1>");
		sb.append(title);
		sb.append("</h1>\n");

		sb.append("<ul>");

		Iterator<Item> iterator = content.iterator();
		while (iterator.hasNext()) {
			sb.append(iterator.next().makeHTML());
		}

		sb.append("</ul>");
		sb.append("<hr><address>");
		sb.append(author);
		sb.append("</address>");
		sb.append("</body></html>");

		return sb.toString();
	}

}
