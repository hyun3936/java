package Chap_14;

interface Multiply{
	double getValue();
}

public class Test02 {
	public static void main(String[] args) {
		
		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());
		
		m = () -> 10 * 3;
		System.out.println(m.getValue());
		
	}
}
