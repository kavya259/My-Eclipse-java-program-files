package factorialofanumber;

import java.util.Scanner;


public class Factorialofanumber {
	public static void main(String[] args){
		
		int i;
		int number;
		
		Scanner s  = new Scanner(System.in);
		System.out.println("enter a number");
		number = s.nextInt();
		System.out.println("Factorial of " +  number +" is "+  factorial( number));
	}
	
	public static int factorial(int number){
		if(number==0)
		{
		return 1;
		}
		else {
			return number*factorial(number-1);
		}
		
	}

}
