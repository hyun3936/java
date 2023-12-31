package Chap_11; // 예외 처리하기

public class ExTest_v2 { // 예외 던지기 : throws 문 연습.

	public void d() {
		throw new IndexOutOfBoundsException("에러가 발생했습니다.");
		// 이렇게 길게 쓸필요없이 그냥 Exception만 적어도됨. 부모 클래스 이기 때문.

//		int aa = 0; // 코드가 이 줄 까지 닿지 않음.
	}

	public void c() throws Exception {
		System.out.println("C1");
//		int v = 10 / 0;
		d();
		System.out.println("C2");
	}

	public void b() throws Exception {
		System.out.println("B1");
		c();
		System.out.println("B2");
	}

	public void a() {
		System.out.println("A1");
		try {
			b();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("오류발생 : " + e.getMessage());
		}
		System.out.println("A2");
	}

	public static void main(String[] args) throws InterruptedException {

		ExTest_v2 et = new ExTest_v2();
		et.a(); // static이 있기에.

		try {
			Thread.sleep(3000); // 프로그램을 잠시 멈춤. 딜레이 3000 = 3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fine!");

	}
}
