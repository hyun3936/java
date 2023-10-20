package com.ruby.java.test2;
import com.ruby.java.test1.*;
public class Exam01 {
	public static void main(String[] args) {
		
		Armor arm = new Armor();  // 객체를 만든다
		
		arm.setHeight(100);
		arm.height = 99;
		arm.setHeight(55);
		int result = arm.takeOff();
		System.out.println("result= " + result);
		
		arm.speedUp(100);
		int speed = arm.getSpeed();
		System.out.println("speed = " +speed);
		
	}
}

