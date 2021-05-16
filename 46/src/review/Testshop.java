package review;
import java.util.Scanner;
public class Testshop {

	public static void main(String [] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of customers");
		n=s.nextInt();
		int option;
		Cake c=new Cake();
		Cake C[]=new Cake[n];
		
		for(int i=0;i<n;i++)
		{
			C[i]=new Cake();
		}
		do {
			System.out.println("check out the menu ,select any option");
			System.out.println("1.Add details \t 2.Display \t 3.Search based on id");
			 option=s.nextInt();
			
			switch(option)
			{
			case 1:
			c.addDetails(C,n);
			break;
			case 2:System.out.println();
				c.displayHighest(C,n);
				break;
			case 3:
				System.out.println();
				c.searchId(C, n);
			    break;
			case 4:break;
			default :System.out.println("wrong option");
			break;
			}
		}while(option!=4);
		
		
		
	}
	
	
}
