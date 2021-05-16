package subsetsum49;

import java.util.Scanner;

public class Testsubset {

	public static void main(String[] args)
	{
		int n;
		int i;
		int sum;
		Subsetsum sub=new Subsetsum();
		 Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of the array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(" array elements are : ");
		System.out.println("");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		sub.doBubblesort(arr,n);
		 System.out.println("sorted array is : ");

		 for(int k=0;k<n;k++)
		 {
			 System.out.print(arr[k]+" ");

		 }
		 System.out.println();

		 System.out.println("give the sum value :");
		 sum=sc.nextInt();

		sub.printSubset( arr,sum);
		
	}


}
