package session2;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  string :\n ");

		String str = sc.nextLine();

		str = str + " ";

		findLarge(str + ".");
	}

	public static void findLarge(String a) {
		int maxlength = 0;
		String word = "";
		String large = "";
		//String[] wordlist = new String[a.length()];
		int index = 0;
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				word = word + a.charAt(i);

			}

			else {
				if (word.length() > large.length()) {
					large = word;
				}
				word = "";
			}
		}
		System.out.println("Largest word in the given string is : " + large);

	}
}
/*
 * for(int k=j+1;k<index;k++) { if(wordlist[j].length()<wordlist[k].length()) {
 * large=wordlist[j];
 * 
 * } } }
 */