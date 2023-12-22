package Chap_8장_리스트;

//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계

import java.util.Random;
import java.util.Scanner;

class Node1 {
	int data;
	Node1 link; // link는 Node1 클래스의 객체를 참조할 수 있는 변수로서 사용

	public Node1(int element) {
		data = element;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;

	public LinkedList1() {
		first = null;
	}

	public void Delete(int element) // delete the element
	{
		Node1 p = first, q = null; // 두 개의 노드 포인터 p와 q를 초기화하고, 리스트의 첫 번째 노드를 가리키도록 함

		while (p != null && p.data != element) { // 리스트를 탐색하면서 삭제할 값이 있는 노드를 찾을 때까지 반복
			q = p; // 이전 노드를 현재 노드로 이동
			p = p.link; // 현재 노드를 다음 노드로 이동
		}

		if (p != null) { // 삭제할 값이 리스트 안에 존재하는 경우
			if (q != null) {
				q.link = p.link; // 이전 노드의 링크를 삭제할 노드의 다음 노드로 연결
			} else {
				first = p.link; // 삭제할 노드가 첫 번째 노드인 경우, 첫 번째 노드를 삭제할 노드의 다음 노드로 변경
			}
		}
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		
	}

	public void Add(int element) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		Node1 tmp = new Node1(element); // 삽입할 값을 갖는 새로운 노드 'tmp'를 생성
		Node1 p = first, q = null; // 두 개의 노드 포인터 p와 q를 초기화하고, 리스트의 첫 번째 노드를 가리키도록 함

	    if(p == null) {  // 리스트가 비어있는 경우        
	        first = tmp; // 첫 번째 노드로 새로운 노드를 지정
	    } 
	    
	    else {
	        while (p != null && element > p.data) { // 수정: 리스트를 탐색하면서 현재 노드의 값이 삽입할 값보다 작을 때까지 반복
	            q = p;   // 이전 노드를 현재 노드로 이동
	            p = p.link; // 현재 노드를 다음 노드로 이동
	        }

	        if (q != null) {
	            tmp.link = p; // 새로운 노드를 현재 노드 앞에 연결
	            q.link = tmp; // 이전 노드의 링크를 새로운 노드로 설정
	        } else {
	            tmp.link = first; // 리스트의 맨 앞에 새로운 노드를 추가하는 경우
	            first = tmp; // 첫 번째 노드로 새로운 노드를 지정
	        }
	    }
	}
	
	public boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		return true;
	}
}

public class 정수연결리스트 {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	
	
	
	public static void main(String[] args) {
		Menu menu; // 메뉴
		Random rand = new Random();
		System.out.println("Linked List");
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int data = 0;
//		System.out.println("inserted"); // 테스트 용
//		l.Show();
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				data = rand.nextInt(20);
				// double d = Math.random();
				// data = (int) (d * 50);
				l.Add(data);
				break;
			case Delete: // 머리 노드 삭제
				data = sc.nextInt();
				int num = l.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show: // 꼬리 노드 삭제
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				boolean result = l.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + "데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + "데이터가 존재합니다.");
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}
