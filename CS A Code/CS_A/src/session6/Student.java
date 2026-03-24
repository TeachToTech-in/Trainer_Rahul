package session6;

import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Student s4 = (Student)obj;
		return (roll==s4.roll)&&name.equals(s4.name); 
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}
