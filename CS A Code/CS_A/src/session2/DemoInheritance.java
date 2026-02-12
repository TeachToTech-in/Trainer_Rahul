package session2;

public class DemoInheritance {
	public static void main(String[] args) {
		A a1 = new A();
		a1.setX(20);
		a1.displayX();//20
		
		B b1 = new B();
		b1.setX(10);
		b1.setY(20);
		b1.displayX();
		b1.displayY();
	}
}
