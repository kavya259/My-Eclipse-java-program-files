package primenumbersinagivenrange;

import java.util.Scanner;

public class Primenumbersinagivenrange {
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter starting number :");
		a=s.nextInt();
		System.out.println("enter last  number :");
		b=s.nextInt();
		System.out.println("Prime numbers in the range "+a+" and "+b+"  are :");
		Primenumbers(a,b);

	}
	public static void Primenumbers(int x,int y) {
		int num;
	
		int j;
		
		for(num=x;num<=y;num++)
		{		int count=0;

			for(j=1;j<=y;j++)
			{		

				if(num%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.print(num+" ,");
				
			}
			}
	
		
		}
		
		


}
