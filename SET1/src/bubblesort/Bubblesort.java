package bubblesort;
import java.util.Scanner;
public class Bubblesort {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		 int[] arr;
	        int i;
	        System.out.println("enter the size of array of strings ");
	        int n = sc.nextInt(); 
	        System.out.println("enter the elements in array of strings ");
	        arr=new int[n];
	        for(i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	      
		doBubblesort(arr,n);
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
	    
	  
		 System.out.println("sorted array is : ");

		 for(int k=0;k<n;k++)
		 {
			 System.out.print(arr[k]+" ");

		 }

		 
		 
	}
	

}
