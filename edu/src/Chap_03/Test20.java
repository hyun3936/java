package Chap_03;

public class Test20 {

	public static void main(String[] args) {
		int score = 90;
		
		if (score < 100) {
			bonus = 10;
		}else if (100<score &score < 200) {
			bonus = 20;
		}
		else
			bonus = 30;
		score += bonus;
		System.out.println();

	}

}
