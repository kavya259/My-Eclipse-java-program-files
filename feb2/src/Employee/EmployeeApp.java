package Employee;

import java.util.Scanner;

public class EmployeeApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number of employees");
		int size = sc.nextInt();
		Employee employees[] = new Employee[size];
		for (int i = 0; i < size; i++) {
			employees[i] = new Employee();
		}
		int choice;

		do {
			System.out.println("Select your choice");
			System.out.println(
					"1.Add Employee details\n2.Display all Employees\n3.Display Sort based on Reporting manager,if same  RM sort on Employee name\n"
							+ "4.Display descending order of employees Designation\n"
							+ "5.Display employee whose salary is between 10000 and 20000,if salary is same based on id\n"
							+ "6.Exit");

			choice = sc.nextInt();
			System.out.println("----------------------------------------------------------------------");
			sc.nextLine();
			switch (choice) {
			case 1:
				employees = addEmployeeDetails(employees);
				System.out.println("=====================================================================");

				break;
			case 2:
				displayAllEmployees(employees);
				System.out.println("=====================================================================");

				break;
			case 3:
				sortOnReportingManager(employees);
				System.out.println("=====================================================================");

				break;
			case 4:
				descendingOrderOfEmpDesignation(employees);
				System.out.println("=====================================================================");

				break;
			case 5:
				displayEmpSalaryOrder(employees);
				System.out.println("=====================================================================");

				break;
			case 6:
				System.out.println("Exited\n****ThankYou****");
				System.out.println("=====================================================================");

				break;
			case 7:
				System.out.println("invalid choice");
				System.out.println("=====================================================================");

				break;

			}

		} while (choice != 6);

	}

	public static Employee[] addEmployeeDetails(Employee[] employee) {
		System.out.println("Adding details");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Enter Employee Id (only number excluding M) ");
			String id = "M" + sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name");
			String name = sc.nextLine();
			System.out.println("Enter Employee Salary");
			long salary = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Employee Designation");
			String designation = sc.nextLine();
			System.out.println("Enter Employee ReportingManager");
			String reportManager = sc.nextLine();
			System.out.println("...................................................");
			employee[i].setEmpMid(id);
			employee[i].setEmpName(name);
			employee[i].setEmpSalary(salary);
			employee[i].setEmpDesignation(designation);
			employee[i].setEmpReportingmanager(reportManager);

			employee[i] = new Employee(id, name, salary, designation, reportManager);
		}
		return employee;

	}

	public static void displayAllEmployees(Employee[] employees) {
		System.out.println("EmployeeId\tName\t\tSalary\tDesignation\tReportingManager");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getEmpMid() + "\t\t" + employees[i].getEmpName() + "\t\t"
					+ employees[i].getEmpSalary() + "\t\t" + employees[i].getEmpDesignation() + "\t\t"
					+ employees[i].getEmpReportingmanager());

		}

	}

	public static void sortOnReportingManager(Employee[] employees) {
		Employee sortedEmployees = new Employee();
		
		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getEmpReportingmanager().compareTo(employees[j].getEmpReportingmanager()) > 0) {
					sortedEmployees = employees[i];
					employees[i] = employees[j];
					employees[j] = sortedEmployees;

				} else if (employees[i].getEmpReportingmanager()
						.compareTo(employees[j].getEmpReportingmanager()) == 0) {
					if (employees[i].empName.compareTo(employees[j].empName) > 0) {
						sortedEmployees = employees[i];
						employees[i] = employees[j];
						employees[j] = sortedEmployees;

					}
				}

			}

		}
		displayAllEmployees(employees);

	}

	public static void descendingOrderOfEmpDesignation(Employee[] employees) {
		Employee descOrder = new Employee();

		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {

				if (employees[i].empDesignation.compareTo(employees[j].empDesignation) < 0) {

					descOrder = employees[i];
					employees[i] = employees[j];
					employees[j] = descOrder;

				}

			}
		}
		displayAllEmployees(employees);

	}

	public static void displayEmpSalaryOrder(Employee[] employee) {

		for (int i = 0; i < employee.length; i++) {
			if ((employee[i].getEmpSalary() > 10000) && (employee[i].getEmpSalary() < 20000)) {

				System.out.println(employee[i].getEmpMid() + "\t\t" + employee[i].getEmpName() + "\t\t"
						+ employee[i].getEmpSalary() + "\t\t" + employee[i].getEmpDesignation() + "\t\t"
						+ employee[i].getEmpReportingmanager());

			}


		}

	}

}
