package checkcircular;

import java.util.Scanner;

public class CheckCircular {

	public static void main(String[] args) {
		Circularornot circular = new Circularornot();
		Scanner s = new Scanner(System.in);
		System.out.println("Input the first string ");
		String s1 = s.nextLine();
		System.out.println("Input the second string ");
		String s2 = s.nextLine();
		circular.toCheckCircular(s1, s2);
s.close();
	}
}