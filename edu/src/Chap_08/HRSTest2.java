package Chap_08;

public class HRSTest2 {
	// instanceof 연산자
	// if(참조변수 instanceof 객체 타입){실행문;}
	

	public static void clacTax(Employee e) {
		if (e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
			System.out.println(e.annual_sales);
		} else if (e instanceof Manager) {
			System.out.println("Manager 입니다.");
			System.out.println(e.num_team);
		} else if (e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
			System.out.println(e.num_project);
		} else {
			System.out.println("Employee 입니다.");
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();

		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}