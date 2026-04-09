package collection;

import java.util.TreeSet;

public class TDemo {
public static void main(String[] args) {
	TreeSet< Integer> t1 = new TreeSet<>(new MyComparator());
	t1.add(12);
	t1.add(12);
	t1.add(55);
	t1.add(33);
	System.out.println(t1);
	
}
}
