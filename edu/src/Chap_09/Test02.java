package Chap_09;

public class Test02 {
	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		String s5 = "JAVA";
		
		
		System.out.println(s1 + "::" +s3);
		
		// s1 == s2?
		// s3 == s4?
		// s1 == s3?
		
		
		
		
		if (s1 == s3) {
			System.out.println("동일 객체이다.1-3");
		}
		else {
			System.out.println("다른 객체이다.1-3");
		}
		
		
		if (s2 == s4) {
			System.out.println("동일 객체이다2-4.");
		}
		else {
			System.out.println("다른 객체이다2-4.");
		}
		
		
		
		if (s1.equals(s4)) {
			System.out.println("동일 객체이다1-4.");
		}
		else {
			System.out.println("다른 객체이다1-4.");
		}
		
		
		
		
		
		if (s1.equals(s5)) {
			System.out.println("동일 객체이다 1-5.");
		}
		else {
			System.out.println("다른 객체이다 1-5.");
		}
		
		
	}

}
