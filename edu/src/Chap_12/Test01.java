package Chap_12; // 입출력 작업하기

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	public static void main(String[] args) {
		try (FileInputStream fi = new FileInputStream("a.txt"); // 1바이트
				FileOutputStream fo = new FileOutputStream("b.txt");) { //
			int c = 0;
			while ((c = fi.read()) != -1) { // -1은 끝에 도달했다는 뜻.
				fo.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// 실행시켜도 "b.txt"가 안만들어지면 "a.txt"파일의 경로를 옮겨보자.