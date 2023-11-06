package Chap_11;

public class ExTest {
	
	public void c() throws Exception{
		System.out.println("C1");
		// int v = 10 / 0;
		System.out.println("C2");

			System.out.println("C-finally");
	}
	
	
	public  void b() throws Exception{
		System.out.println("B1");
		c();
		System.out.println("B2");		
	}
	
	
	public  void a() {
		System.out.println("A1");
		try {
		b();
		}catch(Exception e) {
			//e.printStackTrace();
		System.out.println("오류발생 : " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		ExTest et = new ExTest();
		et.a();  // static이 있기에.
		
		
		
		try {
			Thread.sleep(3000); // 프로그램을 잠시 멈춤. 딜레이 3000 = 3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		System.out.println("Fine!");
		
	}
}
