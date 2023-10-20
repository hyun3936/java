package com.ruby.java.test1;

public class Armor {
	
	// 필드
	private String name;
	public int height;
	private int speed;
	private String color;
	private boolean isFly;
	
	
	// 메소드
	public void speedUp(int value) {
		if(value > 0)
		speed += value;
		else {
			System.out.println("음수 안돼");
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setName() {
		String value = "홍길동"; 
		name = value;
	}
	public void setHeight(int value) {
		height = value;
	}
	public int takeOff() {
		System.out.println("비행하다");
		
		System.out.println("아이언맨");
		return 0;
	}
}