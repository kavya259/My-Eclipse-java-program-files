package subsetsum49;

import java.util.Scanner;
public class Subsetsum {
	int n;
	int i;
	int sum;
	
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

public static void printSubset(int arr[],int sum)
{
	int i,j,k,start,end,defsum=0;
	 System.out.println("The subsets are :");
	 
start=0;
end=0;

while(end<arr.length)
{
	defsum=defsum+arr[end];
	if(defsum==sum)
	{
		for(i=start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	while(defsum>sum && start<=end)
	{
		defsum=defsum-arr[start++];
		if(defsum==sum)
		{
			for(i=start;i<=end;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}
	
	
	System.out.println();
	end++;
	
			}
}
}

	