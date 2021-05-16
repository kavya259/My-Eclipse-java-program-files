package ticket;

import java.util.Scanner;


public class Testticket {

	//main method
		public static  void main(String[] args)
		{
			int n;
			System.out.println("Enter number of records ");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int option;

			
			Ticket[] t=new Ticket[n];
			Ticket t1=new Ticket();
			 for (int i = 0; i < n; i++)
		      {
		          t[i]=new Ticket();
		      }
		   

			do {
				System.out.println("enter your option ");
				System.out.println("1.add details of customers \n2.Book a bus ticket\t 3.Display \t4.exit\t");
				option=sc.nextInt();

			switch(option)
			{
			case 1:t1.addDetails(t,n);
				break;
			case 2:t1.bookTicket(t,n);
				break;
			case 3:{System.out.println("select the display method: 1.based on Id \t 2.based on citynames 3.sort names ");
			
			int op;	
			op=sc.nextInt();
			do {
			switch(op)
			{
			case 1:t1.displayId(t,n);
				break;
			case 2:t1.displayCity(t,n);
				break;
			case 3:t1.displayName(t,n);
				break;
				default:
					break;
				
			}}while(op<4);
			}
			
		
			case 4:t1.Exit();
				break;
				default :
					break;
			}
			}while(option!=4);
			
	}


}
