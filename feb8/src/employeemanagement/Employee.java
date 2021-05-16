package employeemanagement;

public class Employee {
	private int employeeId;
	private String name;
	private String subject;
	private long salary;
	private int age;
	private String Gender;

	public Employee() {
	}

	public Employee(int employeeId, String name, String subject, long salary, int age, String gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.subject = subject;
		this.salary = salary;
		this.age = age;
		Gender = gender;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

}
