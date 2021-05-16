package Binarysearch;
import java.util.Scanner;

public class Binarysearch {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		int arr[];
		Binarysearch b=new Binarysearch();
		System.out.println("enter the size of the array : ");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("enter the elements in the array in ascending order  : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element;
		System.out.println("enter the element to be searched ");
		element =sc.nextInt();
		boolean result;
		result= findElement(arr,element);
		System.out.println(result);
		
		//strings

		String tmp;
		int i;
		int j;
		int m;
		String srch;
		//String sorted=" ";
		System.out.println("enter the size of the string array ");
		int n1=sc.nextInt();
		String str[]=new String[n1];
		System.out.println("enter the strings   ");

		for( i=0;i<n1;i++)
		{
			str[i]=sc.nextLine();
		
		System.out.println(str[i] );
		}

		// to sort
		/* System.out.println("sorted :");
		for( i=0;i<n1;i++)
		{
			//int flag=0;
			for(j=0;j<n1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					tmp=str[j];
					str[j]=str[j+1];
					str[j+1]=tmp;
					
				}
				else if(str[j].compareTo(str[j+1])<0)
				{
					break;
				}
			}
		//	if(flag==0)
			//{
				//break;
			//}
			System.out.println(str[j]+",");
		}*/
		System.out.println("enter the string to search :");
		srch=sc.nextLine();
		boolean resu;
		resu=findString(str,srch);
		System.out.println(result);
	}

	public  static boolean findElement(int arr[],int key)
	{
		int k=key;
		int f=0;
		int count=0;
		int l=arr.length-1;
		int mid;
		mid=(f+l)/2;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[mid]==k)
		{
			count++;
			return true;
			
		}
		else if(arr[mid]<k)
		{
			f=mid+1;
		}
		else if(arr[mid]>k)
		{
			l=mid-1;
		}
		}
		if(count>0)
		{
			return true;
			
		}
	return	false;
	}
	
	
	public static boolean findString(String str[],String name)
	{
	/*	String tmp;
		int i;
		int j;
		
		//String sorted=" ";
		System.out.println("enter the size of the string array ");
		int n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("enter the strings   ");

		for( i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		System.out.print(str[i]+" ," );

		// to sort
		System.out.println("sortted :");
		for( i=0;i<n;i++)
		{
			int flag=0;
			for(j=0;j<n;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					tmp=str[j];
					str[j]=str[j+1];
					str[j+1]=tmp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
			System.out.println(str[j]+",");
		}
		*/
		int m,low=0,high=str.length-1;
		while(low<=high)
		{
			m=(low+high)/2;
			int res=name.compareTo(str[m]);
			if(res==0)
			{
				return true;
			}
			else if(res<0)
			{
				low=m+1;
			}
			else if(res>0)
			{
				high=m-1;
			}
		}
		return false;
		
		
	}
}
