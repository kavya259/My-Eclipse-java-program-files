package rearrangeexcept3;

import java.util.Scanner;

public class Rearrange {
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
		rearrangeArray(a1, n1);
		s.close();
	}

	public static void rearrangeArray(int[] a, int n) {
		int temp[] = new int[n];
		int t;
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 3) { // storing elements exactly into a temporary array from an original array where
								// element is not next to 3 or 3
				temp[i] = a[i];
			} else if (a[i] == 3) { // searched for 3
				temp[i] = 3; // if number is 3 storing in tempo and checking next element to swap it with 4
				if ((i + 1) < n) { // checking if 3 is the last element if not checking if next element is 4
					if ((a[i + 1] >= 0 && a[i + 1] <= 9) && (a[i + 1] != 4)) {

						if (k < n) {
							for (int j = k; j < n; j++) {

								if (a[j] == 4) {
									t = a[i + 1];
									a[i + 1] = a[j];
									a[j] = t;
									temp[j] = t;
									k = j + 1; // taking a value k next to j for next 4 reference so that same 4 which
												// is
												// used before is not swapped again
									break;

								}
							}
						}
					}
				}
			}

		}

		printArray(temp, n);
	}

	public static void printArray(int[] a, int n) {
		System.out.print("Array :[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("] \n");

	}

}
