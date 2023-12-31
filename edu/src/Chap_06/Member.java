package Chap_06; // 생성자 오버로딩

public class Member {
		
	private String name;
	private String hobby;
	private int age;
	
	
	
	public Member() {      // 괄호안에 아무것도 없는 (매개 변수가 없는) 생성자 : 기본 생성자(default constructor)
		System.out.println("Member 생성자가 호출되었습니다");
	}
	
	public Member(String name) {
		System.out.println("Member 생성자1이 호출되었습니다1");
	}
	
//	public Member(String hobby) {
//		System.out.println("Member 생성자1이 호출되었습니다2");
//	} // 자바는 name과 hobby를 구분하지 못한다. 같은 String이 두개가 있기 때문에 메소드 중복 오류가 남.
	
	
	public Member(int age) {
		System.out.println("Member 생성자2가 호출되었습니다");
	}
	
	public Member(String name, int age) {
		System.out.println("Member 생성자3가 호출되었습니다");
	}
	
	
	
	// 같은 Member인데 파라미터가다른게 4개
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public static void main(String[] args) {
		Member m1 = new Member();  // 기본 생성자
 		Member m2 = new Member("홍");
 		Member m3 = new Member(20);
 		Member m4 = new Member("Lee", 10);
	}
	
}
