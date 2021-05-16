package bankuser47modified;

import java.util.*;
public class Bank
{
  long Accountno;
    String Name;
    String AccountType;
    String DOB;
  double balance;
    String Address;

  // int n;
  
 Scanner sc =new Scanner(System.in);
  public void create (Bank m[],int k)
  {
	 
		System.out.println ("enter the  details ");

   for (int i = 0; i < k; i++)
      {
	System.out.println ("User Accountnumer");
	  m[i].Accountno=sc.nextLong();

	System.out.println ("User Name ");
	  m[i].Name =sc.next();

	System.out.println("Account type:   choose any of the following :1.Savigs account /t 2.Loan account 3.Current Account ");
	int a;
	a=sc.nextInt();
	if (a == 1)
	  {
	   m[i].AccountType = "Savings ";
	  }
	else if (a == 2)
	  {
	    m[i].AccountType = "Loan";
	  }
	else if (a == 3)
	  {
	    m[i].AccountType = "Current";
	  }
	System.out.println ("User date of birth ");
       m[i].DOB =sc.next(); 

	System.out.println ("Account balance ");
  m[i].balance  =sc.nextDouble();

	System.out.println ("enter your address starting with city");
	m[i].Address = sc.next();
      }
     for (int i=0; i < k; i++) {
      System.out.println(m[i]);
    }


  }

  public void updateDetails (Bank m[],int k)
  {
      
    long accid;
    System.out.println ("Enter accno to update:");
    accid = sc.nextLong ();
    for (int i = 0; i < k; i++)
      {
	if (accid == m[i].Accountno)
	  {
	      System.out.println ("Enter name to update:");
	    m[i].Name = sc.next ();
	    System.out.println ("Enter address to update:");
	    m[i].Address = sc.next ();
	  }
      }
    for (int i = 0; i < k; i++)
      {
	System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }
  }
  public void deleteuserDetail (Bank m[],int k)
  {
    long accno;
    System.out.println ("Enter accno to delete:");
    accno = sc.nextLong ();
    for (int i = 0; i < k; i++)
      {
	if (accno == m[i].Accountno)
	  {
	    m[i].Accountno= 0;
	    m[i].Name= "";
	    m[i].AccountType= "";
	    m[i].DOB = "";
	    m[i].balance= 0;
	    m[i].Address = "";
	  }
      }
    for (int i = 0; i < k; i++)
      {
	System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }
  }
  public void display (Bank m[],int k)
  {
       
    System.out.println ("select  number for the display method you need ");
    System.out.
      println
      ("1.display based on id /n 2.display based on name \n 3.display all with non-zero balance \n 4.sorted based on address \n 5.sorted based on id");
    int ch;
    ch = sc.nextInt ();
    if (ch == 1)
      displayId (m,k);
    else if (ch == 2)
      displayName (m,k);
    else if (ch == 3)
      displayBal (m,k);
    else if (ch == 4)
      sortAddress (m,k);
    else
      sortId (m,k);
  }
  public void displayId (Bank m[],int k)
  { 
    int i;
    long searchid;
    System.out.println ("enter the id to display its details");
    searchid = sc.nextLong ();
    for (i = 0; i < k; i++)
      {
	if (m[i].Accountno == searchid)
	  {
	    System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }
  }
  }
  public void displayName(Bank m[],int k)
  {
    int i;
    String searchname;
	System.out.println ("enter the name to search account details ");
	searchname = sc.next();
    for (i = 0; i < k; i++)
      {
	
	if (m[i].Name.equals (searchname))
	  {
	    	System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }

      }

  }
  public void displayBal(Bank m[],int k)
  {
    int i;
    for (i = 0; i < k; i++)
      {
	if (m[i].balance!= 0)
	  {
	    System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }
      }
  }

  public void sortAddress(Bank m[],int k)
  {
    int i;
    Bank temp=new Bank();
    for (i = 0; i < k; i++)
      {
	for (int j = i + 1; j < k; j++)
	  {
	    if (m[i].Address.compareTo (m[j].Address) > 0)
	      {
		temp= m[i];
		m[i] = m[j];
		m[j] = temp;
	   
	      }
	  }
      }
      for (i = 0; i < k; i++)
      {
  	System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }
  }
  public void sortId(Bank m[],int k)
  {
    int i;
    Bank temp=new Bank();
    for (i = 0; i < k ;i++)
      {
	for (int j = i + 1; j < k; j++)
	  {
	    if (m[i].Accountno > m[j].Accountno )
	      {
	temp = m[i];
	m[i] = m[j];
		m[j] = temp;
	      }
	  }

      } for (i = 0; i < k; i++) 
        {
        
   	System.out.println ("\nAccountno:" + m[i].Accountno + "\nName:" +m[i].Name + "\nAccountType:" + m[i].AccountType +"\nDOB:" + m[i].DOB + "\nbalance" + m[i].balance+ "\nAddress:" +m[i].Address);
      }


  }


}