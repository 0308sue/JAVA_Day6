package Shape;

public class AbsShapeMain {
		public static void main(String[] args) {
			AbsCircle c1= new AbsCircle();
			c1.draw();
			c1.print();
			c1.move();
			
			AbsSquare s1 = new AbsSquare();
			s1.draw();
			s1.print();
			s1.move();
			System.out.println("======");
		//	AbsShape as = new AbsShape(); 오류발생
			// 추상클래스는 객체 생성 못함
			AbsShape as = new AbsCircle();
			as.draw();
			as.print();
			as.move();
		}

	}
	
