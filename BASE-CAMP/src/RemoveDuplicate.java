import java.util.Scanner;

import shuffle.Shuffle;

public class RemoveDuplicate {

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
		System.out.println();

		removeDuplicate(a, n);

	}

	public static void removeDuplicate(int[] a, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("sorted array is :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("unique elements are:");

		int arr1[] = new int[n];
		for (int i = n-1; i >=0; i++) {
			for (int j =0; j <i; j++) {
				if (a[i] != a[j] ) {
					
					System.out.println(a[i]+ " ");

					}
				
				
				
									
				}
				}
		}

	/*	for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

*/

	

}
