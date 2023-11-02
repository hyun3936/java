package Chap_10.arraylist;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String subject) {}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " : " + major;
	}
}