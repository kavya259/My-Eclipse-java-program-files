package employeemanagement;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		System.out.println("Enter the number of employees");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		EmployeeDriver employee = new EmployeeDriver();
		Employee[] employees = new Employee[size];
		for (int i = 0; i < size; i++) {
			employees[i] = new Employee();
		}
		int choice;

		do {
			System.out.println("========================================================");
			System.out.println("Please select your choice ");
			System.out.println("1.Add Employee details\n" + "2.Modify Employee details\n"
					+ "3.Search  employee based on gender\n" + "4.Delete Employee based on id\n"
					+ "5.Display Employees\n" + "6.Search based on employee name to find position\n7.Exit\n");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				employees = employee.addEmployee(employees);
				System.out.println("========================================================");
				break;
			case 2:
				employee.modifyEmployeeDetails(employees);
				System.out.println("========================================================");
				break;
			case 3:

				employee.searchEmployeeBasedOnGender(employees);
				System.out.println("========================================================");
				break;
			case 4:
				employees = employee.deleteEmployee(employees);
				System.out.println("========================================================");
				break;
			case 5:
				employee.displayEmployee(employees);
				System.out.println("========================================================");
				break;
			case 6:
				Employee sortEmployee[] = employee.doSort(employees);
				
				int foundPosition = employee.searchBasedOnEmployeeName(sortEmployee);
				System.out.println("the name is found at postion" + foundPosition);
				System.out.println("========================================================");

				break;
			case 7:
				System.out.println("\n.......Thank you.........");
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}

		} while (choice <= 7);

	}

	public Employee[] addEmployee(Employee[] employees) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter the employee id");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("enter The employee name");
			String name = s.nextLine();
			System.out.println("Enter the subject");
			String subject = s.nextLine();
			System.out.println("Enter the salary");
			long salary = s.nextLong();
			s.nextLine();
			System.out.println("Enter the age");
			int age = s.nextInt();
			s.nextLine();
			System.out.println("Enter the gender (male/female)");
			String gender = s.nextLine();

			employees[i].setEmployeeId(id);
			employees[i].setName(name);
			employees[i].setSubject(subject);
			employees[i].setSalary(salary);
			employees[i].setAge(age);
			employees[i].setGender(gender);

		}

		return employees;

	}

	public void displayEmployee(Employee[] employee) {
		System.out.println("EmployeeId\tName\tSubject\t\tSalary\t\tAge\t\tGender");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].getEmployeeId() + "\t\t" + employee[i].getName() + "\t\t"
					+ employee[i].getSubject() + "\t" + employee[i].getSalary() + "\t\t" + employee[i].getAge() + "\t\t"
					+ employee[i].getGender());
		}

	}

	public void modifyEmployeeDetails(Employee[] employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee Id to search employee details to modify");
		int empId = sc.nextInt();
		sc.nextLine();
		int i = 0;
		while (i < employee.length) {
			if (employee[i].getEmployeeId() == empId) {
				System.out.println("Enter the employee name");
				String newName = sc.nextLine();
				employee[i].setName(newName);
				System.out.println("Enter the employee Subject");
				String newSubject = sc.nextLine();
				employee[i].setSubject(newSubject);
				System.out.println("Enter the employee Salary");
				long newSalary = sc.nextLong();
				sc.nextLine();
				employee[i].setSalary(newSalary);
				System.out.println("Enter the employee Age");
				int newAge = sc.nextInt();
				employee[i].setAge(newAge);
				sc.nextLine();
				System.out.println("Enter the gender ");
				String newGender = sc.nextLine();
				employee[i].setGender(newGender);
				displayEmployee(employee);
				break;

			} else {
				i++;
			}

		}

	}

	public Employee[] deleteEmployee(Employee[] employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Id of the employee to delete");
		int id = sc.nextInt();
		int size = employee.length;
		int count = 0;

		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmployeeId() == id) {
				count++;

				break;
			}
		}

		int j = 0;

		Employee[] afterDeletion = new Employee[size];
		for (int i = 0; i < size; i++) {
			afterDeletion[i] = employee[i];
		}
		// System.out.println("while transfer");
		// displayEmployee(afterDeletion );

		if (count > 0) {
			for (int i = 0; i < employee.length; i++) {

				if (employee[i].getEmployeeId() == id) {

					j = i;
					while (j < employee.length - 1) {

						afterDeletion[j] = employee[j + 1];
						j++;

					}
					size--;

					break;
				}

			}
			// System.out.println("while transfer reduce");
			// displayEmployee(afterDeletion );

		}
		Employee[] finalAfterDeletion = new Employee[size];
		for (int i = 0; i < size; i++) {
			finalAfterDeletion[i] = afterDeletion[i];
		}

		// System.out.println("final");

		if (finalAfterDeletion.length > 0) {
			displayEmployee(finalAfterDeletion);
		} else {
			System.out.println("No details found,all deleted");
		}

		return finalAfterDeletion;
	}

	public void searchEmployeeBasedOnGender(Employee[] employees) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee gender to search ");
		String searchGender = sc.nextLine();
		int countOnGender = countOnGender(employees, searchGender);
		Employee[] employeeOnGender = new Employee[countOnGender];
		int index = 0;
		if (countOnGender > 0) {
			for (int i = 0; i < employees.length; i++) {
				if (employees[i].getGender().equals(searchGender)) {
					employeeOnGender[index] = employees[i];
					index++;

				}

			}

			displayEmployee(employeeOnGender);
		}

	}

	private Employee[] doSort(Employee[] employees) {

		Employee temp = new Employee();
		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {

				if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
					temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;

				}
			}

		}

		return employees;
	}

	public int searchBasedOnEmployeeName(Employee[] employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to search for its position");
		String searchName = sc.nextLine();
		int first = 0;
		int last = employee.length;
		int mid = (first + last) / 2;;
		boolean found = false;
		int position=0;

		for (int i = 0; i < employee.length; i++) {
			while (last > first) {
				

				if (employee[mid].getName().compareTo(searchName)==0) {
					position=mid;
					found = true;

					break;

				} else if (employee[mid].getName().compareTo(searchName) > 0) {

					last = mid - 1;

				} else if(employee[mid].getName().compareTo(searchName) < 0) {
					first = mid + 1;

				}
				mid = (first + last) / 2;
				
				

			}

		}

		if(found==true)
		{
			System.out.println("found ");
		}
		else
		{
			System.out.println("not found");
		}
		
		return position;
		

	}

	public static int countOnGender(Employee[] employees, String searchGender) {
		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getGender().equals(searchGender)) {
				count++;
			}

		}
		return count;

	}

}

/*
 * public static void deleteEmployee(Employee[] employee) { Scanner sc = new
 * Scanner(System.in);
 * System.out.println("enter the Id of the employee to delete"); int id =
 * sc.nextInt(); int size = employee.length; int count = 0;
 * 
 * for (int i = 0; i < employee.length; i++) { if (employee[i].getEmployeeId()
 * == id) { count++;
 * 
 * break; } }
 * 
 * int j=0; Employee[] afterDeletion = new Employee[size];
 * 
 * if (count > 0) { for (int i = 0; i < employee.length; i++) {
 * 
 * if (employee[i].getEmployeeId() == id) {
 * 
 * j = i; while (j < size-1) {
 * 
 * afterDeletion[j] = employee[i + 1]; j++;
 * 
 * } size--; break; } else { afterDeletion[j] = employee[i]; j++; }
 * 
 * 
 * }
 * 
 * } if (afterDeletion.length > 1) { displayEmployee(afterDeletion); } else {
 * System.out.println("No details found,all deleted"); }
 * 
 * }
 */
