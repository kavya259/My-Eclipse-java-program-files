package triplets;
import java.util.Scanner;
public class Triplets {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
	int n;
	int i;
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
	doBubblesort(arr,n);
	 System.out.println("sorted array is : ");

	 for(int k=0;k<n;k++)
	 {
		 System.out.print(arr[k]+" ");

	 }
	 System.out.println();


	printTriplets( arr);
	
}
public static void doBubblesort(int arr[],int  n) {
	 int temp; 

// Sorting strings using bubble sort 
for (int j = 0; j < n ; j++) 
{ 
   for (int i = j + 1; i < n; i++)  
   { 
       if (arr[j]>(arr[i]) ) 
       { 
           temp = arr[j]; 
           arr[j] = arr[i]; 
           arr[i] = temp; 
       } 
   } 
} 


}

public static void printTriplets(int arr[])
{
	int i,j,k;
	 System.out.println("The triplets are :");
	 


	for(i=0;i<(arr.length)-1;i++)
	{
		for(j=i+1;j<(arr.length);j++)
		{
			for(k=j+1;k<arr.length;k++)
			{
			

				if(arr[i]+arr[j]==arr[k])
				{
					System.out.println("<"+arr[i]+" ,"+arr[j]+", "+arr[k]+">");
					
					}
				
				
				}
			k--;
			
			}
			
	}

}
}
