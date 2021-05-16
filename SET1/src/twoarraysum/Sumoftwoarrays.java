package twoarraysum;

import java.util.Scanner;

public class Sumoftwoarrays {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number of elements in first array");
		int num1=s.nextInt();
		Double[] arr1=new Double[num1];
		int i;
			System.out.println("Enter the array elements : ");
			for(i=0;i<arr1.length;i++)
			{
				arr1[i]=s.nextDouble();
			}
			
			
			System.out.println("enter the number of elements in Second array");
			int num2=s.nextInt();
			Double[] arr2=new Double[num2];
			int j;
			int sumlength;
			Double sum;
				System.out.println("Enter the array elements : ");
				for(j=0;j<arr2.length;j++)
				{
					arr2[j]=s.nextDouble();
				}
		if(arr1.length>=arr2.length)
		{
			sumlength=arr1.length;
		}
		else
		{
			sumlength=arr2.length;
		}
			System.out.println("sum of the two given arrays : ");
			
				for(int z=0;z<sumlength;z++)
				{
					
					System.out.println( arr1[z]+arr2[z]);
					}
				
			}
}
				
	


