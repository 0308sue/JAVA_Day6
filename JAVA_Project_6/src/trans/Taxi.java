package trans;

public class Taxi  extends Trans{
	private int taxiNumber;
	
	Taxi(int taxiNumber){
		this.taxiNumber = taxiNumber;
	}
	
	@Override
	public void showInfo() {
		System.out.println("택시 번호 : "+taxiNumber);
		super.showInfo();
	}

	@Override
	public String toString() {
		return "택시";
	}

//	public void take(int money) {
//		super.take(money);
//	}
}
