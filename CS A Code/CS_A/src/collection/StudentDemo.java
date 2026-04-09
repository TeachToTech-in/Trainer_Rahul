package collection;

import java.util.TreeSet;

public class StudentDemo {
	public static void main(String[] args) {
			TreeSet<Student> s = new TreeSet<>(new MyStudentComparator());
			s.add(new Student(1,"Rahul"));
			s.add(new Student(2,"Kushagra"));
			s.add(new Student(3,"Aashu"));
			System.out.println(s);
	}
}
