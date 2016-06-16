package jp.co.opst.design_pattern.p06_prototype.concrete_class;

import jp.co.opst.design_pattern.p06_prototype.Product;

public class UnderLinePen implements Product {

	private static final char DEFAULT_UL_CHAR = '~';
	private char ulchar;
	private char quote = '\"';

	public UnderLinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String str) {
		System.out.println(quote + str + quote);
		printLine(str.getBytes().length);
	}

	@Override
	public Product createClone() {
		try {
			return (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return new UnderLinePen(DEFAULT_UL_CHAR);
		}
	}

	private void printLine(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}

}
