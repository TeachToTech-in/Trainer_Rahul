package session2;

public class DemoInheritance {
	public static void main(String[] args) {
		//The constructor A() is undefined
		A a1 = new A();
		A a2 = new A(10);
		//The constructor A(double) is undefined
		A a3 = new A(3.3);
		a1.displayX();
		a2.displayX();
	}
}
