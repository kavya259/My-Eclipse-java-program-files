package innerequalsouterornot;

import java.util.Scanner;

public class OuterInner {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an first array ");
		int n1 = s.nextInt();
		int a1[] = new int[n1];
		System.out.println("enter the elements in first array");
		for (int i = 0; i < n1; i++) {
			a1[i] = s.nextInt();
		}
		printArray(a1, n1);
		System.out.println("enter the size of an second array ");
		int n2 = s.nextInt();
		if (n2 > n1) {
			System.out.println("Second array/Inner array must contain size less than or equal to Outer array size");
		} else {
			int a2[] = new int[n2];
			System.out.println("enter the elements in an second array");
			for (int i = 0; i < n2; i++) {
				a2[i] = s.nextInt();
			}
			printArray(a2, n2);
			System.out.println();
			System.out.println(appearsOrNot(a2, a1));
			if (appearsOrNot(a2, a1) == true) {
				printArray(a2, n2);
				System.out.print(" is present in ");
				printArray(a1, n1);
			}
		}

	}

	public static boolean appearsOrNot(int[] a2, int[] a1) {
		int j = 0;
		boolean result = false;
		for (int i = 0; i < a1.length; i++) {
			if (a2[j] == a1[i]) {
				j++;
				if (j == a2.length - 1) {
					result = true;
					break;
				}
			}

		}
		return result;

	}

	public static void printArray(int[] a, int n) {
		System.out.print("Array :[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("] \n");

	}

}
