package searchelement;
import java.util.Scanner;
public class Search {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{

	int arr[];
	System.out.println("enter the size of the array : ");
	int n=sc.nextInt();
	arr=new int[n];
	System.out.print("enter the elements in the array : ");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int element;
	System.out.println("enter the element to be searched ");
	element =sc.nextInt();
	
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==element)
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("true");
	}
	else System.out.println("false");
	}

	
	

}
