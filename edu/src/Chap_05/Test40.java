package Chap_05;
//
//import java.util.Date;

//class Sub{
//	private String name;
//	public int age;
//	
//	int sum() {return 0;}
//	public int avg() {return 0;}
//	
//}
//
//
//public class Test40 {
//	public static void main(String[] args) {
//		Sub s = new Sub();
//		
//		Date d = new Date();
//		
//	}
//
//}

public class Test40{
	private static int sum(int a, int b) {
		int result = a + b;
		return result;
		
	}
	
//public static void main(String[] args) {
//	int s = sum(10,20);
//	System.out.println("sum " + s );
//}
	
private static double avg(int...a) { // 가변길이 인자: 같은 타입의 데이터들을 오버로딩없이 인자의 갯수 다르게 호출
	double sum = 0.0;
	for(int i = 0; i < a.length ;i++) sum +=a[i];
	return sum/a.length;
}


private static int min(int...a) {
	// 최소값을 저장할 변수 선언
	int res = a[0];
	
	//가변 길이 인수를 저장한 a의 길이만큼 반복한다.
	for (int i=0 ; i < a.length ; i++) {
		if( a[i] < res) res = a[i];	

	}
			return res;
	
}



private static int max(int...a) {
	int res_max = a[0];
	
	for (int i=1 ; i < a.length ; i++) {
		if( a[i] > res_max) res_max = a[i];	

	}
		return res_max;
	
}





public static void main(String[] args) {
	System.out.println("sum: " + sum(10,20));
	System.out.println("avg: " + avg(1, 2, 3, 4, 5));
	System.out.println("min: " + min(6, 4, 8, 7, 3));
	System.out.println("max: " + max(6, 4, 8, 7, 3));
}
}




