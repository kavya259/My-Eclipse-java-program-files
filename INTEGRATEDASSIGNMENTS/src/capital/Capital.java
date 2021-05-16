package capital;
import java.util.Scanner;
public class Capital {

	public static void main(String [] args) {
	String str="abc";
	String s="";

	for(int i=0;i<str.length();i++)

{
		if(str.charAt(i)>='a'&& str.charAt(i)<='z')
		{
			s=s+(char)((int)str.charAt(i)-32);
		}
		
}

	System.out.println(s);
	
	}
}
