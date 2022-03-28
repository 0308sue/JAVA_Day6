package trans;

public class TakeTransMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동",15000);
		Person p2 = new Person("이순신",10000);
		
		Bus bus = new Bus(100);
		SubWay subwayGreen = new SubWay("2호선");
		Taxi taxi = new Taxi(1234);
		
//		p1.takeBus(bus,1000);
//		p1.takeTaxi(taxi,4500);
		p1.take(bus,1000);
		p1.take(taxi,4500);
		p1.showInfo();
		System.out.println();
		p2.take(subwayGreen, 1500);
		System.out.println();
		subwayGreen.showInfo();
		bus.showInfo();
		taxi.showInfo();
	}
	
	

}
