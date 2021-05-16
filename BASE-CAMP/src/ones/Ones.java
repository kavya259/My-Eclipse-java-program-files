package ones;
//9
import java.util.Scanner;

public class Ones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter any number ");
		n = sc.nextInt();
        countOne(n);
		sc.close();
	}

	public static void countOne(int n) {
		int one = 0;
		int count = 0;

		if (n % 2 != 0 && n % 5 != 0) {
			for (int i = 2; i < 10000; i++) {
				int n1 = n * i;
				while (n1 != 0) {
					int rem = n1 % 2;
					n1 = n1 / 2;
					one = one * 10 + (rem);

				}
				String s = "";
				s = s + one;

				for (int j = 0; j < s.length();j++) {
					if (s.charAt(j)!= '1') {
						break;
					} else {
						count++;

					}
					System.out.println("The count of number of ones in decimal(" + s + ") of multiple of" + n + " i.e., "
							+ n1 + " is " + count);
					one = 0;
					break;
				}
			}

		}

		else {
			System.out.println("The given number should not be divisible by 2 or 5 , please run again and try ");
		}
	}

}
