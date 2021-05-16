package formcircular;

import java.util.Scanner;

public class FormCircular {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the string ");
		String s1 = s.nextLine();
		System.out.println("Input the number less than or equal to the length" + s1.length() + " of the string  ");
		int n = s.nextInt();
		if(n>s1.length())
		{
			System.out.println("Size exceeded");
			
		}
		else
		{
		circularSubStrings(s1, n);
		}
		s.close();

	}

	public static void circularSubStrings(String s1, int n) {
		String s2 = s1 + s1;
		int j;
		String sub = "";
		for (int i = 0; i < s1.length(); i++) {
			for (j = i; j < s2.length(); j++) {
				if (sub.length() < n) {
					sub = sub + s2.charAt(j);
				}

			}
			System.out.print(sub + " ");
			sub = "";
		}

	}

}