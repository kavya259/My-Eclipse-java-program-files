package session2;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the String with two words");
		str=sc.nextLine();
		str = str+" ";

		checkTwo(str);
	}
	public static void checkTwo(String s)
	{
		int maxlength = 0;
		String word = "";
		String large = "";
		//String[] wordlist = new String[a.length()];
		int index = 0;
		int count = 0;
		String words[]=new String [2];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				//word[0]="";
				word = word + s.charAt(i);

			}

			else {
				
				words[count]=word+" ";
				count++;
				word="";

			}
			}
		if(count>2)
		{
			System.out.println("Please give only two words in the string ");
		}
		else
		{System.out.println("words into an array ");
			for(int l=0;l<2;l++)
				
			{
			System.out.print(words[l]);
			}
			

		}
		toReplace(words);

		}
	public static void toReplace(String []s)
	{
		int b=0;
		//String k=s;
		String rep="";
		String res="";
		int i;
		System.out.println("String after replacing all characters except first and last is :");
		System.out.println("string : ");
		for( i=0;i<s.length;i++)
		{
System.out.println(s[i]);

		for( i=0;i<s.length;i++)
		{
System.out.println(s[i]);
System.out.println("after replacing ");

if(s.length==2)
{
		for(int j=1;j<s[i].length();j++)
		{
			rep=rep+s[i].charAt(s[i].length()-i);
			res=res+s[i].charAt(b)+rep+s[i].charAt(s[i].length()-1);

		}
		rep="";
		System.out.println(res);
		}
		
		}
		
	}
	}
}
	
		

