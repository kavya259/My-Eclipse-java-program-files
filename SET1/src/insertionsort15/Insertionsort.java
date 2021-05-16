package insertionsort15;
import java.util.Scanner;
public class Insertionsort {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		int i,j;
		int temp;
		System.out.println("enter the size of the array elements :");
		n=sc.nextInt();
		 System.out.print("enter array elements :");
			System.out.println();

		 int a[]=new int[n];
		 for( i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
			System.out.print(" array before sorting : ");

		 for( i=0;i<n;i++)
		 {
				System.out.print(a[i]+" ");

		 }
		 
			System.out.println();

		 for(i=1;i<a.length;i++)
		 {
			 temp=a[i];
			 j=i;
			 while(j>0 && a[j-1]>temp)
			 {
				 a[j]=a[j-1];
				 j=j-1;
			 }
			 a[j]=temp;
			 
		 }
			System.out.print(" sorted array :");

		
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
