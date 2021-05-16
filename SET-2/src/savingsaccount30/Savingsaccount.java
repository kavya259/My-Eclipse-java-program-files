package savingsaccount30;

import java.util.Scanner;


public class Savingsaccount {

	double balance;
	int interestrate;
	int accountNo;
	int time;
public Savingsaccount() {
		
		balance=0;
		interestrate=0;
		accountNo=0;
	}
	public Savingsaccount(double b,int rate,int acc) {
		balance=b;
		interestrate=rate;
		accountNo=acc;
	}

	
	
	public void withDraw(double amount)
	{
	
		
if(amount>balance)
{
	System.out.println("sorry,the balance is short of : "+(amount-balance)+". So, the withdrawal is not possible");
	
}
	else
	{
		balance=(balance-amount);
	    System.out.println("Successfully withdrawn "+ amount);
	}
}
	
	
	public double calculateInterest(double balance,int time,int rate)
	{
		double SIMPLEINTEREST =(balance*time*rate)/100;
		System.out.println("The simple interest for your account balance \t"+ balance+"is : "+SIMPLEINTEREST);
		return SIMPLEINTEREST;
	}
	
	public static void main(String[] args)
	{ Savingsaccount S= new Savingsaccount();

	Scanner sc=new Scanner(System.in);
		System.out.println("enter your Account number :");
		int n=sc.nextInt();
		double bal=100000;
		int rate=6;
		System.out.println("Enter the time period ");
		int time=sc.nextInt();
		//savingsAccount();
		// savingsAccount(bal,rate,n);
		System.out.println("enter the amount to with draw :");
		double am=sc.nextDouble();
		Savingsaccount S1= new Savingsaccount(bal,time,rate);

	
		S1.withDraw(am);
		if((bal-am)>0) {
		S1.calculateInterest(bal-am, time, rate);
		}
		
		
		
			
	}
	
	
	}
	

