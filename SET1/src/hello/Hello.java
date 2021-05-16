package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args)
	{
		String str;
		System.out.println("enter any name : ");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		System.out.println("Hello, "+str+"!");
		
	}

}
