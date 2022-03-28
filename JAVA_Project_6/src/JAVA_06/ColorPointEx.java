package JAVA_06;

class point {
	protected int x,y;
	point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class Colorpoint extends point {
	private String color;
	Colorpoint(int x,int y,String color){
		super(x,y);
		this.color = color;
	}
	public void showPoint() {
		System.out.println("("+super.x+","+super.y+")"+color);
	}
}


public class ColorPointEx {

	public static void main(String[] args) {
		point p = new point(3,4);
		p.showPoint();
		
		Colorpoint cp = new Colorpoint(2,5,"red");
		cp.showPoint();
		
		point p1 = new Colorpoint(7,9,"yellow");
		p1.showPoint();
		

	}

}
