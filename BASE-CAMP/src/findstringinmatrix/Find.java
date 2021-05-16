package findstringinmatrix;

import java.util.Scanner;

public class Find {

	/*
	 * public int inputDimensions() {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("Please enter the row value for a square matrix"); int m =
	 * sc.nextInt(); sc.close(); return m;
	 * 
	 * }
	 */
	Scanner s = new Scanner(System.in);

	public char fillMatrix(int n, int i, int j) {
		char c;
		c = s.next().charAt(0);

		return c;

	}

	public void Print(int n, int i, int j, char a[][]) {
		System.out.print(a[i][j] + " ");
	}

	Scanner sc = new Scanner(System.in);

	public String inputString() {
		String st;

		System.out.println("Please enter a string");
		st = sc.nextLine();
		return st;

	}

	public void findString(String st, char[][] a, int n) {
		int op = 1;
		String sum = "";
		do
			{switch (op) {
		case 1: {
			for (int i = 0; i < n; i++) {
				int j = i;
				sum = sum + a[i][j];
			}
			if (sum == st) {
				System.out.println("String" + st + " is found in the matrix ");
			} else {
				op=2;

			}
		}
			break;

		case 2: {
			sum="";
		
			for (int i = 0; i < n; i++) {
				int j = n - 1 - i;
				sum = sum + a[i][j];
			}
			if (sum == st) {
				System.out.println("String" + st + " is found in the matrix ");
				op=6;
			} else {
				op=3;

			}
		}
			
			break;

		case 3: {
			sum="";
		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum = sum + a[i][j];
				
				if (sum == st && sum.length()==st.length()) {
					System.out.println("String" + st + " is found in the matrix ");
					op=6;
					break;

				} else if( sum.length()==st.length()){
					if (i == n - 1) {
op=4;
					}
				}
			}
		}
		}break;

		/*
		 * if (sum != st) { sum="";
		 */

		case 4: {
			sum="";
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum = sum + a[j][i];
				}
				if (sum == st && sum.length()==st.length()) {
					System.out.println("String" + st + " is found in the matrix ");
					op=6;
					break;

				} else if( sum.length()==st.length()){
					
					if (i == n - 1) {
op=6;
					}
					
					}
				}
			if(op==6)
			{
				System.out.println("String" + st + " is not found in the matrix ");

			}
			}
		
			break;
		}}while(op<5);

		

	}

}
