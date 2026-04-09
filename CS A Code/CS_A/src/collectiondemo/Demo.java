package collectiondemo;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Rahul");
		a1.add("Kushagra");
		a1.add("Hemant");
		System.out.println(a1);
		a1.add(1,"Dixit");
		System.out.println(a1);
	}
}
