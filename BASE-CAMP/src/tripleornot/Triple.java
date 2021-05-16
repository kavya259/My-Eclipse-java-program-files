package tripleornot;

import java.util.Scanner;

public class Triple {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		printArray(a, n);
		if (a.length < 3) {
			System.out.println("Please enter a array of length of atleast 3 ");

		} else {

			boolean result = tripletOrNot(a, n);

			System.out.println(result);
		}

		s.close();
	}

	public static boolean tripletOrNot(int[] a, int n) {

		boolean result = true;
		for (int i = 0; i < n - 2; i++) {
			if (a[i] == a[i + 1]) {
				if (a[i + 1] == a[i + 2]) {
					result = false;
					break;
				}
			}

		}
		if (result == false) {
			return result;
		} else {
			return result;
		}

	}

	public static void printArray(int[] a, int n) {
		System.out.print("Array is :[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("] \n");

	}

}
