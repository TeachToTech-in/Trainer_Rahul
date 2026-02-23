package session4;

class A {
	final void m1() {
		System.out.println("I am A");
	}
}

class B extends A {
	// Cannot override the final method from A
	void m1() {
		System.out.println("I am B");
	}

}
