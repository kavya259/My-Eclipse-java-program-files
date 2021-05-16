package review;
import java.util.Scanner;
public class Review {
	private long id;
	private long pno;
	private long sala;
	private String name;
	private String desi;//empl,manager
	//update emp to manager and salary inc to +10000
	public Review()
	{
		
	}

	public Review(long i,long pn,long sal,String nam,String des ) {
		 id=i;
		 pno=pn;
		 sala=sal;
		 name=nam;
		 desi=des;//empl,manager
		
	}
	
	
	public void setDes(String d)
	{
		desi=d;
	}
	public void setSal(long s)
	{
		sala=s;
	}
	public void setName(String n)
	{
		name=n;
	}
	
	public void setId(long idno)
	{
		id=idno;
	}
	public void setPno(long pn)
	{
		pno=pn;
	}
	
	
	public long getSal()
	{
		return sala;
	}
	public String getDes()
	{
		return desi;
	}
	public String getName()
	{
		return name;
	}
	public long getId()
	{
		return id;
	}
	public long getPno()
	{
		return pno;
	}
	public static void Display(long a,String c,long b,String d,Long e)
	{
		System.out.println(a+"\t\t"+b+"\t\t"+c+"\t\t"+d+"\t\t"+e+"\t");
	}
	
public static void main(String [] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of customers");
	n=sc.nextInt();
	/*long in;
	String na;long p;
	String d;
	long s;
	
	Review customer=new Review();
	Review customer1=new Review(in, s, p, d, na);*/

	Review customer1=new Review();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter customer id");
		long num=sc.nextLong();
		customer1.setId(num);
		
		Scanner c=new Scanner(System.in);

		System.out.println("Enter customer name");
		String cusn =c.nextLine();
		customer1.setName(cusn);
		
		Scanner p=new Scanner(System.in);

		System.out.println("Enter customer phone number");
		long pnum=p.nextLong();
		customer1.setPno(pnum);
		
		Scanner x=new Scanner(System.in);

		System.out.println("Enter customer salary");
		long salary=x.nextLong();
		customer1.setSal(salary);
		Scanner b=new Scanner(System.in);

		System.out.println("select number for customer designation ");
		System.out.println("1.employee \t 2.Manager");
		int op=sc.nextInt();
		String design;
		
		if(op<3)
		{switch(op)
			{case 1:customer1.setDes("employee");
			System.out.println(customer1.getDes());

			System.out.println(customer1.getSal());
			
			break;

			
			case 2:
				customer1.setDes("Manager");
			
			salary=salary+10000;
			customer1.setSal(salary);
			System.out.println(customer1.getSal());
			break;

			
			
			
			
			default: break;
		
			
			}}
	
		}

	//	cust[i]=customer1(getId(),getName(),getPno(),getDes(),getSal());


	
	//Display(customer.getId(),customer.getName(),customer.getPno(),customer.getDes(),customer.getSal());
	Review customer2=new Review(customer1.getId(),customer1.getPno(),customer1.getSal(),customer1.getName(),customer1.getDes());
	System.out.println("CUSTOMERID \t NAME \t PHONENUM \t DESIGN \t SALARY ");
	Display(customer2.getId(),customer2.getName(),customer2.getPno(),customer2.getDes(),customer2.getSal());

	Review [] cust=new Review[n];

	for(int j=0;j<n;j++)
		
	{

		cust[j]=customer2;

		
	}
		}
		
		
		//
		

	
//cust[i]=customer(customer.getId(),customer.getName(),customer.getPno(),customer.getDes(),customer.getSal());


}
	
	
	
	
	
	
	
	
	


