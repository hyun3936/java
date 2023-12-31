package Chap_10.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01_ArrayList {
	public static void main(String[] args) {
		
		Random rd = new Random();
		List<Person> list = new ArrayList<>(); // person타입의 데이터 저장
		
		Professor p1 = new Professor("교수1", 40, "자바");
//		p1.setName("교수1");
//		p1.setAge(40);
//		p1.setSubject("자바");
		list.add(p1);
		
		Professor p2 = new Professor("교수2", 50, "파이썬");
//		p2.setName("교수2");
//		p2.setAge(50);
//		p2.setSubject("파이썬");
		list.add(p2);
		
//		for (int i = 0; i <= 10; i++) {
//			Student s = new Student();
//			s.setName("학생" + i);
//			s.setAge(rd.nextInt(20,30));
//			s.setMajor("컴공과");
//			list.add(s);
//		}
		
		for (int i = 0; i <= 10; i++) {
			Student s = new Student();
			
			list.add(s);
		}
		
		
		
//		System.out.println(list);
		list.forEach(p->System.out.println(p));
	}

}
