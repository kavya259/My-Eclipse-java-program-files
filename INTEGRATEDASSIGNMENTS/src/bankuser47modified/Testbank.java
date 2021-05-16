package bankuser47modified;

import java.util.Scanner;

public class Testbank {

	 public static void main (String[] args)
	  {
	      Scanner s=new Scanner(System.in);
	      System.out.println ("enter the number of customers :");
	    int  n = s.nextInt ();
	      Bank me=new Bank();
	      Bank t[]=new Bank[n];
	      for (int i = 0; i < n; i++)
	      {
	          t[i]=new Bank();
	      }
	   
	    int choice;
	    do
	      {
		System.out.
		  println
		  (".............Please give the number to select from the following..............");
		System.out.
		  println
		  ("1. Create bank account \n 2.Update details(name and address)\n 3.Delete user details \n 4.Display User details\n 5. To Exit\n");
		System.out.println ("Enter your choice:");
		choice = s.nextInt ();
		switch (choice)
		  {
		  case 1:
		    me.create (t,n);
		    break;
		  case 2:
		    me.updateDetails (t,n);
		    break;
		  case 3:
		    me.deleteuserDetail (t,n);
		    break;
		  case 4:
		    me.display (t,n);
		    break;
		  case 5:return ;
		  default:
		    System.out.println ("select between 1 to 5");
		    break;

		  }
	      }
	    while (choice <= 5);

	  }
	}


