package isprimeornot;

import java.util.Scanner;

public class Isprimeornot {
	public static void main(String[] args)
	{
	int number,factor;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number : ");
	number=s.nextInt();
	System.out.println(isPrime(number));
	
		
	}
	public static boolean  isPrime(int number)
	{
		int count=0;
		int factor;
		for(factor=1;factor<=number;factor++)
		{
			if(number%factor==0)
			{
				count=count+1;
			}
		}
		if((count>2||count<1)||number<=1)
		{
			return false;
		}
		else return true;	
	}
	

}
