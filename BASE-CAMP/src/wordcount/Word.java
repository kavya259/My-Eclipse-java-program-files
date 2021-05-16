package wordcount;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {

		WordCount m = new WordCount();
		String in = "";

		int op;

		do {

			Scanner s = new Scanner(System.in);

			System.out.println("Choose from the menu below ");
			System.out.println("--------------------------- ");

			System.out.println(
					"1.Input a sentence /n 2.Count the words in the given sentence \n 3.Count the number of vowels in the given sentence \n 4.Return Array of words \n 5.Exit");
			op = s.nextInt();
			switch (op) {
			case 1:
				in = in + m.toInput();
				break;
			case 2:
				m.toCountWords(in);

				break;
			case 3:
				m.toCountVowel(in);
				break;
			case 4:
				m.toWordArray(in);
				break;
			case 5:
				break;
			default: {
				System.out.println("Choose option from 1 to 5 only");
			}
				break;
			}
		} while (op != 5);

	}

}
