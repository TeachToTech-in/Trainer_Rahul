package session4;

public class VariableFinalDemo {
	public static void main(String[] args) {
		final int x;
		x = 90;
		System.out.println(x);
		// The final local variable x may already 
		//have been assigned
		x = 89;
	}
}
