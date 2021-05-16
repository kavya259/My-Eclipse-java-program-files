package stringcompression;
import java.util.*;

import java.util.Scanner;

public class Stringcompression {
	
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		//int n;
        ///System.out.println("enter the size of string : ");
        //n=sc.nextInt();
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
    		compressString(s);
     


}
	public static void compressString(String str1)
	{
		int i;
		int count=0;
		char temp=str1.charAt(0);
System.out.println("Compressed string is :");
		for(i=0;i<str1.length();i++)
		{
		if(str1.charAt(i)==temp)
		{
			count++;
		}
		else
		{
			System.out.print(temp+""+count);
			count=1;
			temp=str1.charAt(i);
		}
		}
		System.out.print(temp+""+count);
	}
}