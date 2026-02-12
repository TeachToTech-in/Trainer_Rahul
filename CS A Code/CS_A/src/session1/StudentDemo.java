package session1;
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		//The field Student.rollno is not visible
		s1.setValues(20,"Rahul", 9015088066L);
		s1.display();
		
	}
}
