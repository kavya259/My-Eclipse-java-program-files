package session2;

import java.util.Scanner;
public class Replaceword {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the String with two words");
		str=sc.nextLine();
		str = str;

		checkTwo(str);
	}
	public static void checkTwo(String s)
	{
		int c=0;
		int l1;
		String w1="";
		String w2="";
		String rep1="";
		String rep2="";

		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c++;
			}

				if(c>2)
				{
					System.out.println("give only two word in a string");
					}
				else
				{
					w1=w1+s.substring(s.indexOf(0,s.indexOf(" ")));
					l1=w1.length();
					w2=w2+s.substring(s.lastIndexOf(" "));

							
				}
				}
		System.out.println("first word replacing ");
		for(int i=w1.length()-2;i>=0;i--)
		{
			rep1=rep1+w1.charAt(i);
		}

		rep1=w1.charAt(0)+rep1+w1.charAt(w1.length()-1);
		System.out.println(rep1);
		
		
		System.out.println("Secong word replacing ");
		for(int i=w2.length()-2;i>=0;i--)
		{
			rep2=rep2+w2.charAt(i);
		}

		rep2=w2.charAt(0)+rep2+w2.charAt(w2.length()-1);
		System.out.println(rep1);

		System.out.println("Final  replaced string is \n :"+rep1+" "+rep2);
		
		
	}
	}