package rowmagic39;

import java.util.Scanner;
public class Rowmagic {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		int row,col;
		System.out.println("enter size of row :  ");
		row=sc.nextInt();
		System.out.println("enter size of column : ");
		col=sc.nextInt();
		checkRowmagic(row,col);
		
	}

	//Scanner sc=new Scanner(System.in);
	public static boolean checkRowmagic(int r,int c)
	{
		int m=r;
		int n=c;
		
		System.out.println("enter the elements in the array : ");
		int a[][]=new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 a[i][j]=sc.nextInt();
			}
						
		}
		
		//to priint array
		 System.out.println("array elements are :");
			System.out.println("");		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 System.out.print(" "+a[i][j]+" ");
			}
				System.out.println("");		
		}
		
		//to do sum of each row
		int sum[]=new int[m];
	
		for(int i=0;i<m;i++)
		{		sum[i]=0;

			for(int j=0;j<n;j++)
			{
			 sum[i]=sum[i]+a[i][j];
			}
			System.out.println("sum of row "+(i+1)+" = " +sum[i]);
								
	
			if(sum[i]==sum[i+1])
			{
				
			System.out.println("not a row magic");
			return true;	
			}
			

		}
		
		
			
		
	
		return false;
	
		
	
	}
}