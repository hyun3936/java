package Chap_08;

public class MyLinkedList2 {

	private Node head = null;

	private class Node {
		private String data;
		private Node prev; // 참조형 변수들은 전부 null로 자동 초기화
		private Node next;

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while (next.next != null) {
				next = next.next;
			}
			next.next = newNode;
			newNode.prev = next; // 이 한줄 쓰면 양방향
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (true) {
				System.out.println(next.data);
				
				if (next.next == null)
					break;
				
				next = next.next;
			}
			
			System.out.println("-".repeat(20));
			while (next != null) {
				System.out.println(next.data);
				next = next.prev;
			}
		}

	}
}
