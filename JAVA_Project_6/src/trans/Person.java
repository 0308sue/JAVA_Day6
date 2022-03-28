package trans;

import java.util.ArrayList;

import collection.Student;

public class Person {
	private String studentName;
	private int grade;
	private int money;
	//private Trans[] arr = new Trans[10];
//	private int cnt;
	ArrayList<Trans>alist = new ArrayList<Trans>();
	
	Person(String studentName , int  money){
		this.studentName = studentName;
		this.money = money;
	}
	public void take(Trans trans, int unit) {
		trans.take(unit);
		this.money -= unit;
//		arr[cnt++] = trans;
		alist.add(trans);
	
}
//public void takeBus(Bus bus, int unit) {
//	bus.take(unit);
//	this.money -= unit;
//	arr[cnt++] = bus;
//	
//}
//
//public void takeTaxi(Taxi taxi, int unit) {
//	taxi.take(unit);
//	this.money -= unit;
//	arr[cnt++] = taxi;
//}
//public void takeSubway(SubWay subway, int unit) {
//	subway.take(unit);
//	this.money -= unit;
//	arr[cnt++] = subway;
//}
public void showInfo() {
	for(int i=0 ; i<alist.size();i++) {
		System.out.println(alist.get(i));
	}
	for(Trans t:alist) {
		System.out.println(t);
	}
	System.out.println(studentName + " 의 남은돈 :" + money);
}

}

