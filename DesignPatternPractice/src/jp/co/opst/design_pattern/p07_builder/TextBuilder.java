package jp.co.opst.design_pattern.p07_builder;

public class TextBuilder extends Builder {

	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		sb.append("=====================\n");
		sb.append("<<" + title + ">>\n");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) {
		sb.append("■");
		sb.append(str);
		sb.append("\n\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String string : items) {
			sb.append(string);
			sb.append("\n");
		}
		sb.append("\n");
	}

	@Override
	public void close() {
		sb.append("=====================\n");
	}

}
