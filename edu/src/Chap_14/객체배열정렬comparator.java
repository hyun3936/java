package Chap_14;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
	String sno;
	String sname;

	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public String toString() {
		return "[" + sno + ", " + sname + "]";
	}

}

public class 객체배열정렬comparator { 
	static void sortStudent(Student[] data, Comparator<Student> comp) {
		Student temp;
		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (comp.compare(data[i], data[j]) > 0) {
					// 잘못된 순서에 있는 경우 요소를 교환합니다.
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
	}

	public static void main(String[] args) {

		Comparator<Student> compNo = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno); 
				//Integer.parseInt()를 사용하여 학번을 정수로 변환한 다음, 두 값을 빼내어 순서를 결정합니다.
	}
	};
		// sno를 사용한 비교
		// 위에 식을 간단하게 람다식으로 표현
		//Comparator<Student> compNo = (s1, s2) -> s1.sno.compareTo(s2.sno);

		Comparator<Student> compName = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				// sname을 사용한 비교
				return s1.sname.compareTo(s2.sname);
			}
			};

		//Comparator<Student> compName = (s1, s2) -> s1.sname.compareTo(s2.sname);

		Student[] data = {
				new Student("12", "가길동"), 
				new Student("121", "나길순"),
				new Student("13", "다길춘"),
				new Student("9", "라길홍") 
				};
		
	//Comparator<Student> compNo = (s1, s2) -> s1.sname.compareTo(s2.sno);
		
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(null);
		
		

		
		
		
		
        sortStudent(data, compNo);
		// 또는 sortStudent(data, compName)을 호출하여 이름으로 정렬할 수 있습니다.
        

//		Arrays.sort(data, compNo);//이게 문제가 있어서 sortStudent()를 구현
		// Collections.sort(data, comp);
		
		
//		  Arrays.sort(data, new Comparator<Student>() {
//		  
//		  @Override public int compare(Student s1, Student s2) {
//		  
//		  });
		 
		 
		for (Student st : data)
			System.out.print(" " + st);
	}
	}

