package rowmultiplication;

import java.util.Scanner;

public class MatrixRowMul {

	public static void main(String[] args) {
		int m, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the row value");
		m = s.nextInt();
		System.out.println("Please enter the column value");
		n = s.nextInt();
		int a1[][] = new int[m][n];
		System.out.println("Please enter the elements in array1");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a1[i][j] = s.nextInt();
			}
		}
		toPrint(a1,m,n);
		tomulRow(a1,m,n);

	
}
	public static void toPrint(int[][] a1, int m, int n) {
		System.out.println("matrix :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] tomulRow(int[][] a1, int m, int n) {
			System.out.println("matrix 1 :");
			int mul[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					mul[i][j] = a1[i][j] * (i+1);
				}

			}
			System.out.println("matrix after multiplication of matrix rows with respective row number ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mul[i][j] + " ");
				}
				System.out.println();

			}

			return mul;
}
}