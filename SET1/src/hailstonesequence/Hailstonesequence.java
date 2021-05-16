package hailstonesequence;

import java.util.Scanner;

public class Hailstonesequence {
	public static void main(String[] args) {
		int num;
		int count=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to get the hailstone sequence : ");
		num = s.nextInt();
	
		while( num>1) {
			 count++;
			
		if(num%2==0)
		{	
		System.out.println(num+ " is even, so i take half of it : " + num/2);
		num = num/2;
		}
		else
		{	System.out.println(num+ " is odd, so i make (3*num+1) : " + ((3*num)+1));
			num =(3*num)+1;	
			}
		}
	System.out.println(" There are total "+ count+" steps to reach 1");
	
	}
	
}

	
	

