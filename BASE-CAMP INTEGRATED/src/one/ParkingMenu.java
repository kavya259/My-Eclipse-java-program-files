package one;

import java.util.Scanner;

public class ParkingMenu {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of customers");
		n = s.nextInt();
		int option;
		Parking park = new Parking();
		Parking Park[] = new Parking[n];
		int a = -1;
s.close();
		for (int i = 0; i < n; i++) {
			Park[i] = new Parking();
		}
		do {
			System.out.println();

			System.out.println("check out the menu ,select any option");
			System.out.println(
					"1.Automatically check for the available parking. \n"
					+ " 2.Enter the vehicle number coming in for parking. \n "
					+ "3.Enter the entry time of a vehicle. \n"
					+ " 4.allocate the empty slot for parking \n "
					+ "5.calculate the parking fee \n 6.EXIT");
			System.out.println();

			option = s.nextInt();
			if(option==1 && a<n )
			{
				a++;
			}

			switch (option) {
			case 1:
				park.checkSlotAvailability(n, a);
				System.out.println();

				break;
			case 2:
				System.out.println();
				park.toEnterVehicleNum(Park, n, a);

				break;
			case 3:
				System.out.println();
				park.entryTime(Park, n, a);
				System.out.println();


				break;

			case 4:
				System.out.println();
				park.allocateSlot(Park, n, a);
				break;
			case 5:
				System.out.println();
				park.calculateParkingFee(Park, n, a);
				System.out.println();
				
				break;
			case 6:
				break;
			default:
				System.out.println("wrong option");
				break;
			}
		} while (option != 6);

	}

}
