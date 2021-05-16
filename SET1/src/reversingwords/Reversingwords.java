package reversingwords;
import java.util.Scanner;

public class Reversingwords {
	
static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{ 
		System.out.println("enter the string ");
		String snt=sc.nextLine();
		
      reverseWords(snt+" ");
		
		
	}

	public static void reverseWords(String str)
	{
		int i,j,k;
		String s;
		String rev="";
		String word=str.substring(0,str.indexOf(" "));
		int index=str.length()-1;
		
		while(index>=0)
		{
		reverseword(word);

			str=str.substring(str.indexOf(" ")+1)+" ";
			 word=str.substring(0,str.indexOf(" "));

			index--;
		}
	}
	public static String reverseword(String s)
	{
		String rev="";
		String spl="";

		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z' )||(s.charAt(i)>='A' && s.charAt(i)<='Z' ) )
			{
				rev=rev+s.charAt(i);
			
			}
			else
			{
				rev=rev+s.charAt(s.length()-i-1);
			}
			
			}
		
		
		System.out.print((rev+" "));

		rev=rev+" ";

		return rev;
		}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		