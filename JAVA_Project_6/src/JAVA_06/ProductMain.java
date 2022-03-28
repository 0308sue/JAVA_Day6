package JAVA_06;


	class Product{
		protected int price;
		protected int bonus;
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
			return "TV ";
		}
		
	}
	class Computer extends Product{
		public Computer(int price) {
			super(price);			
		}

		@Override
		public String toString() {
			return "Computer ";
		}
		
	}
	class Audio extends Product{
		public Audio(int price) {
			super(price);	
		}

		@Override
		public String toString() {
			return "Audio ]";
		}
		
	}
	class Buyer{
		public Product[]arr = new Product[10];
		public int cnt;
		
		private int money;
		private int point;
		public Buyer(int money) {
			this.money = money;
		}
	public void buy(Product p) {
		arr[cnt++]=p;
		money -= p.price;
		point += p.bonus;
	}
	public void show() {
		int sum = 0;
		for(int i = 0;i<cnt;i++) {
			sum += arr[i].price;
			System.out.println("구매제품 : "+arr[i]);
		}
		System.out.println("합계 : "+sum);
		System.out.println("포인트 : "+point);
	}
		
}
	public class ProductMain {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		TV tv = new TV(200);
		Computer com = new Computer(150);
		Audio audio = new Audio(70);
		b.buy(tv);
		b.buy(tv);
		
		
	}

}
