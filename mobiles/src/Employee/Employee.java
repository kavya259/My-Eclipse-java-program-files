package Employee;

public class Employee {

	private String empMid;
	private String empName;
	private long empSalary;
	private String empDesignation;
	private String empReportingmanager;

	public Employee() {
	}

	public Employee(String empMid, String empName, long empSalary, String empDesignation, String empReportingmanager) {
		this.empMid = empMid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.empReportingmanager = empReportingmanager;
	}

	public String getEmpMid() {
		return empMid;
	}

	public void setEmpMid(String empMid) {
		this.empMid = empMid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpReportingmanager() {
		return empReportingmanager;
	}

	public void setEmpReportingmanager(String empReportingmanager) {
		this.empReportingmanager = empReportingmanager;
	}

}
