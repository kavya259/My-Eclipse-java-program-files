package generatepassword;
import java.util.Scanner;
public class Password {
public static void main(String [] args)
{
	String fname;
	String mname;
	String lname;
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first name ");
	fname=sc.next();
	System.out.println("enter middle name ");
	mname=sc.next();
	System.out.println("enter last name ");
	lname=sc.next();
	System.out.println("enteryour age : ");
	age=sc.nextInt();
	System.out.println("your password is : ");
	System.out.print(fname.charAt(0));
	System.out.print(mname.charAt(0));
	System.out.print(lname.charAt(0));
	System.out.print(age);

	


	}
	
}
