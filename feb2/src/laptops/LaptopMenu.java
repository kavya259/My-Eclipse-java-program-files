package laptops;

import java.util.Scanner;

public class LaptopMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of laptops");

		int n = sc.nextInt();
		Laptop laptop=new Laptop();

		Laptop[] laptops = new Laptop[n];

		for (int i = 0; i < laptops.length; i++) {

			laptops[i] = new Laptop();

		}
		System.out.println("Adding details of laptops");
		laptop.addLaptopDetails(laptops);
		laptop.printLaptop(laptops);
		System.out.println("------------------");
		System.out.println("*********Laptop having ramsize greater than 8*********");
		laptop.ramSizeGreaterThanEight(laptops);
		sc.close();

	}
}
