package ticketbooking46;
import java.util.*;
import java.util.Scanner;

public class Ticketbooking {
	long []ID;
	long mobilenumber[];
	String Name[];
	String Source[];
	String Destination[];
	String DOB[];
	int Date[];
	String time[];
	int Age[];
	String []Address;
	int n;
	Scanner s=new Scanner(System.in);
	
	
	public void addDetails() {
		      
		 //  int n=ID.length;
		   for (int i=0; i<n; i++)
		           {
		               
		               System.out.println("NAME :");
		               Name [i] = s.next();
		               
		               System.out.println("CUSTOMER ID :");
		               ID[i] = s.nextInt();
		               
		               System.out.println("AGE:");
		               Age [i] = s.nextInt();
		             
		               System.out.println("MOBILE NO.:");
		               mobilenumber [i] = s.nextInt();
		               
		               System.out.println("DOB:");
		               DOB[i] = s.next();
		               
		               System.out.println("ADDRESS:");
		               Address [i] = s.next();
		             
		               
		               //System.out.println(" SOURCE CITY:");
		               //Source [i] = s.next();
		            //   System.out.println("DESTINATION CITY :");
		              // Destination [i] = s.next();
		               //System.out.println(" DATE:");
		               //Date [i] = s.next();
		             //  System.out.println(" TIME:");
		               //time [i] = s.next();


		           } System.out.println("NAME \t CUSTOMER ID\tAGE\t MOBILE NO.\tDOB \tADDRESS");
		           for (int i=0; i<n; i++)
		                   {
		                       System.out.println(Name[i]+"\t" + ID[i]+"\t" + Age[i]+"\t"+mobilenumber[i]+"\t"+DOB[i]+"\t"+Address[i]);
		                   }		
		
	}
	
	
	//method for printing date
	
	
	public void date(int a,int m) {
		if(a<=31)
		{
			switch(a)
			{
			case 30:
				{switch(m)
					{
				
			    case 2:
				System.out.println("wrong date ,as month = "+ m+" has only 28 days");}
			}
			case 31:{
				switch(m)
				{
				case 2:
					System.out.println("wrong date, month = "+ m+" has only 28 days");
				case 4:
				case 6:
				case 9:
				case 11:{
					System.out.println("wrong date,this month "+m+" has only 30 days");
				}
				}
			}
			default: System.out.println(a);
			
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	//method for printing date
	public int month(int m)
	{
		if(m<=12)
	      return m; 
		else {
			System.out.println("month cannot be more than 12,try again");
			bookTicket();
			return 0;
			}
	}
	
	//method for printing year
	public int year(int yr)
	{
		if(yr>1900)
		return yr;	
		else 
			{System.out.println("invalid year");
			return 0;}
			
	}
	
	
	//to book ticket
	
	int traveldate[]=new int[n];
	int travelmonth[]=new int[n];
	int travelyear[]=new int[n];
String sourcecity[]=new String[n];
String destinationcity[]=new String[n];

//method for ticket booking

	public void bookTicket() {
		int n=ID.length;
	
		//checking if source and destination are equal
		for(int i=0;i<ID.length;i++) {
		System.out.println("Enter your current city :");
        Source[i] = s.next();
		System.out.println("Enter your destination city :");
		Destination[i]=s.next();
        if(Source[i].equals(Destination[i]))
        {
        	System.out.println("Source and destination cannot be same, enter your source and desination again : ");
            bookTicket();

        	}
        else {
        	sourcecity[i]=Source[i];
        	destinationcity[i]=Destination[i];
        	System.out.print(Source[i]+"\t"+Destination[i]+"\t");//for display sourcecity[i]
        	                                                               // destinationcity[i]
        	
        }
        
        
		}
		
		//following date guidelines
		int pd[]=new int[n];
		int pm[]=new int[n];
		int py[]=new int[n];

		int pyr=0;
		int pmn=0;
		int pdt=0;
		int td[]=new int[n];
		int tm[]=new int[n];
		int ty[]=new int[n];
		int tdt=0;
		int tmn=0;
		int tyr=0;
		//int traveldate[]=new int[n];
		//int travelmonth[]=new int[n];
		//int travelyear[]=new int[n];


		String t;
		for(int i=0;i<n;i++) {
		
		
		System.out.println("enter present date" );
		pdt=s.nextInt();
		System.out.println("enter present month" );

		pmn=s.nextInt();
		pm[i]=month(pmn);
		date(pdt,pmn);
		System.out.println("enter present year" );

		pyr=s.nextInt();
		py[i]=year(pyr);

		
		
		System.out.println("enter travel date" );
		tdt=s.nextInt();
		System.out.println("enter travel month" );

		tmn=s.nextInt();
		tm[i]=month(tmn);
		date(pdt,pmn);
		System.out.println("enter travel year" );

		tyr=s.nextInt();
		ty[i]=year(tyr);

		
		if(ty[i]>=py[i])
		{
			if(tm[i]-pm[i]<=1)
			{
				if(td[i]>=(pd[i]+1))
				{
					travelyear[i]=td[i];        //use to display
					travelmonth[i]=tm[i];
					traveldate[i]=ty[i];
					
				}
			}
			}
		else 
		{ System.out.println("The travel date must be atleast one day away and less than one month from booking date");
		bookTicket();
		
		}
		
		
		
		System.out.println("enter time : ");
		t=s.next();
		time[i]=travelTime(t);//display this time
		
		
		}
		
		
		}
	
	
	String m;

		//method for time
	public String travelTime(String t) {
		int hh,min;
		hh=s.nextInt();
		min=s.nextInt();
		if(hh>0 && hh<=12 && min<59)
		{
		System.out.print("enter travel hour and minutes");
		System.out.println("am or pm ?");
 m=s.next();
		t=hh+":"+min+""+m;
		
		return t;
		}
		else {
			System.out.println("valid time not given ");
			
			return  " ";
			}
	}

      
       //  displaying customers
       public void displayCustomers() {
    	   
    	  
    	   System.out.println("........customer list...........");
    	   System.out.println(" CUSTOMER ID \t SOURCE CITY \t DESTINATION \t  TRAVEL DATE \t TRAVEL TIME\t");

         for(int i=0;i<=n;i++) {
        	 System.out.println(ID[i]+"\t"+sourcecity[i]+"\t"+destinationcity[i]+"\t"+traveldate[i]+"/"+travelmonth[i]+travelyear[i]+"\t"+time[i]+"\t");
         }
         
         
		
       }
       public static void Exit() {
    	   switch(1) {case 1:
    	   break;}
       }
		
	
	public static void main(String[] args) {
		Ticketbooking t=new Ticketbooking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers to book ticket per day");
		int n;
		n=sc.nextInt();
		t.Name=new String[n];
		t.ID=new long[n];
		t.mobilenumber=new long[n];
		t.Source=new String[n];
		t.Destination=new String[n];
		t.Date=new int[n];
		t.time=new String[n];
		t.Age=new int[n];
		t.DOB=new String[n];
		
		System.out.println(".................Categories...............");
		System.out.println("Choose 1 : Add customer details\n 2 : Book a ticket\n 3 : Display Customers\n 4: Exit\t");
		int option;
		 option=sc.nextInt();

	do {
			switch(option) 
			{
			case 1: {t.addDetails();
			}
			
			
			case 2: {
				System.out.println("enter your customer id :");
				int cusid=sc.nextInt();
				System.out.println("enter your mobile number :");
				int custmobno=sc.nextInt();
				for(int i=0;i<=n;i++) {
			
					if(cusid==t.ID[i] && custmobno==t.mobilenumber[i]) {
						t.bookTicket();
					
					
				}
					else {
						System.out.println("your credentials are invalid");
						break;
					}
					
				}
			}
			

			case 3:t.displayCustomers();
			case 4: Exit();

			
			}
			
		}while(option<5);

		
		
	}
	

	
	
	
	
	
	
}
	


