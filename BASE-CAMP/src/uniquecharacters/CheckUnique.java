package uniquecharacters;
/*
 * 10. Write a method in java to determine if a string has unique characters or not.
 */

public class CheckUnique {

	public static void tocheckUnique(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			
		}
		if(count==0)
		{
			System.out.println("The string has unique characters");
	
		}
		else
		{
			System.out.println("The string does not have unique characters");

		}
	}
}
