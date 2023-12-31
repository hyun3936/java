package Chap_13;

/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

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

public class 객체배열정렬 {
	static void sortStudent(Student[]data, Comparator<Student> comp) {
		Student temp;
		for (int i = 0; i < data.length;i++) 
			for (int j = i + 1; j < data.length; j++)
			{
				// compare 메서드를 사용하여 두 학생 객체를 비교
                if (comp.compare(data[i], data[j]) > 0) {
                    // 정렬 기준에 따라 위치 변경
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
			}
			 }
	}

	public static void main(String[] args) {
		Comparator<Student> comp = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {

		};
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
//		sortStudent(data, comp);
		//Arrays.sort(data, comp);//이게 문제가 있어서 sortStudent()를 구현
		//Collections.sort(data, comp);
		/*
		Arrays.sort(data, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {

		});
		*/
		for (Student st: data)
			System.out.print(" " + st);
	}

}
