package generics;

public class GenericMethod2 {

	public static void main(String[] args) {
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point<>(20, 20);
		double rect = GenericMethod.<Integer, Integer>makeRectangle(p1,p2);
		System.out.println("사각형의 넓이는 " + rect + "입니다.s");
	}

}
