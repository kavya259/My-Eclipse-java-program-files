package mobiles;

import java.util.Scanner;


public class MobileApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Mobiles");

		int n = sc.nextInt();
		Mobile mobile=new Mobile();

		Mobile[] mobiles = new Mobile[n];

		for (int i = 0; i < mobiles.length; i++) {

			mobiles[i] = new Mobile();

		}
		System.out.println("Adding details of Mobile");
		mobile.addMobileDetails(mobiles);
		System.out.println("------------------------");

		System.out.println("Printing details of Mobile");
		System.out.println("--------------------------");
		mobile.printMobileDetails(mobiles);
		
		sc.close();

	}
	
	
}