package capreview;

import java.util.Scanner;

public class SearchString {
	public static void main(String[] args)
	{
		String array1[];
		String array2[];

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the size of first array of string ");
		int size1=s.nextInt();
		array1=new String[size1+1];
		System.out.println("Enter array of strings in first array");

		for(int i=0;i<array1.length;i++)
		{

			array1[i]=s.nextLine();
			
		}
		
		
		System.out.println("Enter the size of Second array of string ");
		int size2=s.nextInt();		
		 array2=new String[size2+1];
		System.out.println("Enter array of strings in Second array");


		for(int i=0;i<array2.length;i++)
		{

			array2[i]=s.nextLine();
		}

		searchString(array2,array1);
		s.close();
		
	}
	
	public static void searchString(String a2[],String a1[])
	{
		
			for(int i=0;i<a2.length;i++)
			{
				int wordcount=countRepeat(a2[i],a1);
				if(wordcount!=0)
				{
					System.out.println(a2[i]+"  count is "+wordcount);
				}
					
							
				
			}
		
			
		
	}
	public static int countRepeat(String stringa2,String a1[])
	{
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
		if(stringa2.equals(a1[i]))
		{
			count++;
			
		}
		}
		
		return count;
		
	}
	
	



}
