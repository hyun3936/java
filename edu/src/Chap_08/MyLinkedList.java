package Chap_08;

public class MyLinkedList {

	// 링크드리스트의 시작 노드의 참조값
	private Node head = null;

	// 내부클래스
	private class Node {
		private String data; // 데이터를 저장하는 필드변수 (저장 데이터가 String Type)
		private Node link;  // 현재 노드에 연결된 노드의 참조값을 저장하는 참조변수

		// 노드 생성자(파라미터로 데이터(String)을 입력해야 한다.)
		public Node(String data) {
			this.data = data;
		}
	}

//	private Node find(String data) {
//		Node next = head;
//		do {
//			if(next.data.equals(data))
//				return next;
//			next = next.next;
//		}while (next.next != null);
//		return null;
//	}
	
	public void delete(String data) {
		Node node = find(data);
		
		Node p = node.prev;
		Node n = node.next;
		if(p != null && n != null) {
			p.next = n;
			n.prev = p;
		}else {
			if(p == null) {
				n.prev = null;
			}
			if (n == null) {
				p.next = null;
			}
		}
	}
	
	
	// 노드를 추가하는 메서드
	public void add(String prev, String data) {
		// 새로운 노드를 생성한다.
		Node newNode = new Node(data));
		if (head == null) { // 리스트의 시작점인 head가 아무것도 없으면, 즉 null이면  
			add(data);  // 새로 만든 노드를 시작점으로 설정한다.
		}else {
			//여기에 들어온다는 의미는 head에 이미 노드가 설정되어 있다는 의미
			// 최소 1개 이상의 노드가 리스트에 존재한다는 의미가 된다.
			
			// 시작 노드값을 임시 변수 next에 설정
			Node next = head;
			
			while (next.link != null) { // 만약 현재 노드 next에 연결된 노드가 있는 동안 루프
				next = next.link; // 다음 노드를 현재 노드로 설정
			}
			
			// 여기까지 오면 리스트의 끝 노드에 도착했다는 의미
			// 그래서 마지막 노드인 next의 다음 연결 노드로 newNode를 설정
			next.link = newNode;
		}
	}
			
			
//			Node newNode = new Node(data); 
//			newNode.prev = node;
//			newNode.next = node.next;
//			node.next.prev = newNode;
//			node.next = newNode;
		

	
	

	public void add( String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;

		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}

	//현재 까지 입력된 리스트를 콘솔 화면에 출력한다.
	
	public void print() {
		// head가 null이라는 의미는 데이터가 add된 적이 없다는 의미이다.
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
			// 출력할 데이터가 없으므로 그냥 리턴
			return;
		} 
		
		
		// 여기까지 오면 출력할 데이터가 있다는 뜻이 된다.
			System.out.println("등록된 데이터는 다음과 같습니다.");
			
			// 시작 노드값을 임시 변수 next에 설정
			Node next = head;
			
			// 현재 노드인 next가 null이 아닌 동안 루프
			while (next != null) {
				// 현재 노드를 콘솔 화면에 출력한다.
				System.out.println(next.data);
				
				//현재 노드를 연결된 다음 노드로 설정한다.
				next = next.link;
			}
		}
	}