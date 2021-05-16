package capabilityreview1;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of employees");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Employee employee = new Employee();
		Employee emp[] = new Employee[n];
		int option;
		for (int i = 0; i < n; i++) {
			emp[i] = new Employee();
		}

		do {

			System.out.println("Select from the following options \n");
			System.out.println("1.Take employee details \n " + "2.Print employee names in matrix format \n"
					+ " 3.Print youngest and the oldest employee details\n"
					+ " 4.Sort employee names in acending order  \n " + "5.Exit\n");
			System.out.println();
			option = sc.nextInt();
			switch (option) {
			case 1:
				employee.takeEmployeeDetails(emp);
				break;
			case 2:
				employee.printNamesInMatrix(emp);
				break;
			case 3:

				employee.findYoungAndOld(emp);
				break;
			case 4:
				System.out.println();

				employee.sortEmployeeNames(emp);
				break;
			case 5:
				break;

			}

		} while (option != 5);
		sc.close();
	}

}
