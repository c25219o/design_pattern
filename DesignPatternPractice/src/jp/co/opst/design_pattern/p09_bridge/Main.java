package jp.co.opst.design_pattern.p09_bridge;

public class Main {

	public static void main(String[] args) {
		Display display1 = new Display(new StringDisplayImpl("Hello"));
		Display display2 = new CountDisplay(new StringDisplayImpl("Good Morning"));
		CountDisplay display3 = new CountDisplay(new StringDisplayImpl("GoodNight"));

		display1.display();
		display2.display();
		display3.display();
		display3.multiDisplay(5);
	}
}
