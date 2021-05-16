package shuffle;

import java.util.Scanner;

public class ShuffleMain {
	public static void main(String[] args) {

		Shuffle m = new Shuffle();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = s.nextLine();
		String c;
		String sh;
		sh = m.toShuffle(str);
		System.out.println(sh);
		c = m.toCase(sh);
		System.out.println(c);
		s.close();

	}
}
