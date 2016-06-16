package jp.co.opst.design_pattern.p07_builder;

public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);

	public abstract void makeItems(String[] items);
    public abstract void close();

}
