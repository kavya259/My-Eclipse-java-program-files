package superiorindex;

import java.util.Scanner;

public class Superior {

	public static void main(String[] args) {
		int m, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the row value");
		m = s.nextInt();
		System.out.println("Please enter the column value");
		n = s.nextInt();
		int a1[][] = new int[m][n];
		System.out.println("Please enter the elements in matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a1[i][j] = s.nextInt();
			}
		}
		s.close();
		printArray(a1, m, n);
		superiorIndex(a1, m, n);

	}

	public static void superiorIndex(int[][] a, int m, int n) {
		int max = 0;
		int r = 0, c = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					r = i;
					c = j;
				}

			}
		}
		int rmax = 0;
		for (int i = m - 1; i >= 0; i--) {
			if (a[i][c] > rmax) {
				rmax = a[i][c];
			}

		}

		int cmax = 0;
		for (int j = n - 1; j >= 0; j--) {
			if (a[r][j] > cmax) {
				cmax = a[r][j];
			}

		}
		if (cmax == rmax) {
			Index(r, c);
		}
	}

	public static void Index(int row, int col) {
		System.out.println("index of the superior element is : (" + row + "," + col + ")");
	}

	public static void printArray(int[][] a, int m, int n) {
		System.out.println("Array :");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

}
