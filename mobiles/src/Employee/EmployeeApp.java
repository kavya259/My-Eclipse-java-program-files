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
							+ "6.Get all employees having same reporting manager\n7.Get employees above the given range \n8.Exit");

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
				System.out.println("Please enter the reporting manager name ");
				String tempRepManager = sc.nextLine();
				int count = countEmployees(employees, tempRepManager);
				if (count > 0) {

					Employee[] sameReportingManager = getAllEmployeesOnSameReportingManager(employees, tempRepManager);
					displayAllEmployees(sameReportingManager);
				} else {
					System.out.println("no employees with the given reporting manager");
				}

				break;
			case 7:
				System.out.println("Please enter the salary above which you want the employees  ");
				long salary = sc.nextLong();
				int countSal = countEmployeeOnSalaryAbove(salary, employees);
				if (countSal > 0) {
					Employee[] employeesOnSalary = getAllEmployeesOnSalaryAbove(salary, employees);
					displayAllEmployees(employeesOnSalary);
				}

				break;
			case 8:
				System.out.println("Exited\n****ThankYou****");
				System.out.println("=====================================================================");

				break;

			default:
				System.out.println("invalid choice");
				System.out.println("=====================================================================");

				break;

			}

		} while (choice != 8);

	}

	private static Employee[] getAllEmployeesOnSalaryAbove(long salary, Employee[] employee) {
		int count = countEmployeeOnSalaryAbove(salary, employee);
		Employee[] onSalary = new Employee[count];
		int index = 0;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmpSalary() > (salary)) {
				onSalary[index] = employee[i];
				index++;
			}
		}

		return onSalary;
	}

	public static int countEmployeeOnSalaryAbove(long salary, Employee[] employee) {
		int count = 0;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmpSalary() > (salary)) {
				count++;
			}
		}

		return count;

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

			// employee[i] = new Employee(id, name, salary, designation, reportManager);
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

	public static Employee[] getAllEmployeesOnSameReportingManager(Employee[] employee, String tempRepManager) {
		int count = countEmployees(employee, tempRepManager);
		Employee[] sameRept = new Employee[count];
		int index = 0;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmpReportingmanager().equals(tempRepManager)) {
				sameRept[index] = employee[i];
				index++;
			}
		}
		return sameRept;

	}

	public static int countEmployees(Employee[] employee, String reporter) {
		int count = 0;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmpReportingmanager().equals(reporter)) {
				count++;
			}
		}

		return count;

	}

	public static void sortOnReportingManager(Employee[] employees) {
		Employee sortedEmployees = new Employee();
		// Employee[] tempArray=new Employee[index];

		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getEmpReportingmanager().compareTo(employees[j].getEmpReportingmanager()) > 0) {
					sortedEmployees = employees[i];
					employees[i] = employees[j];
					employees[j] = sortedEmployees;

				} else if (employees[i].getEmpReportingmanager()
						.compareTo(employees[j].getEmpReportingmanager()) == 0) {
					if (employees[i].getEmpName().compareTo(employees[j].getEmpName()) > 0) {
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

				if (employees[i].getEmpDesignation().compareTo(employees[j].getEmpDesignation()) < 0) {

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
