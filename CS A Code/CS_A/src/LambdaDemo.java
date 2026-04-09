interface I2 {
	int math(int a, int b);
}
interface I3 {
	void square(int a);
}

public class LambdaDemo {
	public static void main(String[] args) {
			I2 i = (x,y)->x+y;
			System.out.println(i.math(10, 20));
			I2 i1 = (x,y)->x*y;
			System.out.println(i1.math(10, 20));
			I3 i3= x -> System.out.println(x*x);
			i3.square(4);
	}
}
