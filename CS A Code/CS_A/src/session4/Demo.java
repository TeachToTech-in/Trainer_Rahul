package session4;

class Parent {
	int z;

	public Parent() {
		System.out.println("No Argument Invoked of Parent");
	}

	public Parent(int z) {
		super();
		this.z = z;
		System.out.println("Parameterized Invoked of Parent");
	}

}

class Demo extends Parent{
	Demo() {
		this(10);
		//Constructor call must be the first statement in a constructor
		super(12);
		System.out.println("No Asrgument Constructor Child");
	}

	Demo(int x) {
		super(12);
		System.out.println("Parameterized Constructor of Child");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
	}
}
