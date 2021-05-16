package countelements;

import java.util.Scanner;

public class CountElements {

	public static void main(String args[]) {
		int row, column, i, j;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		row = in.nextInt();

		System.out.println("Enter the number columns");
		column = in.nextInt();

		int mat[][] = new int[row][column];

		System.out.println("Enter the elements of matrix1");

		for (i = 0; i < row; i++) {

			for (j = 0; j < column; j++)
				mat[i][j] = in.nextInt();

			System.out.println();
		}

		countElements(mat);

	}

	public static void countElements(int mat[][]) {
		int num;
		int count[][] = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[0].length; j++) {

				num = mat[i][j];
				count[i][j] = count(num);
			}

		}

		printCountedArray(count);

	}

	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}

		return count;

	}

	public static void printCountedArray(int count[][]) {
		for (int i = 0; i < count.length; i++) {

			for (int j = 0; j < count[0].length; j++) {

				System.out.print(count[i][j] + " ");

			}
			System.out.println();

		}
		printPrimeArray(count);

	}

	public static void printPrimeArray(int count[][]) {
		int arr[] = new int[count.length * count[0].length];
		int n = 0;

		for (int i = 0; i < count.length; i++) {

			for (int j = 0; j < count[0].length; j++) {
				arr[n] = checkPrime(count[i][j]);
				n++;

			}
		}

	/*	System.out.println("prime array is :");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
		removeDuplicate(arr);

	}

	public static int checkPrime(int number) {

		int cnt = 0;

		int prime = 0;
		if (number > 1) {
			for (int k = 2; k < number; k++) {

				if (number % k == 0) {
					cnt++;
				}

			}

			if (cnt == 0) {
				prime = number;
			}
		}

		return prime;

	}

	public static void removeDuplicate(int arr[]) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

		}

		int arr1[] = new int[n];
		for (int i = 0; i < n ; i++) {
			arr1[i] = arr[i];
		}

		int j = 0;

		int tempArray[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			if ((arr1[i] != arr1[i + 1] )&& (arr1[i]>0)) {
				tempArray[j++] = arr1[i];

			}

		}

		tempArray[j++] = arr1[n - 1];

		System.out.println("prime array without duplicate is : ");
		for (int i = 0; i < j; i++) {
			System.out.print(tempArray[i] + " ");

		}
		System.out.println();

	}

}
