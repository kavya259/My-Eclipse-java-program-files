package customerfeedback31;

import java.util.Scanner;


public class Customerfeedback {
	String Name;
	String mobileno;
	double rating ;

	public Customerfeedback() {
	 Name="";
     mobileno=" ";
	 rating =0.0;
	}

	public Customerfeedback(String N,String M,double R) {
		 Name=N;
		 mobileno=M;
		 rating =R;
		}
	public void feedBack(double feed,int i )
	{
		System.out.println("customer "+ i +"  : "+feed + " out of 5");
	}
	
	public static void main(String [] args)
	{
		Customerfeedback c=new Customerfeedback();
		System.out.println("enter number of customers :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{			Scanner v=new Scanner(System.in);
System.out.println("  \n details of customer "+ i);
			System.out.println("\n enter your name :");
			String N=v.nextLine();
			Scanner h=new Scanner(System.in);

			System.out.println("enter your mobile number :");
			String Mno=h.nextLine();
			Scanner b=new Scanner(System.in);

			System.out.println("enter your feedback Rating :");
			int ra=b.nextInt();
			
			Customerfeedback c1=new Customerfeedback(N,Mno,ra);
			c1.feedBack(ra, i);
			

			
			
			
		}
		
		
	}
}
