package percentageofletters;

import java.util.Scanner;

public class mainPercentage {

	public static void main(String[] args) {
		Percentage p = new Percentage();
		Scanner s = new Scanner(System.in);

		System.out.println("enter the Email address ");
		String eid = s.nextLine();
		p.validateemailId(eid);
		p.doCount(eid);

	}

}
