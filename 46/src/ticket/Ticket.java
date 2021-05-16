package ticket;
import java.util.Scanner;

public class Ticket {
	private String cusid;
	private  String mno;
	private String Name;
	private  String Source; 
	private String Des;
	private String DOB;
	private String Date;
	private String traveltime;
	private String traveldate;
	private int Age;
	private String Address;
	int n;

	
	
	public Ticket()
	{
				
	}

	public Ticket(String cusid,String Name,String  mno,String Source,String Des,String DOB,String traveltime,int Age,String Address,String traveldate,int n) {
		this.cusid=cusid;
		this.mno=mno;
		this.Name=Name;
		this.Source=Source;
		this.Des=Des;
		this.DOB=DOB;
		//this.Date=Date;
		this.traveltime=traveltime;	
		this.Age=Age;
		this.Address=Address;
		this.traveldate=traveldate;

		this.n=n;	
			}
	
	public Ticket(String cusid,String Name,String mno,String DOB,String Address) {
		this.cusid=cusid;
		this.mno=mno;
		this.Name=Name;
		this.DOB=DOB;
		this.Address=Address;
	
			}
	
	//setting and getting id
	public  void  setId()
	{
		Scanner k=new Scanner(System.in);
		System.out.println("enter the customer id ");
		String id=k.nextLine();
		for(int i=0;i<id.length();i++)
		{
			if(id.charAt(i)>='0' && id.charAt(i)<='9' )
			{}
			else {
				System.out.println("your id must only contain a numbers");
				setId();
			}
		}
		cusid=id;
	}
	
	
	public   String getId()
	{
		return cusid;
	}
	
	
	//setting and getting mobile number
	public  void  setmno()
	{
		 Scanner f=new Scanner(System.in);

		System.out.println("enter the customer mobile number");
		String mbno=f.nextLine();
		if(mbno.length()==10)
		{
		for(int k=0;k<mbno.length();k++)
		{
		if((mbno.charAt(k)>='0' && mbno.charAt(k)<='9'))
		{
		}
		else
		{
			System.out.println("name must contain only letters");
			setmno();
		}
		}
		}
		else
		{
			System.out.println("mobile number must have 10 digits ");
			setmno();
		}
		
		
		mno=mbno;
	}
	
	public  String getmno()
	{
		return mno;
	}
	
	
	
	
	//setting and getting name
	
	public  void  setName()
	{
		 Scanner f=new Scanner(System.in);

		System.out.println("enter the customer name ");
		String  name=f.nextLine();
		for(int j=0;j<name.length();j++)
		{
		if((name.charAt(j)>='a' && name.charAt(j)<='z')||(name.charAt(j)>='A' && name.charAt(j)<='Z'))
		{
		}
		else
		{
			System.out.println("name must contain only letters");
			setName();
		}
		}
		Name=name;
	}
	
	public  String getName()
	{
		return Name;
	}
	
	
	
	
	
	
	
	public   void  setSource(String sour)
	{
		this.Source=sour;
	}
	
	public String getSource()
	{
		return Source;
	}

	
	
	public  void  setDes(String dest)
	{
		this.Des=dest;
	}
	
	public  String getDes()
	{
		return Des;
	}
	
	
	//setting and getting date of birth of the customer
	public   void  setDOB()
	{
		 Scanner f=new Scanner(System.in);

		String DOB="";
		System.out.println("enter the Date of birth of the customer  ");
		int yr,mon,dt;
		System.out.println(" enter year ");
		yr=f.nextInt();
		System.out.println(" enter month ");
		mon=f.nextInt();
		System.out.println(" enter date ");
		dt=f.nextInt();
		checkDate(yr,mon,dt);
		DOB=DOB+yr+"/"+mon+"/"+dt;
		this.DOB=DOB;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	//setting and getting age
	public  void  setAge()
	{
		 Scanner f=new Scanner(System.in);

		System.out.println("enter the age of the customer  ");
		int age=f.nextInt();
		Age=age;
	}
	
	public  int getAge()
	{
		return Age;
	}
	
	//setting and getting address
	public  void  setAddress()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Address of the customer Starting with city name ");
		String add=sc.nextLine();
		String s="";
		for(int i=0;i<add.length();i++)
		{
		if(add.charAt(0)>='a' && add.charAt(0)<='z')
		{
			s=s+(char)((int)add.charAt(i)-32);

		}
		else
		{
			s=s+add.charAt(i);
		}
		}
		Address=s;
		//System.out.println(s);
	}
	
	public  String getAddress()
	{
		return Address;
	}
	
	//setting and getting  time
	public  void  settravelTime()
	{
		String tm="";
		 Scanner f=new Scanner(System.in);

		System.out.println("enter the time in hr:min am/pm in 12 hour format ");
		System.out.println("enter the travel hour ");

		int hr=f.nextInt();
		System.out.println("enter the minutes ");
		int min=f.nextInt();
		if(hr>=1 && hr<=12 )
		{
			if(min>=0 && min<=45)
			{
		tm=tm+hr+":"+min;
			}
			else
			{
				System.out.println("minutes must be between 0 to 45");
			}
		}
		else
		{
			System.out.println("hour must be between 1 to 12");
		}
		traveltime=tm;
	}
	
	public  String gettravelTime()
	{
		return traveltime;
	}
	
	
	
	
	
	//date conditions
	public  void checkDate(int year,int month,int date)
	{
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap==true)
	    {
	    	if(month<=12)
			{
				switch(month)
				{
				
				    case 2:
				    	if(date<=29)
				    	{
				    		date=date;
				    		month=month;
				    	}
				    	else
				    	{
					System.out.println("wrong date ,as month = "+ month+" has  29 days");
					checkDate(year,month,date);
}
				
			
					case 4:
					case 6:
					case 9:
					case 11:{
						if(date>30)
						{
						System.out.println("wrong date,this month "+month+" has only 30 days");
						checkDate(year,month,date);

					}
						else
						{
							date=date;
				    		month=month;
				    	
							
						}
					}
				
				default: 
					{if(date>31)
					{
						System.out.println("A month has maximum of 31days ");
						checkDate(year,month,date);

					}
					else
					{
						date=date;
			    		month=month;
			    	
						
					}
					}
			
	    }
	    }
	    
	    else
	    {
	    	if(month<=12)
			{
				switch(month)
				{
				
				    case 2:
				    	if(date<=28)
				    	{
				    		date=date;
				    		month=month;
				    	}
				    	else
				    	{
					System.out.println("wrong date ,as month = "+ month+" has  28 days");
					checkDate(year,month,date);
}
				
			
					case 4:
					case 6:
					case 9:
					case 11:{
						if(date>30)
						{
						System.out.println("wrong date,this month "+month+" has only 30 days");
						checkDate(year,month,date);

					}
						else
						{
							date=date;
				    		month=month;
				    	
							
						}
					}
				
				default : 
					{if(date>31)
					{
						System.out.println("A month has maximum of 31days ");
						checkDate(year,month,date);
					}
					else
					{
						date=date;
			    		month=month;
			    	
						
					}
					}
				}
			}
	    }
	    }
		
		
		
	}
	//setting up travel date
	public  void settravelDate(int n,int ty,int tm,int td)
	{
		 Scanner f=new Scanner(System.in);

		int py,pm,pd;
		System.out.println("enter present date,month and year");
		System.out.println("enter present  year :");
		py=f.nextInt();
		System.out.println("enter present  month :");
		pm=f.nextInt();
		System.out.println("enter prsent date :");
		pd=f.nextInt();
		checkDate(py,pm,pd);
		checkDate(ty,tm,td);
		
		

		if(ty>=py)
		{
			if(tm-pm<=1)
			{
				if(td>=pd+1)
				{
					
				System.out.println("The dates are OK");
					ty=ty;
					td=td;
					tm=tm;
				}
			}
			}
		else 
		{ 
			System.out.println("The travel date must be atleast one day away and less than one month from booking date, please try from the start");
				}
		
		
	}
  public  String	getTraveldate(int ty,int tm,int td)
	{
		return ty+"/"+tm+"/"+td;
	}
	
  
  
	//method to add customer details                                                               	//method to add customer details

	public void addDetails(Ticket tadd[],int n)
	{
		Ticket a=new Ticket();
		System.out.println();
		//t[0]=new Ticket("1000","krishna","867657585","10/9/1998","Mumbai");
		//t[1]=new Ticket("1001","krish","9867348246","14/1/1998","Hyderabad");
		//t[2]=new Ticket("1002","radha","9867548246","10/9/1995","Chennai");
		int f;
		for( f=0;f<n;f++)
		{
		a.setId();		a.setName();		a.setmno();		a.setDOB();		a.setAddress();
		

		
		tadd[f]=new Ticket(a.getId(),a.getName(),a.getmno(),a.getDOB(),a.getAddress());
		}
		
		System.out.println("CUSTOMER ID \t CUSTOMER NAME \t MOBILE NUMBER \t DOB \t ADDRESS \t ");
		for( f=0;f<n;f++)
		{

		System.out.println(	tadd[f].getId()+"\t"+ tadd[f].getName()+"\t"+ tadd[f].getmno()+"\t"+ 	tadd[f].getDOB()+"\t"+ tadd[f].getAddress()+"\t");
	
	}
	/*	System.out.println("enter your option ");
		System.out.println("1.add details of customers \n2.Book a bus ticket\t 3.Display \t4.exit\t");
		int option;
		Scanner sc=new Scanner(System.in);
		option=sc.nextInt();
		

		//Ticket[] t=new Ticket[n];
		Ticket t1=new Ticket();

		do {
		switch(option)
		{
		case 1:t1.addDetails(n+1);
			break;
		case 2:t1.bookTicket(n);
			break;
		case 3:{System.out.println("select the display method: 1.based on Id \t 2.based on citynames 3.sort names  ");
		
		int op;	
		op=sc.nextInt();
		do {
		switch(op)
		{
		case 1:t1.displayId(n);
			break;
		case 2:t1.displayCity(n);
			break;
		case 3:t1.displayName(n);
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
		}while(option!=4);*/
		
		
}


		
		
		
		
		
		
		
			
	
	
	
	public  void bookTicket(Ticket tic1[],int n)
	{
		 Scanner f=new Scanner(System.in);

		String idno,mob;
		System.out.println("enter your customer id ");
		idno=f.nextLine();
		System.out.println("enter your mobile number ");
		mob=f.nextLine();
		Ticket tic=new Ticket();
		Ticket book1[]=new Ticket[n];



		for(int i=0;i<n;i++)
		{
		if(idno==tic1[i].cusid)
		{
			if(mob.equals(tic1[i].mno))                                                                                   //id and mobile number check
			{
				Scanner l=new Scanner(System.in);

				String src,des,presentdate,traveldate,traveltime;
				System.out.println(" Enter the source city ");
				src=l.nextLine();
				System.out.println(" Enter the Destination city ");
				des=l.nextLine();
				if(src.equals(des))                                                                                  //source and destination condition
		        {
		        	System.out.println("Source and destination cannot be same, so please try again later  ");

		        	}
		        else {
		        	tic1[i].setSource(src);
		        	tic1[i].setDes(des);	
		        	//calling date and time methods
					Scanner w=new Scanner(System.in);
					int ty,tm,td;
					System.out.println("enter travel date,month and year");
					System.out.println("enter travel year :");
					ty=w.nextInt();
					System.out.println("enter travel  month :");
					tm=w.nextInt();
					System.out.println("enter travel date :");
					td=w.nextInt();
					settravelDate(n,ty,tm,td);
					settravelDate(n,ty,tm,td);

					tic1[i].settravelDate(n,ty,tm,td);	
					settravelDate(n,ty,tm,td);
					tic1[i].getTraveldate(ty,tm,td);

					
					settravelTime();
					tic1[i].settravelTime();
					tic1[i].gettravelTime();
					
				System.out.println("Ticket confirmed ");
				for(int b=0;b<n;b++ )
				{
				Ticket book=new Ticket(tic1[i].getId(),tic1[i].getName(),tic1[i].getmno(),tic1[i].getSource(),tic1[i].getDes(),tic1[i].getDOB(),tic1[i].gettravelTime(),tic1[i].getAge(),tic1[i].getAddress(),tic1[i].traveldate,tic1[i].n);	
				}

				}
			}
			else
			{
				System.out.println(" can't find mobile number  ,please enter the correct one  ");
				System.out.println(" To enter the correct one press 1 else to add details press 2  ");
				int op;
				Scanner sc=new Scanner(System.in);
				op=sc.nextInt();
				do
				{
				switch(op)
				{

				case 1:tic.bookTicket(tic1,n);
				break;
				case 2:
					n=n+1;
					tic.addDetails(tic1,n);
				break;
				case 3:break;
				}
				}while(op!=3);


				
			}
		}
			else
			{
				System.out.println(" can't find customer id ,please enter the correct one  ");
				System.out.println(" To enter the correct one press 1 else to add details press 2  ");
				int op;
				Scanner sc=new Scanner(System.in);
				op=sc.nextInt();
				do
				{
				switch(op)
				{

				case 1:tic.bookTicket(tic1,n);
				break;
				case 2:
					n=n+1;
					tic.addDetails(tic1,n);
				break;
				case 3:break;
				}
				}while(op!=3);

			}
			
			
					}
		}
		
		
	
	 public  void displayId(Ticket ticket[],int n)
	    {
		 
	    
	        
	        String temp;
	        for (int p = 0; p < n; p++) 
	        {
	            for (int j = p + 1; j < n; j++) { 
	                if ((ticket[p].cusid).compareTo(ticket[j].cusid)>0) 
	                {
	                    temp = ticket[p].cusid;
	                    ticket[p].cusid = ticket[j].cusid;
	                    ticket[j].cusid = temp;
	                }
	            }
	        }
	        System.out.println("ids in Ascending Order: ");
	        System.out.println("customerid \t customer name \t mobilenumber \t source \t destination \t traveldate\t traveltime \t");
	        for (int i = 0; i < n; i++) 
	        {
	        	System.out.println(ticket[i].cusid+"\t"+ticket[i].Name+"\t"+ticket[i].mno+"\t"+ticket[i].Source+"\t"+ticket[i].Des+"\t"+ticket[i].traveldate+"\t"+ticket[i].traveltime);
	        }
	            
	        }
	    
	 public  void displayCity(Ticket ticket[],int n)
	    {
		 
	    
	        
	        String temp;
	        for (int p = 0; p < n; p++) 
	        {
	            for (int j = p + 1; j < n; j++) { 
	                if ((ticket[p].Address).compareTo(ticket[p].Address)>0) 
	                {
	                    temp = ticket[p].Address;
	                    ticket[p].Address = ticket[j].Address;
	                    ticket[j].Address = temp;
	                }
	            }
	        }
	        System.out.println("ids in Ascending Order: ");
	        System.out.println("customerid \t customer name \t mobilenumber \t source \t destination \t traveldate\t traveltime \t");
	        for (int i = 0; i < n; i++) 
	        {
	        	System.out.println(ticket[i].Address+"\t"+ticket[i].cusid+"\t"+ticket[i].Name+"\t"+ticket[i].mno+"\t"+ticket[i].Source+"\t"+ticket[i].Des+"\t"+ticket[i].traveldate+"\t"+ticket[i].traveltime);
	        }
	            
	        }
	    
	 public  void displayName(Ticket ticket[],int n)
	    {
		 
	    
	        
	        String temp;
	        for (int p = 0; p < n; p++) 
	        {
	            for (int j = p + 1; j < n; j++) { 
	                if ((ticket[p].Name).compareTo(ticket[p].Name)>0) 
	                {
	                    temp = ticket[p].Name;
	                    ticket[p].Name = ticket[j].Name;
	                    ticket[j].Name = temp;
	                }
	            }
	        }
	        System.out.println("ids in Ascending Order: ");
	        System.out.println("customerid \t customer name \t mobilenumber \t source \t destination \t traveldate\t traveltime \t");
	        for (int i = 0; i < n; i++) 
	        {
	        	System.out.println(ticket[i].Name+"\t"+ticket[i].cusid+"\t"+ticket[i].mno+"\t"+ticket[i].Source+"\t"+ticket[i].Des+"\t"+ticket[i].traveldate+"\t"+ticket[i].traveltime);
	        }
	            
	        }
	    
	
	   
//exit
public  void Exit()
{
	System.out.println(" Thank you ");
	
	}
	
	
	
	

	
	
	
}


