package mirrorcopy;

import java.util.Scanner;

public class MirrorCopy {

	public static void main(String[] args)
	{ 

		 String[] arr;
	        int i;
	   	 Scanner sc=new Scanner(System.in);

	        System.out.println("enter the size of array of strings ");
	        int n = sc.nextInt(); 
	        System.out.println("enter the elements in array of strings ");
	        arr=new String[n];

	        for(i=0;i<n;i++)
	        {
	        	arr[i]=sc.next();
	        }
	        sc.close();

	        printArray(arr,n);
	        mirrorCopy(arr,n);
		
	}
	
	
	public static void printArray(String[] a, int n) {
		System.out.print("Array :[ ");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("] \n");

	}

	
	public static void mirrorCopy(String[] a, int n) {
		int j=0;
		String s="";

		String temp[]=new String[n];
		for (int i = 0; i < n; i++) {
			s="";
			for(j=a[i].length()-1;j>=0;j-- )
			{
				s=s+a[i].charAt(j);
				if(s.length()==a[i].length())
				{
			temp[i]=s;
				}
			}
		}
		String temp1[]=new String[n];

		for (int i = 0; i < n; i++) {
			temp1[i]=a[i]+temp[i];	
			
		}
		System.out.println("Mirror copy array is :");
		System.out.print("[ ");

		for (int i = 0; i < n; i++) {
			System.out.print(temp1[i]+"  ");

		}
		System.out.print("]");

		
		}

		
		
		

			
		
	

		
		
	

	
	
	
	
	}
		
		
		
		
		
		



