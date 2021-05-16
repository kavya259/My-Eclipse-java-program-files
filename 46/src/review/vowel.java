package review;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the string /n");
		str=sc.nextLine();
		System.out.println();
		String k=takeVowel(str);
		System.out.println("vowel string is :\n"+ k);
		System.out.println();
		String v="";
		/*for(int x=0;x<k.length();x++)
		{
			while(k.charAt(x)!=' ')
			{
				v=v+k.charAt(x);
			}
		}
		System.out.println(" Vowel string without spaces \n"+ v);


	/*String v="";
	char []ch=new char[k.length()];
		for(int i=0;i<k.length();i++)
		{
			ch[i]=k.charAt(i);
			
		}
		int n=0;
		for(int j=0;j<ch.length;++j)
		{
			if(ch[j]!=' ')
			{
System.out.print(ch[j]);				
			}
			else
				{
				ch[j]=ch[j+1];
				}
		}
	//	for(int j=0;j<ch.length;++j)
		//{
		//System.out.print(ch[j]);
		//}
		//char s='\0';
		/*for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{

				v=v+k.charAt(i);			}
			else
			{}
			
		}*/


		k.replaceAll("\0","").trim();
		System.out.println(" Vowel string without spaces \n"+ k);
		System.out.println();
		String r=reverseString(k).replace("\0","").trim();
		System.out.println("reverse string is \n"+ r);

	}
	public static String takeVowel(String s)
	{
		char[] c=new char[s.length()];
		String k= "";
		String res="";
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
		{
			c[i]=s.charAt(i);
			
		}
		}
		for(int j=0;j<c.length;j++)
		{
			 res=res+c[j];
		}
		return res;
		
	}
	public static String reverseString(String str)
	{
		String rev="";
		for(int f=str.length()-1;f>=0;f--)
		{
			rev=rev+str.charAt(f);
		}
		return rev;
	}
}
