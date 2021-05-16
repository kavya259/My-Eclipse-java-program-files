package review;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args)
	{
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size or column size for a square matrix ");
		m=sc.nextInt();
		int a[][]=new int[m][m];
		System.out.println("enter the array elements ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.println(a[i][j]+" ");
				
			}
			System.out.println(" ");

		}
		System.out.println("transpose array is : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
				
			}
			System.out.println(" ");

		}

	}
		
	}
