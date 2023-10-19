package Chap_03;

public class Test31 {

//	public static void main(String[] args) {
//		
//	int i = 0;
//	int j = 0;
//	
//			for (i=1; i<10; i++) {
//				for (j=1; j<10; j++)
//					System.out.print(j + " * " + i + " = " + (i*j) + "  ");
//				System.out.println("\n"); 
//
//	}
//			System.out.println("\n"); 
//
//    }

	public static void main(String[] args) {

		int i = 1;
		int j = 1;

		while (i < 10) { 
			j=1; // ★이부분 놓쳤음. 변수값의 현재값을 항상 생각하기. 1~9 반복하니까 9를 다시 1로 초기화 시켜주기.
			while (j < 10) {
				System.out.print(j + " * " + i + " = " + ( i*j ) + "    " ); 
				j++;
			}
			System.out.println("\n");
		i++;
		}	
	}
}
		
//		int i = 1;
//		do {
//			int j = 1;
//			do {
//			System.out.println(i + " * " + j + " = " + (i * j));
//			j++;
//			}while(j < 10);
//			System.out.println();
//			i++;
//		}while(i<10);
//		
//		}
//}
