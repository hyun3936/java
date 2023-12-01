package TESTsh;

import java.util.Scanner;

//정수스택 연습











class IntStack{
	private int[] stk;
	private int capacity;
	private int ptr;
	
	// 실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
		}
	}
	
	// 실행시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			
		}
	}
	// 생성자
	public IntStack(int maxlen) {
		//구현
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		// 구현
		if(ptr >= capacity) // 스택이 가득참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		if (ptr <= 0) // 스택이 비어있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	// 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = ptr - 1; i > 0; i--)
			if(stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}
	
	// 스택의 용량(크기)를 반환
	public int getCapacity() {
		return capacity;
	}
	
	// 스택에 쌓여있는 데이터 갯수를 반환
	
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >=  capacity;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기(정상) 순서로 표시
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}

public class 정수스택prac {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(4); // 최대 64개를 푸시할 수 있는 스택
		
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.println("(1)push (2)pop (3)peek (4)dump (0)종료: ");
			
			int menu = stdIn.nextInt();
			if(menu == 0)
				break;
		}
		
	}

}
