package two;
import java.util.Scanner;
public class Museum {
	private String visName;
	private int visAge;
	private String gender;
	
	
	public Museum()
	{
		
	}
	public Museum(String visName, int visAge, String gender) {
		super();
		this.visName = visName;
		this.visAge = visAge;
		this.gender = gender;
	}
	public String getVisName() {
		return visName;
	}
	public void setVisName(String visName) {
		this.visName = visName;
	}
	public int getVisAge() {
		return visAge;
	}
	public void setVisAge(int visAge) {
		this.visAge = visAge;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void takeVisitorDetails()
	{
		String name,gender;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the visitor ");
		name=sc.nextLine();
		System.out.println("Enter the gender of the visitor ");
		gender=sc.nextLine();
		System.out.println("Enter the age of the visitor ");
		age=sc.nextInt();
		setVisName(name);
		setVisAge(age);
		setGender(gender);
		
		display(getVisName(),getVisAge(),getGender());
		
	
	}
	public void display(String name,int age,String gender)
	{
		System.out.println("VisitorName \t VisitorAge \t  Gender");
		System.out.println(name+"\t\t"+age+"\t\t"+gender);
		
	}



}
