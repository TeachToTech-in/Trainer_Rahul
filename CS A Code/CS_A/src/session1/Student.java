package session1;
public class Student {
	private int rollno;
	private String name;
	private long contact;
	
	public void setValues(int r, String s, long c) {
		rollno = r;
		name = s;
		contact= c;
	}
	public void display() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(contact);
	}

}
