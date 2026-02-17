package session2;

public class A {
	private int x;

	A() {
		x = 5;
	}

	A(int x1) {
		x = x1;
	}

	public void setX(int x1) {
		x = x1;
	}

	public void displayX() {
		System.out.println("The Value of X is = " + x);
	}
}
