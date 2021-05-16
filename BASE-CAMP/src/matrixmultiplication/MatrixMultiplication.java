package matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int m, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the row value");
		m = s.nextInt();
		System.out.println("Please enter the column value");
		n = s.nextInt();
		int a1[][] = new int[m][n];
		int a2[][] = new int[m][n];

		System.out.println("Please enter the elements in array1");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a1[i][j] = s.nextInt();
			}
		}
		System.out.println("Please enter the elements in array2");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a2[i][j] = s.nextInt();
			}
		}

		toPrint(a1, a2, m, n);
		toMultiply(a1, a2, m, n);

	}

	public static void toPrint(int[][] a1, int[][] a2, int m, int n) {
		System.out.println("matrix 1 :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println("matrix 2:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static int[][] toMultiply(int[][] a1, int[][] a2, int m, int n) {
		int mul[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mul[i][j] = a1[i][j] * a2[i][j];
			}

		}
		System.out.println("matrix after multiplication of a1 and a2 matrices is ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();

		}

		return mul;

	}

}
