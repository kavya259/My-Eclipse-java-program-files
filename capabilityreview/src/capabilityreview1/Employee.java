package capabilityreview1;

import java.util.Scanner;

public class Employee {
	private String empName;
	private int age;

	public Employee() {
		
	} 

	public Employee(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		String s = "";
		for (int i = 0; i < empName.length(); i++) {
			if (empName.charAt(i) >= 65 && empName.charAt(i) <= 90) {
				s = s + empName.charAt(i);
			} else if (empName.charAt(i) >= 97 && empName.charAt(i) <= 122) {
				s = s + (char) ((int) empName.charAt(i) - 32);

			} else {
				System.out.println(
						"Employee name must have only characters not integers nor special characters,please try again ");
				break;
			}

		}
		empName = s;
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee[] takeEmployeeDetails(Employee[] details) {
		int i;
		int n=details.length;
		String name;
		int age;

		for (i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the employee name ");

			name = sc.nextLine();
			details[i].setEmpName(name);

			System.out.println("Enter the employee age ");

			age = sc.nextInt();
			details[i].setAge(age);
			System.out.println();

		}

		display(details);
		return details;

	}

	public void display(Employee[] print) {
		int n = print.length;
		System.out.println();
		System.out.println("EmployeeName \t Age \t");
		for (int i = 0; i < n; i++) {
			System.out.println(print[i].getEmpName() + "\t\t" + print[i].getAge());

		}
	}

	public void printNamesInMatrix(Employee[] matrix) {
		String temp = new String();
		String strLargeEmpName = "";
		int n = matrix.length;
		int row = 0;
		for (int i = 0; i < n; i++) {
			if (matrix[i].empName.length() > strLargeEmpName.length()) {
				strLargeEmpName = matrix[i].empName;
			}

		}
		row = strLargeEmpName.length();
		char[][] mat = new char[row][row];
		for (int i = 0; i < n; i++) {

			if (i < n) {
				temp = matrix[i].empName;// storing ith employee name
			} else {
				break;
			}

			int j = 0;
			while (j < mat.length) {
				if (j <= temp.length() - 1) {
					mat[i][j] = temp.charAt(j);
					j++;

				} else {
					mat[i][j] = '!';
					j++;
				}
			}

			/*
			 * while (j < length) {
			 * 
			 * for (int k = 0; k < length; k++) { if (j<temp.length()-1) { c[k] =
			 * temp.charAt(j); j++; } else { c[k] = '!'; j++; }
			 * 
			 * }
			 * 
			 * }
			 */
		}

		displayMatrix(mat,n);
	}

	public void displayMatrix(char[][] namechar,int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < namechar[i].length; j++) {

				System.out.print(namechar[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	public void sortEmployeeNames(Employee[] names) {
		String temp;
		int tempAge;
		int n = names.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (names[i].empName.compareTo(names[j].empName) > 0) {
					temp = names[i].empName;
					names[i].empName = names[j].empName;
					names[j].empName = temp;
					tempAge=names[i].age;
					names[i].age=names[j].age;
					names[j].age=tempAge;


				}

			}
		}

		display(names);

	}

	public void findYoungAndOld(Employee[] em) {
		int temp;
		String tempName;
		int n = em.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (em[i].age > em[j].age) {
					temp = em[i].age;
					em[i].age = em[j].age;
					em[j].age = temp;
					tempName = em[i].empName;
					em[i].empName = em[j].empName;
					em[j].empName = tempName;
					
					
					
					

				}

			}
		}
		int countYoungest = 0;

		for (int i = 0; i < n; i++) {
			if (em[0].age == em[i].age) {
				countYoungest=i;
			}

		}
		int countOldest = 0;

		for (int i = 0; i < countOldest; i++) {
			if (em[n - 1].age == em[i].age) {
				countOldest=i;
			}

		}

		System.out.println("Youngestemployee \t Age ");
		for (int i = 0; i <= countYoungest; i++) {

			System.out.println(em[i].empName + "\t\t" + em[i].age);
		}
		System.out.println();
		System.out.println("oldestemployee   age ");
		for (int i = 0; i <= countOldest; i++) {

			System.out.println(em[n - 1].empName + "  \t\t" + em[n - 1].age);
		}

	}

}
 