package collection;

import java.util.ArrayList;
import java.util.Scanner;

import collection.Student;

public class TeacherMain {
	static Scanner sc =new Scanner(System.in);
    //배열 이름 : arr
//	Student[] arr = new Student[50];
	//ArrayList 생성
	ArrayList<Student>alist = new ArrayList<Student>();
	int cnt;
	public void showMenu() {
		System.out.println("선택하세요>>");
		System.out.println("1.입력 2.전체보기/종료");
		System.out.println("선택>>");
	}
	public void inputData() {
		System.out.println("성적입력>>");
		System.out.println("이름 >>");
		String name = sc.next();
		System.out.println("국어 영어 수학 >>");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		//arr  첫번째에 학생 정보 저장
		alist.add(new Student(name, kor, eng, math));
	}
	public void viewData() {
		rankMethod();
//		for(int i=0; i<alist.size();i++) {
//			System.out.println("이름 : " + alist.get(i).getName());
//			System.out.println("국어 : " + alist.get(i).getKor());
//			System.out.println("영어 : " + alist.get(i).getEng());
//			System.out.println("수학 : " + alist.get(i).getMath());
//			System.out.println("총점 :" + alist.get(i).getTotal());
//			System.out.println("평균 :" + alist.get(i).getAvg());
//			System.out.println("석차 : " +alist.get(i).getRank());
//			System.out.println(); 
//		}
		int sum = 0;
		for(Student s:alist) {
			System.out.println("이름 : " + s.getName());
			System.out.println("국어 : " + s.getKor());
			System.out.println("영어 : " + s.getEng());
			System.out.println("수학 : " + s.getMath());
			System.out.println("총점 :" + s.getTotal());
			System.out.println("평균 :" + s.getAvg());
			sum += s.getTotal();
			System.out.println("석차 : " +s.getRank());
			System.out.println(); 			
		}
		System.out.println("반 총점 : "+sum);
		System.out.println("반 총점의 평균 : "+sum/alist.size());
	}
	private void rankMethod() {
		for(int i=0; i<alist.size()-1 ;i++) {
			for(int j=i+1; j<alist.size(); j++) {
				if(alist.get(i).getTotal() > alist.get(j).getTotal()) {
					alist.get(j).setRank();  //rank를 1증가하는 메소드
				}else if(alist.get(i).getTotal() <  alist.get(j).getTotal()) {
					alist.get(i).setRank();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TeacherMain t = new TeacherMain();
		while(true) {
			t.showMenu();
			int num = sc.nextInt();
			switch(num) {
			case 1 : t.inputData(); break;
			case 2: t.viewData();
							System.exit(0); //종료
			default : System.out.println("입력오류");
			} //switch
		}//while
	} //main

} //class