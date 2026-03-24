package session5;

import java.io.IOException;

public class CheckedDemo {
	static void demo() throws  IOException{
		System.out.println("Before");
		//Unhandled exception type IOException
		throw new IOException("Explicitly Thrown");
	}

	public static void main(String[] args) throws IOException {
		demo();
	}
}
