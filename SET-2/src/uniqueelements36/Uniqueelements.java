package uniqueelements36;

import java.util.Scanner;
public class Uniqueelements{
	public void Unique()
	{
	    int n1,n2;
	    Scanner s=new Scanner(System.in); 
	    System.out.println("no of elements in array1:");
	    n1=s.nextInt();
	    int[] a1=new int[n1];
	    System.out.println("enter array1 elements:");
	    for(int i=0;i<n1;i++)
	    {
	        a1[i]=s.nextInt();
	    }
	    System.out.println("no of elements in array1:");
	    n2=s.nextInt();
	    int[] a2=new int[n2];
	    System.out.println("enter array2 elements:");
	     for(int j=0;j<n2;j++)
	    {
	        a2[j]=s.nextInt();
	    }
	     
	     //sorting elements in ascending order
	     int temp;
	     for(int i=0;i<n1;i++)
		    {int flag=0;
	    	 for(int j=0;j<n1;j++)
			    {
			       if(a1[j]>a1[j+1])
			       {
			    	   temp =a1[j];
			    	   a1[j]=a1[j+1];
			    	   a1[j+1]=temp;
			    	   flag=1;
			    	   
			       }
			    }
		      System.out.println(a2[i]);  
	         
		    }
	     
	     
	     int t;
	     for(int i=0;i<n2;i++)
		    {int flag=0;
	    	 for(int j=0;j<n1;j++)
			    {
			       if(a1[j]>a1[j+1])
			       {
			    	   t =a2[j];
			    	   a2[j]=a2[j+1];
			    	   a2[j+1]=t;
			    	   flag=1;
			    	   
			       }
			    }
	    	
		      System.out.println(a2[i]);  
		    }
	    
	     
	     int i = 0, j = 0, k = 0; 
        while (i < n1 && j < n2) { 
  
            // If not common, print smaller 
            if (a1[i] < a2[j]) { 
                System.out.print(a1[i++] + " "); 
               // i++; 
                
            } 
            else if (a2[j] < a1[i]) { 
                System.out.print(a2[j++] + " "); 
               // j++; 
                
            } 
  
            // Skip common element 
            else { 
            	System.out.print(a2[j++]+" ");
                i++; 
                //j++; 
            } 
        } 
  
        // printing remaining elements 
        while (i < n1) { 
            System.out.print(a1[i++] + " "); 
           // i++; 
            
        } 
        while (j < n2) { 
            System.out.print(a2[j++] + " "); 
            //j++; 
            
        } }
	 public static void main(String[] args)
	   {
	     Uniqueelements m =new Uniqueelements(); 
	    m.Unique();
	   }
	
}



