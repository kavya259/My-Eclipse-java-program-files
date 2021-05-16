package studentrecord34;

import java.util.*;

public class Studentrecord {
	

	     int[] id ;
	    String[] name ;
	    String[] branch ;
	    Scanner s=new Scanner(System.in);
	    public void studentRecord()
	    {
	      
	   int n=id.length;
	   for (int i=0; i<n; i++)
	           {
	               
	               System.out.println("id:");
	               id [i] = s.nextInt();
	               System.out.println("name:");
	               name [i] = s.next();
	               System.out.println("branch:");
	               branch [i] = s.next();
	           } System.out.println("id\tname\tbranch");
	           for (int i=0; i<n; i++)
	                   {
	                       System.out.println(id[i]+"\t" + name[i]+"\t" + branch[i]);
	                   }
	            
	   
	        
	    }
	     public void ndisplay()
	    {
	        int n=id.length;
	     String temp,t1;
	     for (int i = 0; i <n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (branch[i].compareTo(branch[j])>0) 
	                {
	                    temp = branch[i];
	                    branch[i] = branch[j];
	                    branch[j] = temp;
	                    t1=name[i];
	                    name[i]=name[j];
	                    name[j]=t1;
	                }
	            }
	        }
	        System.out.println("Sorted Order:");
	         System.out.println("name\tbranch");
	        for (int i = 0; i <n; i++) 
	        {
	            System.out.println(name[i] + "\t"+ branch[i]);
	        }
	        
	    }
	    public void iddisplay()
	    {
	        int n=id.length;
	        int temp;
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) { 
	                if (id[i] > id[j]) 
	                {
	                    temp = id[i];
	                    id[i] = id[j];
	                    id[j] = temp;
	                }
	            }
	        }
	        System.out.println("ids in Ascending Order: ");
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.println(id[i]);
	        }
	        
	    }
	    public static void main(String args[]) {
	        Studentrecord m=new Studentrecord ();
	         int c; 
	         System.out.println("no of records = ");
	         c=m.s.nextInt();
	         m.name= new String[c];
	        m.id = new int[c];
	         m.branch = new String[c];
	        int choice;
	        
	        do{
	       
	       System.out.println("Student Record Menu");
	       System.out.println("1. Add Student\n2. View Student names\n3. view Student id\n4. Exit");
	       System.out.println("Enter a choice: ");
	       choice = m.s.nextInt();

	       if (choice==1)
	       {
	          m.studentRecord();
	       }
	               else if (choice==2)
	               {
	                  m.ndisplay();
	               }
	               else if(choice==3)
	               {
	                   m.iddisplay();
	               }
	               else
	               break;

	   } while(choice<=c+1);
	      
	     
	    }
	}


