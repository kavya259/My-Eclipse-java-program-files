package review;
import java.util.Scanner;
public class doubtclearing {
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

	for(int i=0;i<a.length;i++ )
	{
		for(int j=0;j<a.length;j++)
		{
		if((a[i][j])%2==0)
		{
			temp[i][j]=a[i][j]*a[i][j];
		}
		else
		{
			temp[i][j]=a[i][j];}
		}
	}
	for(int k=0;k<temp.length;k++)
	{
		System.out.println();
	
		for(int f=0;f<temp.length;f++)
		{
	System.out.print (temp[k][f]+" ");
	}
	}
	}
}
