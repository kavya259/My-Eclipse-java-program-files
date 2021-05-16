package printsquares;
/* Write a program that should print squares of natural numbers (1,2....10) the square should not go
beyond 100, & array size should not store more than 10 elements. Generate exception if range overflow.*/
import java.util.Scanner;
public class PrintSquare {

	public static void main(String[] args)
	{
		int i;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		n=s.nextInt();
		toCheckSize(n);
	
		int a[]=new int[n];
		for( i=0;i<n;i++)
		{
			a[i]=(i+1)*(i+1);
			toCheckValue(a[i]);
			
		}
		System.out.println("Square matrix is ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int toCheckSize(int n)
	{
		if(n<=10)
		{
			n=n;		}
		else
		{
			System.out.println("The array cannot contain the size more than 10");
		}
		return n;
	}
	public static int toCheckValue(int a)
	{
		if(a>100)
		{
			System.out.println("Your array cannot have value more than 100");
		}
		else
		{
			a=a;
		}
	return a;	
	}
}
