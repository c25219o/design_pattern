package jp.co.opst.design_pattern.p06_prototype.concrete_class;

import jp.co.opst.design_pattern.p06_prototype.Product;

public class MessageBox implements Product {

	private static final char DEFAULT_DECO_CHAR = '*';

	private char decochar;
	private String preDeco;
	private String sufDeco;

	public MessageBox(char decochar) {
		this.decochar = decochar;
		preDeco = decochar + " ";
		sufDeco = " " + decochar;
	}

	@Override
	public void use(String str) {
		int length = str.getBytes().length;
		printDecoLine(length);
		System.out.println(preDeco + str + sufDeco);
		printDecoLine(length);
	}

	@Override
	public Product createClone() {
		try {
			return (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return new MessageBox(DEFAULT_DECO_CHAR);
		}
	}

	private void printDecoLine(int length) {
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}

}
