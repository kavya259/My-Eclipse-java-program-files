package session2;

import java.util.Scanner;

public class Specialcharacters {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the String ");
		str=sc.nextLine();
		str = str + " ";

		String rep="";
		System.out.println("Modified string ");

		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);


			if(!((str.charAt(i)>='a' && str.charAt(i)<'z')||(str.charAt(i)>='A' && str.charAt(i)<'Z')||(str.charAt(i)>='0' && str.charAt(i)<'9')||str.charAt(i)==' '))
					{

				c='*';
				rep=rep+c;				
					}
			else
			{
				rep=rep+c;
			}
		}
		System.out.println(rep);
	}
}
