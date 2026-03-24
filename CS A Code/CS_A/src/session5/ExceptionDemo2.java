package session5;

import java.util.*;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int z = 0;
		System.out.println("Enter The Value of A");
		a = sc.nextInt();
		System.out.println("Enter the Value of B");
		b = sc.nextInt();
		try {
			z = a / b;
		}

		// Unreachable catch block for ArithmeticException.
		// It is already handled by the catch block for RuntimeException
		catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			//The parameter ex of a multi-catch block cannot be assigned
			//ex= new ArithmeticException();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		System.out.println("The Result is = " + z);
		System.out.println("End of Code");

	}
}
