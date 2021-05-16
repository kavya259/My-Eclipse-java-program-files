package consecutivecharacters;
import java.util.Scanner;
public class Consecutivecharacters {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
        System.out.println("enter  string : ");
        String s="";
        String str=sc.nextLine();
        System.out.println("same case letters :");
      for(int i=0;i<str.length();i++)
        {
        	 ch=str.charAt(i);
     
        	if(ch>64 && ch<91)
        	{
        		s+=(char)(ch+32); //to convert all letters to lower case 
        	}
        	else
        	{
        		s+=(char)ch;
        	}
        	
        	
        }
      
    		System.out.println(s);   
    		printConsecutiveCharacters(s);
    
	}
	
	public static void printConsecutiveCharacters(String s1)
	{
		String s2="";
		String temp;
		int i,k=0;
		int count;
		
		for(i=1;i<(s1.length())-1;i++)
		{
			if(s1.charAt(i+1)-s1.charAt(i)==1)
			{
				System.out.println("consecutive are  " +s1.charAt(i)+s1.charAt(i+1));
				count=1;
				s2=s2+s1.charAt(i)+s1.charAt(i+1);
				temp=s2;
				//int g1=s1.indexOf(i+1);
				//int g2=s1.indexOf(i+2);

				for(k=i;k<s1.length();k++)
				{
					if(s1.substring(i,i+1)==s2)
							{
						count++;
						
							}
					
					
				
				}
				System.out.println(temp+""+count);
				
			}
		}
		
	}

}
