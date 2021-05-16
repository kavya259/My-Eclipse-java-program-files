package percentageofletters;

/*
 * Implement a java program to find the percentage of uppercase letters, lowercase letters and digits in a
given input email address. Validation for input email address is that it should consist of an email
prefix and a email domain. The prefix appears to the left of the @ symbol, and the domain appears to
the right of the @ symbol.
 */
import java.util.Scanner;

public class Percentage {

	
	public static void validateemailId(String id) {
		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) == '@') {
				if ((id.charAt(i + 1) == ' ') || (i == id.length() - 1)) {
					System.out.println("Please enter your domain after '@' without any spaces in between");
				} else if (((i == id.charAt(0)) || (id.charAt(i - 1) == ' '))) {
					System.out.println("Please enter your prefix before '@' without any spaces in between");

				} else {
					id = id;
				}
			}

		}

	}

	public static void doCount(String s) {
		int i;
		int up = 0;
		int low = 0;
		int dig = 0;
		for (i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z')) {
				low++;

			} else if ((c >= 'A' && c <= 'Z')) {
				up++;
			} else if ((c >= '0' && c <= '9')) {
				dig++;
			}
		}
		doPercentage(s, up, low, dig);

	}

	public static void doPercentage(String s, int uc, int lc, int dc) {
		int len = s.length();
		double Uperc;
		double lperc;
		double dperc;
		Uperc = (uc * 100) / len;
		lperc = (lc * 100) / len;
		dperc = (dc * 100) / len;
		print(Uperc, lperc, dperc);

	}

	public static void print(double u, double l, double d) {
		System.out.println(" Percentage of UPPERCASE letters  is " + u + " %");
		System.out.println(" Percentage of lowercase letters is " + l + " %");
		System.out.println(" Percentage of digits  is " + d + " %");

	}
}
