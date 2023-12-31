package Chap_07.inheritance.test;

public class Parent {

	private String name;

	public Parent() {
		name = "홍길동"; // 여긴 this붙여도 되고 안붙여도 된다.
		System.out.println("Parent()");
	}

	public Parent(String name) {
		this.name = name; // 하지만 여기 this붙이지않으면 컴퓨터는 name이 어느 name인지 알 수없어서 붙여줘야된다.
		System.out.println("Parent(String name)");
	}

	public String getName() {
		return name;
	}

}
