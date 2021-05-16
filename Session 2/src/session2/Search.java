package session2;

import java.util.Scanner;


public class Search {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("enter the row value ");
		int m=sc.nextInt();
		System.out.println("enter the column value ");
		int n=sc.nextInt();

	int a[][]=new int[m][n];
	int temp[][]=new int[m][n];
	System.out.println("enter the array elements ");
	for(int f=0;f<a.length;f++)
		{
		for(int k=0;k<a.length;k++)
		{
			a[f][k]=sc.nextInt();
		}
		
		
	}
	/*System.out.println("enter the number to be searched ");
	int num=sc.nextInt();
*/

	toConvert(a,m,n);
	}
	
	
	public static void toSearch(int a[],int num)
	{
		for(int f=0;f<a.length;f++)
		{
			for(int p=f+1;p<a.length;p++)
			{
				if(a[f]>a[p])
				{
				int t=a[f];
				a[f]=a[p];
				a[p]=t;
				}
			}
			
		}
		System.out.println("sorted array is : ");
		for(int f=0;f<a.length;f++)
		{
			System.out.println(a[f]+" ");
		}
		int f = 0;
		int l = a.length ;
		 int mid = (f + l) / 2;
     boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				while (f < l) {
					if (a[mid] < num) {
						f = mid + 1;
					} else if (a[mid] == num) {
						flag=true;
						break;
					} else {
						l = mid - 1;
					}
					mid = (f + l) / 2;
				}
			}
		
				}
			
		
		if(flag==true)
		{
			System.out.println("found at location " + (mid + 1));
			
		}
		else
		{
			System.out.println("not found");

		}
		
	}
	public static void toConvert(int a[][],int m,int n)
	{
		

		int index=m*n;
		int arr[]=new int[index];
		System.out.println("1D array is :");
		int i;
		int ind=0;
		
		for( i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ind<index)
				{
			arr[ind]=a[i][j];
			ind++;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");

		}
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number to be searched ");
		int num=sc.nextInt();
		toSearch(arr,num);
		
		
	}
	
	
	}

	
	
	
	
	

