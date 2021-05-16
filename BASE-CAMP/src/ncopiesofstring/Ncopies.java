package ncopiesofstring;

import java.util.Scanner;

public class Ncopies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = s.nextLine();
		System.out.println("Enter the number of copies  to be made  ");
		int n = s.nextInt();

		System.out.println(doNCopies(str, n));
		s.close();

	}

	public static String doNCopies(String str, int n) {
		String chars = "";
		String ncopies = "";

		if (str.length() >= 3) {
			for (int i = 0; i < 3; i++) {
				chars = chars + str.charAt(i);
			}
			int j = 1;
			while (j <= n) {
				ncopies = ncopies + chars;
				j++;
			}
		} else {
			System.out.println("The string must contain atleast 3 characters,please run and try again ");
		}
		return ncopies;
	}

}
