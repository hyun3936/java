package Chap_14;

import java.util.Arrays;

public class test03 {
	public static void main(String[] args) {
		int ar[] = {7, 4, 2, 1, 3, 22, 44, 55};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		int k = 0;
		int m[][] = new int[2][4];
		for (int i =0; i < m.length; i++) {
			for (int j=0; j<m[0].length; j++) {
				m[i][j] = ar[k];
				k++;
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
	
	
}