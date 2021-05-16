package sumofarrayelements;

import java.util.Scanner;

public class Sumofelements {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of values : ");
		int num=s.nextInt();
		
		int[] array= new int[num];
		int i;
	int sum=0;
		System.out.println("Enter the array elements : ");
		for(i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<array.length;i++)
		{
		sum=sum+array[i];
		}
		System.out.println("Sum of the elements in the given array is : "+ sum);
			
		
		
	}

}
