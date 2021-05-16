package bankuser47;

import java.util.Scanner;
public class Bankuserdetails {
	long Accountno[];
	String Name[];
	String AccountType[];
	String DOB[];
	double balance[];
	String Address[];
	int n;
	static Scanner sc=new Scanner(System.in);
	
	public Bankuserdetails()
	{
		 Accountno=null;
		 Name=null;
		AccountType=null;
		 DOB=null;
		 balance=null;
		 Address=null;
	
	}
	//TO CREATE USER DETALS
	public void create(long accno[],String name[],String acctype[],String dob[],double bal[],String addr[],int n)
	{
		for(int i=0;i<n;i++)
	{
		 Accountno=accno;
		 Name=name;
		AccountType=acctype;
		 DOB=dob;
		 balance=bal;
		 Address=addr;
	}
		
	}
	//TO UPDATE DETAILS
	public void updateDetails(String username,String address2,int size) 
	{
		int s=size;
		Bankuserdetails b[]=new Bankuserdetails[s];
for(int i=0;i<s;i++)
{
		b[i].Name[i]=username;
		b[i].Address[i]=address2;
}
	}
	
	
	
	//method to delete details	
public void deleteuserDetail(long An,int n)
{
	for(int i=0;i<n;i++)
	{
		if(An==Accountno[i])
		{
	 Accountno[i]=0;
	 Name[i]="";
	AccountType[i]="";
	 DOB[i]="";
	 balance[i]=0;
	 Address[i]="";
	}
	}
	}

public static void Exit()
{
	System.out.println("Exit");
	}
/*displayid(n);
case 2:displayName(n);
case 3.displayBal(n);
case 4:sortAddress(n);
case 5.sortId(n);*/

	public void  sortId(int n)
	{  int i;
		long temp;	
		 for ( i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++)
	            { 
	                if (Accountno[i] > Accountno[j]) 
	                {
	                    temp = Accountno[i];
	                    Accountno[i] = Accountno[j];
	                    Accountno[j] = temp;
	                }
	            }
	        
	        }
			System.out.println(Accountno[i]+"\t"+Name[i]+"\t"+AccountType[i]+"\t"+DOB[i]+"\t"+balance[i]+"\t"+Address[i]);

	}
	public void  sortAddress(int n)
	{
		int i;
		String temp,t1;
	     for (i = 0; i <n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (Address[i].compareTo(Address[j])>0) 
	                {
	                    temp = Address[i];
	                    Address[i] = Address[j];
	                    Address[j] = temp;
	                    
	                }
	            }
	        }
			System.out.println(Accountno[i]+"\t"+Name[i]+"\t"+AccountType[i]+"\t"+DOB[i]+"\t"+balance[i]+"\t"+Address[i]);	
		
	}
	
	public void displayId(int n)
	{int i;
		long searchid;
		System.out.println("enter the id to display its details");
		searchid=sc.nextLong();
		for (i = 0; i <n; i++) 
        {
			if(Accountno[i]==searchid)
			{
				System.out.println(Accountno[i]+"\t"+Name[i]+"\t"+AccountType[i]+"\t"+DOB[i]+"\t"+balance[i]+"\t"+Address[i]);
			}
        }
        }
	public void displayName(int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			String searchname;
			System.out.println("enter the name to search account details ");
			searchname=sc.next();
			if(Name[i].equals(searchname))
			{
				System.out.println(Accountno[i]+"\t"+Name[i]+"\t"+AccountType[i]+"\t"+DOB[i]+"\t"+balance[i]+"\t"+Address[i]);

			}
						
		}
	
	}
	public void displayBal(int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(balance[i]!=0)
			{
				System.out.println(Accountno[i]+"\t"+Name[i]+"\t"+AccountType[i]+"\t"+DOB[i]+"\t"+balance[i]+"\t"+Address[i]);

				}
			}
		}
	

		
	


//MAIN METHOD	
	public static void main(String[] args) 
	{
		
		System.out.println("enter the number of customers :");
		int n=sc.nextInt();
		Bankuserdetails b[]=new Bankuserdetails[n];
		Bankuserdetails b1=new Bankuserdetails();
		System.out.println(".............Please give the number to select from the following..............");
		System.out.println("1. Create bank account \n 2.Update details(name and address)\n 3.Delete user details \n 4.Display User details\n 5. To Exit\n");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: for(int i=0;i<n;i++)
		{
			System.out.println("enter the  details ");
			long acno[] = null;
			System.out.println("User Accountnumer");
			acno[i]=sc.nextLong();
			
			
			String username[] = null;
			System.out.println("User Name ");
			username[i]=sc.next();
			
			String type[] = null;
			System.out.println("Account type:   choose any of the following :1.Savigs account /t 2.Loan account 3.Current Account ");
			int a;		
			a=sc.nextInt();
			if(a==1)
			{
				type[i]="Savings ";
			}
			else if(a==2)
			{
				type[i]="Loan";
			}
			else if(a==3)
			{
				type[i]="Current";
			}


			String birthdate[] = null;
			System.out.println("User date of birth ");
			birthdate[i]=sc.next();
			
			double Bal[] = null;
			System.out.println("Account balance ");
			Bal[i]=sc.nextDouble();
			String address[] = null;
			System.out.println("enter your address starting with city");
			address[i]=sc.next();		
		
		b[i].create(acno,username,type,birthdate,Bal,address,n);
		}
		
		case 2:	
			{for(int i=0;i<n;i++) {
				String username[] = null;
				System.out.println("User Name ");
				username[i]=sc.next();
					
				String address[] = null;
				System.out.println("enter your address starting with city");
				address[i]=sc.next();		
			
				
				b[i].updateDetails(username[i],address[i],n);
			}
			}
			
		case 3:	{
			System.out.println("enter the account number of the user to be delete details :");
			long an;
			an=sc.nextLong();
			b[n].deleteuserDetail(an,n);
		}
		case 4:{
			System.out.println("select  number for the display method you need ");
			System.out.println("1.display based on id /n 2.display based on name \n 3.display all with non-zero balance \n 4.sorted based on address \n 5.sorted based on id");

			int ch;
			ch=sc.nextInt();
			//Bankuserdetails bu[]=new Bankuserdetails[n];

			do {
			switch(ch)
			{
		
			case 1:b[n].displayId(n);
			case 2:b[n].displayName(n);
			case 3:b[n].displayBal(n);
			case 4:
				for(int i=0;i<n;i++)
					{
					//Bankuserdetails bu[]=new Bankuserdetails[n];
b[n].sortAddress(n);
					//Bankuserdetails[i].sortAddress(n);
					}
					
			//case 5:
				for(int i=0;i<n;i++)
				{
					Bankuserdetails B[]=new Bankuserdetails[n];
					b[n].sortId(n);

			//	Bankuserdetails[i].sortId(n);
				}
				
			}
			}while (ch<=4);
			
		}
			
		case 5:{
			Exit();
			break;
		}
		default:
		{System.out.println("select between 1 to 5");
		break;
		}
		}

			}
		
		
		

		
	}
	

