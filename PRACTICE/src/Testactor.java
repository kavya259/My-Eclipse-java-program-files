
import java.util.Scanner;

public class Testactor{

	public static void main(String [] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of actors ");
		n=s.nextInt();
		int option;
		Actor c=new Actor();
		Actor C[]=new Actor[n];
		
		for(int i=0;i<n;i++)
		{
			C[i]=new Actor();
		}
		do {
			System.out.println("check out the menu ,select any option");
			System.out.println("1.Enter details \n 2.Display male actors \n 3.Display actors sorted according to age \\n 4.Display actors whose movie count is more than 10 \n");
			 option=s.nextInt();
			
			switch(option)
			{
			case 1:
			c.addDetails(C,n);
			break;
			case 2:System.out.println();
				c.displayMale(C,n);
				break;
			case 3:
				System.out.println();
				c.sortAge(C, n);
			    break;
			case 4:
				System.out.println();
				c.sortCount(C, n);
			    break;
			
			case 5:break;
			default :System.out.println("wrong option");
			break;
			}
		}while(option!=5);
		
		
		
	}
	
	
}
