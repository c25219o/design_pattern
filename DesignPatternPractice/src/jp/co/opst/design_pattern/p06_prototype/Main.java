package jp.co.opst.design_pattern.p06_prototype;

import jp.co.opst.design_pattern.p06_prototype.concrete_class.MessageBox;
import jp.co.opst.design_pattern.p06_prototype.concrete_class.UnderLinePen;

public class Main {

	public static void main(String[] args) {

		Manager manager = new Manager();
		UnderLinePen pen = new UnderLinePen('~');
		MessageBox box = new MessageBox('#');

		manager.register("pen", pen);
		manager.register("box", box);

		Product product1 = manager.create("pen");
		Product product2 = manager.create("box");

		product1.use("Hello, My name is Yui.");
		System.out.println();
		product2.use("Hello, My name is Yui.");

	}

}
