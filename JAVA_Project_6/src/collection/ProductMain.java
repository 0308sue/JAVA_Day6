package collection;

import java.util.ArrayList;

class Product{
	protected int price; //가격
	protected int bonus;  // 포인트점수는 가격 10%
	public Product(int price) {
		this.price = price;
		bonus = price/10;
	}
}

class TV extends Product{
	public TV(int price) {
		super(price);
	}

	@Override
	public String toString() {
			return "티비";
	}
	
}
class Computer extends Product{
	public Computer(int price) {
		super(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "컴퓨터";
	}
}
class Audio extends Product{
	public Audio(int price) {
		super(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "오디오";
	}
}

class Buyer{
//	private Product[] arr = new Product[10];
	ArrayList<Product >alist = new ArrayList<Product>();

	
	private int money;
	private int point;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Product p) {//물품구매
//		arr[cnt++] = p;
		alist.add(p);
		money -=p.price;
		point +=p.bonus;
	}
	public void show() { // 구매 내역 출력
		//구매리스트
		int sum = 0;
		for(int i=0; i<alist.size();i++) {
			sum += alist.get(i).price;
			System.out.println("구매 제품 : " +alist.get(i));
		}
		
		for(Product p:alist) {
			sum +=p.price;
			System.out.println("구매 제품 : "+p);
		}
		//합계
		System.out.println("합계 : " + sum);
		//포인트
		System.out.println("포인트 : " + point);
		 System.out.println("남은 돈 :" + money);
		}
	
		public void refund(Product p) {//반품 
	//		arr[cnt++] = p;
			alist.remove(p);
			money +=p.price;
			point -=p.bonus;
		}
}

public class ProductMain {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		TV tv = new TV(200);
		Computer com = new Computer(150);
		Audio audio = new Audio(70);
		b.buy(tv);
		b.buy(com);
		b.show();
		b.refund(tv);
		b.refund(com);
		b.show();
		
		

	}

}

