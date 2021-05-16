package reverseofanumber;

import java.util.Scanner;
public class Reverseofanumber {
	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to be reversed :");
		number=s.nextInt();
		System.out.println("the reverse of numer "+ number +" is :");
		reverseofaNumber(number);
	}
public static  int reverseofaNumber(int number)

	{
	int  rev=0;
	int rem=0;
	while(number>=1)
	{
	rem=number%10;
	rev=rev*10+rem;
	number=number/10;
	}
	System.out.println(rev);
	
return rev;
	
	}

}
