package Chap_08;

enum Mandarin{
	금귤, 한라봉, 레드향, 천혜향, 황금향;
}


public class EnumTest02 {
	public static void main(String[] args) {
		
		Mandarin ma = Mandarin.한라봉;
		
		System.out.println("이름 : " + ma.name());
	}

}
