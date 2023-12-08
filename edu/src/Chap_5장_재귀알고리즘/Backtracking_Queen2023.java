package Chap_5장_재귀알고리즘;  // 문제풀때 Stack의 상황을 계속 생각하기. 어떤게 들어가고 어떤게 나와서 현재 stack는 뭐가 들어있는지.

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking

// 퀸 문제 해결 후, 모든 해가 나오는 버젼 만들기 
/*
* 체스판은 8 x 8
* 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
*  Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
*  pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능
*  체스판 최대 배치 문제 : king/16, Queen/8, rook/8, bishop/14, knight/32
*  rook 2개/a, h, knight 2개/b, g, bishop 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
*/

class Point3 {
	int ix;
	int iy;

	public Point3(int x, int y) {
		ix = x;
		iy = y;
	}

	@Override
	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}

	@Override
	public boolean equals(Object p) {
		if ((this.ix == ((Point3) p).ix) && (this.iy == ((Point3) p).iy))
			return true;
		else
			return false;
	}
}

class Stack3 {
	public class EmptyGenericStackException extends Exception {
		private static final long serialVersionUID = 1L;

		public EmptyGenericStackException() {
			super();
		}
	}

	// --- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowGenericStackException extends RuntimeException {
		public OverflowGenericStackException() {
		}
	}

	private List<Point3> data; // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터 // ptr대신 top
	// --- 생성자(constructor) ---//

	public Stack3(int capacity) {
		// 구현
		data = new ArrayList<Point3>();
		this.capacity = capacity;
		top = 0;

	}

	// --- 스택에 x를 푸시 ---//
	public void push(Point3 p) throws OverflowGenericStackException {
		if (top >= capacity) // 스택이 가득 참
			throw new OverflowGenericStackException ();
		data.add(p);
		top++;
		return;
	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Point3 pop() throws OverflowGenericStackException {
		if (top <= 0) // 스택이 빔
			throw new OverflowGenericStackException();
		return data.remove(--top);
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Point3 peek() throws OverflowGenericStackException {
		if (top <= 0) // 스택이 빔
			throw new OverflowGenericStackException();
		return data.get(top - 1);
	}

	// --- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(발견하지 못하면 –1)를 반환 ---//
	public int indexOf(Point3 x) {
		for (int i = top - 1; i >= 0; i--) // 정상 쪽에서 선형검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (top <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
		}
	}
}

public class Backtracking_Queen2023 {
	public static void solveQueen(int[][] d) {
		int total = 0;// 총 해답 수
		int count = 0;// 퀸 배치 갯수(0~8)
		int ix = 0, iy = 0;// 행 ix, 열 iy
		Stack3 st = new Stack3(100); // 100개를 저장할 수 있는 스택을 만들고
		Point3 p = new Point3(ix, iy);// 현 위치를 객체로 만들고
		d[ix][iy] = 1;// 현 위치에 queen을 넣었다는 표시를 하고
		count++;
		st.push(p);// 스택에 현 위치 객체를 push
		ix++;// ix는 행별로 퀸 배치되는 것을 말한다.

		while (true) {
			// stack이 텅 비면 while문 탈출하는 if문
			// backtracking을 하다보면 결국 첫번째 퀸이 (0,8)위치에 마지막으로 남는데
			// 여기서 또 팝을하면 더이상 위에 팝할 퀸이 없기 때문에 반복문을 탈출해줘야 한다.
			
			if (st.isEmpty() && iy == 8) // stack이 empty가 아니면 다른 해를 구한다, ix가 8이면 8개 배치 완료
				break; // 완결 구문. while문에서 제일 중요한게 탈출구문. 안그러면 무한루프.
			 // pop하면서 마지막에 첫번째 행까지 왔을때 또 팝을 못하니까 비어있을때 탈출
			
			
			
			// 더이상 이동할 곳이 없으면, pop하고 퀸위치를 되돌리기?
			if ((iy = nextMove(d, ix, iy)) == -1) {// 다음 이동할 열을 iy로 주는데 -1이면 더이상 이동할 열이 없음을 나타냄
				
				Point3 preQ = st.pop(); // stack을 pop하는데 그걸 preQ변수에 저장해서 값가져옴.

				// 이전 row의 퀸 위치로 좌표 이동
				ix = preQ.getX();
				iy = preQ.getY();

				d[ix][iy] = 0; // 이전 행 퀸 제거
				count--; // 카운트 되돌리기

				iy++;// 현재 위치에서 다음 column으로 이동

			} else {// 현재 row에 퀸 배치 가능(column=iy)

				// 새 퀸 위치를 새 객체에 저장 후 스택에 push
				Point3 newQ = new Point3(ix, iy);
				st.push(newQ);

				// 퀸 배치
				d[ix][iy] = 1;
				count++;

				// 다음 row로 이동
				ix++;
				iy = 0;
			}

			if (count == 8) { // 8개를 모두 배치하면
				// 출력
				System.out.println("\n개수 : " + ++total);// 현재까지의 해답 수 출력

				showQueens(d);// 퀸 위치 출력

				// 마지막 퀸 위치 스택에서 팝하여 새 객체에 저장
				Point3 q = st.pop();

				// 마지막 퀸 위치 좌표로 이동
				ix = q.getX();
				iy = q.getY();

				// 마지막에 배치한 퀸 제거
				d[ix][iy] = 0;
				count--;

				iy++;// 현재 위치에서 다음 column으로 이동
			}
		}
	}

	public static boolean checkRow(int[][] d, int crow) { // 배열 d에서 행 crow에 퀸을 배치할 수 있는지 조사
		for(int i = 0; i < d.length; i++) {
			if(d[crow][i] == 1)
				return false;
		}
			return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {// 배열 d에서 열 ccol에 퀸을 배치할 수 있는지 조사
		for(int i = 0; i < d.length; i++) {
			if(d[i][ccol] == 1)
				return false;
		}
			return true;
	}
	
	// 배열 d에서 행 cx, 열 cy에 퀸을 남서, 북동 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
//		int c = cy - cx + 7;
//		for (int i = Math.max(0, c - 7); i < Math.min(7, c); i++) {
//			if(d[i+7-c][i] == 1)
//				return false;
//		}
		int x = cx, y = cy;
		while (x >= 0 && x <d.length && y >= 0 && y <d.length) {
			if (d[x][y] == 1)
				return false;
			x++; y--;
		}
		x = cx; y = cy;
		while (x >= 0 && x <d.length && y >= 0 && y <d.length) {
			if (d[x][y] == 1)
				return false;
			x--; y++;
		}
		return true;
	}

	// 배열 d에서 행 cx, 열 cy에 퀸을 남동, 북서 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		int x = cx, y = cy;
		while (x >= 0 && x <d.length && y >= 0 && y <d.length) {
			if (d[x][y] == 1)
				return false;
			x++; y++;
		}
		x = cx; y = cy;
		while (x >= 0 && x <d.length && y >= 0 && y <d.length) {
			if (d[x][y] == 1)
				return false;
			x--; y--;
		}
		return true;
	}

	// 배열 d에서 (x,y)에 퀸을 배치할 수 있는지 조사
	public static boolean checkMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if (checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
			return true;
		else
			return false;
	}

	// 배열 d에서 현재 위치(row,col)에 대하여 다음에 이동할 위치 nextCol을 반환, 이동이 가능하지 않으면 -1를 리턴
	public static int nextMove(int[][] d, int row, int col) {// 현재 row, col에 대하여 이동할 col을 return
	   for (int y = col; y <d.length; y++)
	   {
		   if (checkMove(d, row, y) == true)
			   return y;
	   }
	   return -1;
		//if (checkMove(d, row, col) == true)
		   
	}

	static void showQueens(int[][] data) {// 배열 출력
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				if (data[i][j] == 1) {
				System.out.print("Q ");
				}
				else
					System.out.print("□ ");
			}
			System.out.println();				
		}
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		solveQueen(data);
	}
}