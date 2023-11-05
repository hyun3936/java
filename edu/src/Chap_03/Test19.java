package Chap_03;

public class Test19 {
	public static void main(String[] args) {
		int score = 90;
		String result = "";  // ""빈문자열로 초기화

		if (score >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		System.out.println(result);
	}
}
