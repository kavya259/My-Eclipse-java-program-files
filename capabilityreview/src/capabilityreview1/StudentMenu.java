package capabilityreview1;

import java.util.Scanner;

public class StudentMenu {

	public static void main(String[] args) {
		int option;
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		int n = 20;
		Student students[] = new Student[n];
		int size = -1;
		for (int i = 0; i < students.length; i++) {

			students[i] = new Student();

		}

		do {

			System.out.println("Select from the following options");

			System.out.println(
					"1.Add student details\n2.Search student\n3.modify details\n4.delete details\n5.Display all student details\n 6.display student details based on studentno\n7.sortBy id\n8.Exit\n");
			option = sc.nextInt();

			if (option == 1 && size < students.length) {
				size++;
			}

			switch (option) {
			case 1:

				student.addStudentDetails(students, size);

				break;
			case 2:
				System.out.println("Enter the student roll number to search ");
				int roll = sc.nextInt();
				student.searchStudent(students, size, roll);
				break;
			case 3:
				student.modifyDetails(students, size);
				break;
			case 4:
				size--;
				student.deleteStudentDetails(students, size);
				break;
			case 5:
				student.displayAll(students, size);
				break;
			case 6:
				student.displaySearchStudent(students, size);
				break;
			case 7:
				student.sortById(students, size);
				break;
			case 8:
				break;

			}

		} while (option != 8);
		sc.close();

	}

}
