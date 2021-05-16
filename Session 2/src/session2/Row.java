package session2;

import java.util.Scanner;

public class Row {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("enter the row and column ");
		int m=sc.nextInt();
	
	int a[][]=new int[m][m];
	//int temp[][]=new int[m][m];
	System.out.println("enter the array elements ");
	for(int f=0;f<a.length;f++)
		{
		for(int k=0;k<a.length;k++)
		{
			a[f][k]=sc.nextInt();
		}
		}
	System.out.println("enter the array elements are ");

	for(int f=0;f<a.length;f++)
	{
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[f][k]+" ");
	}
	System.out.println();
	}
	rowSum(a,m);
}
	
	
	
	public static void rowSum(int a[][],int m)
	{

		int rsum[]=new int[m];
		for(int f=0;f<a.length;f++)
		{
		for(int k=0;k<a.length;k++)
		{
			rsum[f]=rsum[f]+a[f][k];

			
		}
		System.out.println("Sum of row is "+f+" : "+ rsum[f]);
		
		}
		int max=0;
		int i;
		for( i=0;i<m;i++)
		{
			if(rsum[i]>max)
			{
				max=rsum[i];
			}
		}
		System.out.println("largest row sum is : "+ max + "which is sum of row "+ i );
		
		
	}
}
