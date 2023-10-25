package Chap_07.inheritance.test;

public class Child extends Parent {
	
	public Child() {
		System.out.println("Child()");
	}

	public Child(String name) {
		super(name);
		System.out.println("Child(String name)");

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
