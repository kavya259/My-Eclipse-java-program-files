package initialscomptng;
import java.util.Scanner;
public class Initials {


public static void main(String [] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter your full name :");
	String fname=sc.next();
	fname=fname;
	char[] c;
	int i;
	String initials;
	
	int len=fname.length();
	if(len>=3)
	{
		initials=fname.substring(0,3);
		System.out.println(toUppercase(initials));
	}
}

private static char toUppercase(String initials) {
	///char a[]=initials.toCharArray();
	char c=0;
	for(int i=0;i<initials.length();i++)
	{
		c=initials.charAt(i);
		
			if(c>='a' && c<='z')
			{
		
				c=(char)((int)c-(32));
		
		}
			
			
		
		System.out.print(c);
	}
	
return(' ');
	
}
}
	
	/*int pos=fname.lastIndexOf(' ');
	for( i=0;i<pos;i++)
	{
		if(fname.charAt(i)==' ')
		{
			initials=fname.substring(0, 2);
	
	c=new char[3];
	c=initials.toCharArray();
	
		
		for( i=0;i<=c.length;i++)
		{
			c[i]=(char)(c[i]-32);
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
			
		}
	}
	
}*/

