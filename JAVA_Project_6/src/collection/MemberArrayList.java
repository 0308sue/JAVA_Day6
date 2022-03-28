package collection;

import java.util.ArrayList;

//p410
public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	//추가
	public  void addMember(Member member) {
		arrayList.add(member);
	}
	//제거
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size();i++) {
			Member member= arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		//System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	
	//보기
	public void showAllMember() {
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
		
	}

}
