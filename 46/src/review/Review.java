package review;
import java.util.Scanner;
public class Review {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("enter the string ");
		str=s.nextLine();
		tochangeCase(str);
		toSort(str);
		System.out.println(toSort(str));
		String k=str;
		binarySearch(k);
	}
	
	public static void tochangeCase(String st)
	{
		String r="";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='a' && st.charAt(i)<='z')
			{
				r=r+(char)((int)st.charAt(i)-32);
				
			}
			else if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				r=r+(char)((int)st.charAt(i)+32);
				
			}
		
		}
		
			System.out.println(r);
		
		
	}
	
	public static String toSort(String s)
	{
		char t;
		String res="";
		String h="";
		char[] c=s.toCharArray();
		for(int j=0;j<c.length;j++)
		{
			for(int k=j+1;k<c.length;k++)
			{
			if(c[j]>c[k])
			{
				t=c[j];
				c[j]=c[k];
				c[k]=t;
				
				}
			}
					
		}
		for(int j=0;j<c.length;j++)
		{
			 res=res+c[j];
		}

		
	return res;	
		
		
	}
	public static void binarySearch(String b)
	{
		char srch;
		int low=0;
		int high=b.length()-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be searched : ");
		srch=sc.next().charAt(0);
		
					int mid=(low+high)/2;
					
			if((srch)==(b.charAt(mid)))
			{
				System.out.println("element found");
				
			}
			if(srch>b.charAt(mid))
			{
				low=mid+1;
			}
			if(srch<b.charAt(mid))
			{
				high=mid-1;
			}
		
				System.out.println("element not found");
			
	}
	
	}
