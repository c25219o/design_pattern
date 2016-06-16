package jp.co.opst.design_pattern.p06_prototype;

public interface Product extends Cloneable {

	public void use(String str);

	public Product createClone();

}
