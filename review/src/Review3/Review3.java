package Review3;
import java.util.Scanner;
public class Review3 {

	public static void main(String[] args) {
		String str;
		System.out.println("enter a sring ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int a=0;
		int res=0;
	//	res=res*10+((int)str.charAt(i)-48);100
		//int l=Integer.parseInt(str);
	/*	int k=Integer.valueOf(str);
		System.out.println(k);
		System.out.println(l);*/
		toSort(str);
		System.out.println(toSort(str));
		int b=0;
		int end=str.length();
		
		
		binarySearch(str,b,end);

	}
	
	public static String toSort(String str)
	{
		char[] c=new char[str.length()];
		String s="";
		for(int i=0;i<str.length();i++)
		{
			c[i]=str.charAt(i);
			
		}
		for(int j=1;j<c.length;j++)
		{
			char t=c[j];
			int k;
			k=j;
			while(k>0 && c[k-1]>t)
			{
				c[k]=c[k-1];
				k--;
				}
			c[j]=t;
		}
		for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]+"");
			s=s+c[i];
		}
		
		return s;
	}
	
	public static  void binarySearch(String st,int start,int end)
	{
		int mid;
		int b=start;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character to be searched");
		char c=s.next().charAt(0);
			mid=(b+end)/2;
			while(b<end)
			{
			if(st.charAt(mid)==c)
			{
				System.out.println("character"+c+"found at position "+" "+mid+1);
			}
			 if(st.charAt(mid)<c)
			{
				end=mid+1;
				//binarySearch(st,b,end);
			}
			 if(st.charAt(mid)>c)
			{
				b=mid-1;
				//binarySearch(st,b,end);
			}
			
				System.out.println("character not found");
				

			
		
		}
	}
	}


