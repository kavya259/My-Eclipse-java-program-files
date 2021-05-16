package checkcircular;

public class Circularornot {

	public  void toCheckCircular(String s1, String s2) {
		if (checkEquality(s1, s2) == 1) {
			checkCircular(s1, s2);
		}

	}

	public  int checkEquality(String s1, String s2) {
		int n;
		if (s1.length() != s2.length()) {
			System.out.println("The string lengths are not equal ,they cannot be circular ");
			n = 0;
		} else {
			n = 1;
		}

		return n;

	}

	public  void checkCircular(String s1, String s2) {
		String s3 = s1 + s1;
		int j = 0;
		for (int i = 0; i < s3.length(); i++) {

			if (s2.charAt(j) == s3.charAt(i)) {
				checkNext(s2, s3, i, j, s1);
				break;
			}

		}

	}

	public  void checkNext(String s2, String s3, int i, int j, String s1) {
		int l = s2.length();
		int cir = 0;
		for (int st = j; st < l; st++) {
			if (s2.charAt(st) == s3.charAt(i)) {

				i++;
				cir++;

			} else {

				cir = 0;
				break;
			}
		}
		if (cir == 0) {
			System.out.println(s1 + " and " + s2 + "are not Circular");
		} else {
			System.out.println(s1 + " and " + s2 + " are Circular");

		}

	}

}
