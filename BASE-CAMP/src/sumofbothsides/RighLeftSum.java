package sumofbothsides;

import java.util.Scanner;

public class RighLeftSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements in an array");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		s.close();
		System.out.println();
		boolean equal = checkEquality(a, n);
		System.out.println(equal);

	}

	public static boolean checkEquality(int[] a, int n) {
		int r = 0;
		int l = 0;
		int x = n - 1;

		int j;
		boolean result = false;
		while (x != 0) {
			r = r + a[x];

			for (j = 0; j < x; j++) {
				l = l + a[j];
			}
			if (l == r) {
				result = true;
				break;
			} else {

				x = x - 1;
				l = 0;

			}
		}

		if (result == true) {
			return result;
		} else {
			return false;
		}
	}

}
