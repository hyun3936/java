package Chap_06;

class Count { //public 없음.
	public static int totalCount;  // 클래스 필드(=정적필드) --> 코드 메모리 영역에 할당. (인스턴스 필드와 반대)
	int count;
}

public class CountTest {   // 소스 파일이름은 public으로 선언한 클래스 이름으로 지정, 그 외 클래스는 public으로 지정 못함.
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;

		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);

	}
}
