package jp.co.opst.design_pattern.p06_prototype;

import java.util.HashMap;

public class Manager {

	private HashMap<String, Product> showcase = new HashMap<>();

	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	public Product create(String protoname) {
		return showcase.get(protoname).createClone();
	}

}
