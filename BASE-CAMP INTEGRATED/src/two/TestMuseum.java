package two;

import java.util.Scanner;


public class TestMuseum {
	
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of visitores");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Museum museum=new Museum();
		int option;
	/*	for (int i = 0; i < n; i++) {
			emp[i] = new Employee();
		}*/

		do {

			System.out.println("Select from the following options \n");
			System.out.println("1.Take visitor details \n " + "2.Calculate entry fee based on age group \n"
					+ " 3. \n"
					+ " 4.Sort employee names in acending order  \n " + "5.Exit\n");
			System.out.println();
			option = sc.nextInt();
			switch (option) {
			case 1:museum.takeVisitorDetails();
				break;
			case 2:
				break;
			case 3:
				System.out.println();

				break;
			case 4:
				System.out.println();

				break;
			case 5:
				break;

			}

		} while (option != 5);
		sc.close();
	}



}
