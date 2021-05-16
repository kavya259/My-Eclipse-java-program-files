package capabilityreview1;

import java.util.Scanner;

public class Student {
	private int studentNo;
	private String name;
	private String studentClass;

	public Student() {

	}

	public Student(int studentNo, String name, String studentClass) {
		this.studentNo = studentNo;
		this.name = name;
		this.studentClass = studentClass;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Student[] addStudentDetails(Student[] student, int size) {
		Scanner na, no, cl;

		for (int i = size; i < size + 1; i++) {
			na = new Scanner(System.in);
			System.out.println("Enter student name ");
			String strName = na.nextLine();

			no = new Scanner(System.in);
			System.out.println("Enter student Number ");
			int roll = no.nextInt();

			cl = new Scanner(System.in);
			System.out.println("Enter student class ");
			String strClass = cl.nextLine();

			student[i].setName(strName);
			student[i].setStudentNo(roll);
			student[i].setStudentClass(strClass);

		}

		return student;

	}

	public void searchStudent(Student[] student, int roll, int size) {

		for (int i = 0; i < size + 1; i++) {
			if (student[i].studentNo == roll) {

				System.out.println("Student id found :");
				break;
			} else if (i == student.length - 1 && student[i].studentNo != roll) {
				System.out.println("not found");
			}

		}

	}

	public void display(Student[] student, int i) {
		System.out.println("....searched student details.....");

		System.out.println("StudentNo    : " + student[i].getStudentNo());
		System.out.println("StudentName  : " + student[i].getName());
		System.out.println("StudentClass : " + student[i].getStudentClass());
		System.out.println();

	}

	public Student[] modifyDetails(Student[] student, int length) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the student roll number to search student to modify details ");
		int roll = r.nextInt();
		int option;
		int i=0;
		while ( i <= length) {
			if (student[i].studentNo == roll) {
				System.out.println("Student id found :");
				do {

					System.out.println("Select what to modify \n 1.Studentname \n2.StudentClass \n3.No modification");
					option = r.nextInt();
					switch (option) {
					case 1:
						System.out.println("Enter the student name to modify");
						Scanner s = new Scanner(System.in);

						String nameModified = s.nextLine();
						student[i].setName(nameModified);
						break;
					case 2:
						System.out.println("Enter the student Class to modify");
						Scanner m = new Scanner(System.in);

						String classModified = m.nextLine();
						student[i].setStudentClass(classModified);
						break;

					case 3:
						break;

					}

				} while (option != 3);
				
				break;
			}
			
				i++;
			

		}

		return student;

	}

	public Student[] deleteStudentDetails(Student[] student, int size) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give the student name to delete details");
		String stName = s.nextLine();

		Student temp[] = new Student[size + 1];

		for (int i = 0; i <= size; i++) {
			if (student[i].name.equals(stName)) {
				int j = i;
				while (j <= size) {
					student[j] = student[j + 1];
					j++;

				}
				size--;

			}
		}
		for (int i = 0; i < size; i++) {
			temp[i] = student[i];
		}

		return temp;

	}

	public void displayAll(Student[] student, int length) {
		System.out.println("All students details");
		System.out.println("----------------------");

		for (int i = 0; i <= length; i++) {
			System.out.println("StudentNo\t Name\t Class");
			System.out.println(" " + student[i].getStudentNo() + "\t\t" + student[i].getName() + "\t "
					+ student[i].getStudentClass());
			System.out.println("-----------------------------------------------");
		}

	}

	public void displaySearchStudent(Student[] student, int length) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student roll number to search ");
		int roll = s.nextInt();
		for (int i = 0; i <= length; i++) {
			if (student[i].studentNo == roll) {
				System.out.println("Student id found :");
				display(student, i);
			}
			if (i == student.length - 1 && student[i].studentNo == roll) {
				System.out.println("not found");
			}

		}

	}

	public Student[] sortById(Student[] student, int size) {
		int tempno = 0;
		String tempname = "";
		String tempclass = "";

		for (int i = 0; i <= size; i++) {
			for (int j = i + 1; j <= size; j++) {
				if (student[i].studentNo > student[j].studentNo) {
					tempno = student[i].studentNo;
					student[i].studentNo = student[j].studentNo;
					student[j].studentNo = tempno;
					tempname = student[i].name;
					student[i].name = student[j].name;
					student[j].name = tempname;
					tempclass = student[i].studentClass;
					student[i].studentClass = student[j].studentClass;
					student[j].studentClass = tempclass;

				}

			}

		}
		displayAll(student, size);
		return student;

	}

}














/*	public Student[] modifyDetails(Student[] student, int length) {
Scanner r = new Scanner(System.in);
System.out.println("Enter the student roll number to search student to modify details ");
int roll = r.nextInt();
int option;
for(int i=0;i<=length;i++) {
	if (student[i].studentNo == roll) {
		System.out.println("Student id found :");
		do {

			System.out.println("Select what to modify \n 1.Studentname \n2.StudentClass \n3.No modification");
			option = r.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the student name to modify");
				Scanner s = new Scanner(System.in);

				String nameModified = s.nextLine();
				student[i].setName(nameModified);

				break;
			case 2:
				System.out.println("Enter the student Class to modify");
				Scanner m = new Scanner(System.in);

				String classModified = m.nextLine();
				student[i].setStudentClass(classModified);
				break;

			case 3:
				break;
			}

		} while (option != 3);
		break;
		
	}

}

return student;

}*/


