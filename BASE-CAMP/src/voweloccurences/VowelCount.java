package voweloccurences;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = s.nextLine();
		toCountVowel(str);
		//eachCount(str);
		countEachVowel(str);
		vowelWords(str + " ");
		s.close();
	}

	public static void toCountVowel(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {

				count++;

			}
		}
		System.out.println("Number of occurences of vowels in the given string " + s + " is " + count);

	}

	/*
	 * public static void eachCount(String s) { int acount = 0; int ecount = 0; int
	 * icount = 0; int ocount = 0; int ucount = 0;
	 * System.out.println("each vowel occurences are :"); for (int i = 0; i <
	 * s.length(); i++) { if (s.charAt(i) == 'a' || s.charAt(i) == 'A') { acount++;
	 * } if (i == s.length() - 1 && acount != 0) { System.out.println("a" + " " +
	 * acount);
	 * 
	 * } }
	 * 
	 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) == 'e' || s.charAt(i)
	 * == 'E') { ecount++; } if (i == s.length() - 1 && ecount != 0) {
	 * System.out.println("e" + " " + ecount);
	 * 
	 * } }
	 * 
	 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) == 'i' || s.charAt(i)
	 * == 'I') { icount++; } if (i == s.length() - 1 && icount != 0) {
	 * System.out.println("i" + " " + icount);
	 * 
	 * } }
	 * 
	 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) == 'o' || s.charAt(i)
	 * == 'O') { ocount++; } if (i == s.length() - 1 && ocount != 0) {
	 * System.out.println("o" + " " + ocount);
	 * 
	 * } }
	 * 
	 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) == 'u' || s.charAt(i)
	 * == 'U') { ucount++; }
	 * 
	 * if (i == s.length() - 1 && ucount != 0) { System.out.println("u" + " " +
	 * ucount);
	 * 
	 * } }
	 * 
	 * }
	 */

	public static void countEachVowel(String s) {
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				char vow = s.charAt(i);

				switch (vow) {

				case 'a':
				case 'A': {
					acount++;

				}
					break;

				case 'e':
				case 'E': {
					ecount++;

				}
					break;

				case 'i':
				case 'I': {
					icount++;

				}
					break;
				case 'o':
				case 'O': {
					ocount++;

				}
					break;
				case 'u':
				case 'U': {
					ucount++;

				}
					break;

				}
				


			}
			
		}
		System.out.println("a : "+ acount);
		System.out.println("e : "+ ecount);
		System.out.println("i : "+ icount);
		System.out.println("o : "+ ocount);
		System.out.println("u : "+ ucount);
		System.out.println();


	}

	public static void vowelWords(String str) {
		String word = "";
		String words[] = new String[str.length()];
		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word = word + str.charAt(i);
			} else {
				// if (countVow(word) >= 3) {
				words[index] = word;
				index++;
				word = "";

			}

		}

		System.out.println("Words array is ");

		for (int i = 0; i < index; i++) {
			System.out.println(words[i]);
		}
		System.out.println();

		int j = 0;

		String words1[] = new String[index];
		for (int i = 0; i < index; i++) {
			if (countVow(words[i]) >= 3) {

				words1[j++] = words[i];
			}

		}

		System.out.println("Array of words whose vowel count is greater than equal to 3 is : ");
		for (int i = 0; i < j; i++) {

			System.out.println(words1[i] + " ");

		}

	}

	private static int countVow(String s) {

		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				cnt++;
			}
		}

		return cnt;

	}

}
