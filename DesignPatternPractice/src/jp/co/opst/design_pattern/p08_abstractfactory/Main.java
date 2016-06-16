package jp.co.opst.design_pattern.p08_abstractfactory;

import jp.co.opst.design_pattern.p08_abstractfactory.factory.Factory;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Link;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Page;
import jp.co.opst.design_pattern.p08_abstractfactory.factory.Tray;

public class Main {
	public static void main(String[] args) {

        Factory factory = Factory.getFactory("jp.co.opst.design_pattern.p08_abstractfactory.listfactory.ListFactory");

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        Link yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
		Link google = factory.createLink("Google", "http://www.google.com/");

		Tray trayNews = factory.createTray("新聞");
		trayNews.add(asahi);
		trayNews.add(yomiuri);

		Tray traysearch = factory.createTray("サーチエンジン");
		traysearch.add(yahoo);
		traysearch.add(google);

		Page page = factory.createPage("LinkPage", "Yui");
		page.add(trayNews);
		page.add(traysearch);
		page.output();
    }
}
