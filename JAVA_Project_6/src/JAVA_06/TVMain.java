package JAVA_06;

class TV1{
	private int size;
	public TV1(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
}

class ColorTV extends TV1{
	protected int size,color;
	ColorTV(int size,int color){
//		this.size = size;
		super(size);
		this.color = color;
	}
	public void print() {
		System.out.println(super.getSize()+"인치 "+color+"컬러");
	}
}

class IPTV extends ColorTV {
	private String ip;
	IPTV(String ip,int size,int color){
		super(size,color);
		this.ip = ip;
	}
	public void print() {
		System.out.println("나의 TV는 "+ip+"주소의 ");
		super.print();
	}
}
public class TVMain {

	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32,1024);
		mytv.print();
		
		ColorTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.print();

	}

}
