package span;

import java.util.Scanner;

public class Span {

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
		int sum = 0;
		if (a.length < 3) {
			System.out.println("Please enter a array of length of atleast 3 to calculate span. ");

		} else {

			for (int i = 0; i < n; i++) {
				sum = calculateSpan(a, n);
			}
			System.out.println("Sum of the span is " + sum);
		}

		s.close();
	}

	public static int calculateSpan(int[] a, int n) {
		int first = 0;
		int last = n - 1;
		int sum = 0;

		for (int i = first + 1; i < last; i++) {
			sum = sum + a[i];
		}
		return sum;

	}

	public static void printArray(int[] a, int n) {
		System.out.print("Array is :[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("] \n");

	}

}
