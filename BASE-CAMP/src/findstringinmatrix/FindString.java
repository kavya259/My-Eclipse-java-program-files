package findstringinmatrix;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		Find f = new Find();
		Scanner sc = new Scanner(System.in);

		int op;
		int n=0;

		char a[][] = null;
		int b;

		do {
			String str;


			System.out.println("Choose from the menu below ");
			System.out.println("--------------------------- ");

			System.out.println("1.Input the dimensions of square matrix \n 2.Fill the matrix with characters  \n 3.give a string to find in the matrix \n 4.Exit");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Please enter the row value for a square matrix");

				b=sc.nextInt();
				n=n+b;
				break;
			case 2: {
				a = new char[n][n];

				System.out.println("input the characters into the matrix :");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						a[i][j] = f.fillMatrix(i, j, n);
					}
					System.out.println();

				}
				{
					System.out.println("the matrix is :");

					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							f.Print(n, i, j, a);
						}
						System.out.println();

					}
				}
			}

				break;
			case 3:
				str = f.inputString();
				f.findString(str, a, n);

				break;
			case 4:
				break;
			default: {
				System.out.println("Choose option from 1 to 4 only");
			}
				break;
			}
		} while (op != 4);
sc.close();
	}
	

}
