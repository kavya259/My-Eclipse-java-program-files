package exchangenames;
import java.util.Scanner;
import java.util.*;
public class Exchange {
	public static void main(String []args)
	{
	String s1;
	String s2;
	String ln1;
	String ln2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name1 :");
	//System.out.print(" ");
	s1=sc.nextLine();
	//s1=s1+".";
	System.out.println("enter name2 :");
	//System.out.print(" ");

	s2=sc.nextLine();
	//s2=s2+".";
	int gap1=s1.indexOf(" ");
	int gap2=s2.indexOf(" ");

	ln1=s1.substring(gap1);
	ln2=s2.substring(gap2);
	String s11=s1.substring(0, gap1);
	String s22=s2.substring(0, gap2);

	System.out.println("names after swapping last names are :");
	System.out.println(s11+" "+ln2);
	System.out.println(s22+" "+ln1);



	}
	
	

}
