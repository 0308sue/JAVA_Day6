package trans;

public class Bus extends Trans {
private int busNumber;
	
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
//	public void take(int money) {
//		super.take(money);
//		
//	}
	@Override
	public void showInfo() {
		System.out.println("버스번호 :"+busNumber);
		super.showInfo();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "버스";
	}
	
}
