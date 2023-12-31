package Chap_08;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales; // 연간 판매 실적
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	int num_project; // 컨설팅 참여 수
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {
	int num_team; // 관리 팀  수
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
	}

	Salesman s3 = new Salesman(); // 자기 자신
	Employee e3 = new Salesman(); // 부모
	Object o3 = new Salesman(); // 최상위

	// type casting
	// Salesman s4 = (Salesman); // 다못적음 깃허브 참고하고 완성하기

}

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
//		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		Salesman s2 =s;
//		System.out.println(s2.toString());
//		
//		if(s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//		} else {
//			System.out.println("서로 다른 객체입니다.");

//		Salesman s1 = new Salesman();
//		Employee s2 = new Salesman();
//		Object s3 = new Salesman();
//
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//		Manager m3 = new Manager();
//		Director m4 = new Manager(); // 오류 발생 : 자기 자신의 자식클래스(Director)에 할당x, 할려면 부모클래스에
		
		
		
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();    // 라인 32에 Manager가 abstract class Manager되어있으면 빨간줄이 나오는데 abstract를 지우면 빨간줄 사라짐.
		Employee m2 = new Manager();
		Manager m3 = new Manager();
//		Director m4 = new Manager(); // 오류발생 Director는 Manager의 자손
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
