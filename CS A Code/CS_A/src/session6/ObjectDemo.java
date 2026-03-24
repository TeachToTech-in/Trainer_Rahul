package session6;

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101,"Rahul Dixit");
		Student s3 = new Student(101,"Rahul Dixit");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s3.hashCode());
		System.out.println(s3);
		System.out.println(s3.getClass());
	}
}
