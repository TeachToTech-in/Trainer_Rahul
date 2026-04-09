interface I1 {
	void display();
}
public class AnonymousDemo {
	public static void main(String[] args) {
		//Cannot instantiate the type I1 While 
		//creating object of Interface
		I1 i = new I1() {

			@Override
			public void display() {
				System.out.println("Hello");
				
			}
			//The type new I1(){} must implement 
			//the inherited abstract method I1.display()
		};
		i.display();
	}
}
