package shuffle;


public class Shuffle {

	
	public  String toShuffle(String w) {
		int i;
		String w1 = "";
		int len = w.length();
		if (len > 0) {
			for (i = 0; i < len; i++) {
				if (i != (w.length() - 1 - i) ) {
					w1 = w1 + w.charAt(i) + w.charAt(w.length() - 1 - i);
					len--;
				} else {
					w1 = w1 + w.charAt(i);
					len--;
				}
			}
		} else {
			System.out.println("you haven't entered any string ,Please enter a string ");
		}
		return w1;
	}

	public  String toCase(String s) {
		int i;
		String w2 = "";

		for (i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					w2 = w2 + (char) ((int) s.charAt(i) - 32);
				} else {
					w2 = w2 + s.charAt(i);

				}
			} else {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')

				{
					w2 = w2 + (char) ((int) s.charAt(i) + 32);
				} else {
					w2 = w2 + s.charAt(i);

				}
			}
		}
		return w2;

	}
}
