package Chap_09;

public class Test12 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer obj1 = n1; // Integer.valueOf(n1)

		Integer obj2 = Integer.valueOf("20"); // 20을 객체로 만듦
		int n2 = obj2; // obj2.intValue()
		// 객체를 정수로 바꾸니까 언박싱인데 아무말없으니 오토 언박싱

		Integer obj3 = 30; //

		int n3 = obj3 + 40;

		System.out.println(n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);

		String s1 = "9";
		String s2 = "21";
		int ns1 = Integer.parseInt(s1);
		int ns2 = Integer.parseInt(s2);
		if (s1.compareTo(s2) < 0)
			System.out.println("9 < 21");
		else
			System.out.println("9 > 21");
		// 문자열이기 때문에 9가 21보다 크다고 나온다.

	}
}
