package primearray;
/*
 * program to find the number of prime numbers in an array and form a new array of prime
numbers.
 */
import java.util.Scanner;

public class PrimeArray {
	public static void main(String[] args) {
		int row;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		row = s.nextInt();
		int a1[] = new int[row];
		System.out.println("Please enter the elements in array");
		for (int i = 0; i < row; i++) {
				a1[i] = s.nextInt();
			}
		toPrint(a1,row);
		tocheckPrime(a1,row);

}
	public static void toPrint(int[] a1, int row) {
		System.out.println("elements are  :");
		for (int i = 0; i < row; i++) 
		{
				System.out.print(a1[i] + " ");
			}
		System.out.println();

	}
	public static void tocheckPrime(int[] a1, int m) 
	{
		int ind=0;
		int prime[]=new int[m];
		for (int i = 0; i < m; i++) 
		{
			int n=1;
			int count=0;


			while(n<=a1[i])
			{
			if(a1[i]%n!=0 )
			{
				n++;
			}
			else		
			{
				count++;
				n++;
			}
			}
			if(count==2 )
			{
				prime[ind]=a1[i];
				ind++;
			}
			
			}
		System.out.println("resultant prime number array ");
		System.out.print("[ ");
		for (int i = 0; i<ind; i++) 
		{
			System.out.print(prime[i]+" ");
		}
		System.out.print("]");

		
	}

	
	
	}
	



/*
 * 
 * OUTPUT
 * Please enter the size of array
7
Please enter the elements in array
1
7
9
4
8
2
5
elements are  :
1 7 9 4 8 2 5 
resultant prime number array 
[ 7 2 5 ]

*/