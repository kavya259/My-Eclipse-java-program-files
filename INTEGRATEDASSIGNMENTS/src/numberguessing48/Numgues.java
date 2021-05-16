package numberguessing48;

import java.util.Scanner; 


public class Numgues {
   private int s;
   public Numgues()
   {
   	
   	}

public Numgues(int n)
{
	this.s=n;
	}
public void setNumber(int v)
{
     	this.s=v;
	}
public int getNumber()
{
	return s;
	
	}

	
  
	    //method  number guessing game 
	    public static void guessingNumberGame(String s) 
	    { 
	        Scanner sc = new Scanner(System.in); 


	   	 Numgues gu=new Numgues();

	    	int x,y,z,number;
	        
	      int k=(int)s.charAt(s.length()/2)+3;
	        x=k/10;
	        y=(x*2)+10*s.charAt(s.length()-1);
	        z=y/10;
	        z=x%2+y;
	        number=z*10;
	        if(number>1000 && number<9999)
	        {
	        	number=number/10;
	        }
	        if(number>10000 && number<99999)
	        {
	        	number=number/100;
	        }
	 
	 Numgues gu1=new Numgues(number);
	        // Generate the numbers 
	        System.out.println("limit of trials is :");
	        
	        int K = sc.nextInt(); 
	  
	        int i, guess; 
	  
	  
	        // Interate over K Trials 
	        for (i = 0; i < K; i++) { 
	  
	            System.out.println("Guess the number: "); 
	  
	            guess = sc.nextInt(); 
	  
	            
	            if (number == guess) { 
	                System.out.println("You guessed the number right ,congratulations "); 
	                break; 
	            } 
	            else if (number > guess ) { 
	                System.out.println("your guess is too low ,please try again"); 
	                
	            } 
	            else if (number < guess ) { 
	                System.out.println("your guess is too high ,please try again "); 
	                
	            } 
	        } 
	  
	        if (i == K) { 
	           System.out.println("your "+ K+ " trials are over , sorry");  
	           System.out.println("the number is "+number);} 
	           System.out.println("Wanna try one more time? if yes please select 1 other wise 2 to exit");  
	           int op;
	           String any;
	           op=sc.nextInt();
	           do
	           {
	        	   switch(op)
	        	   {
	        	   case 1:{
	        		   System.out.println("enter any string ");
	    	           any=sc.nextLine();
	    	           guessingNumberGame(any);}
	        	   break;
	        	   case 2:
	        	   break;
	        	   default :break;
	        	   }
	        	   
	        	   
	           }while(op<3);

	    } 
	  public static void exit()
	  {
		  
		  System.out.println("thank you");
		  
		  }
	  }
	    // Driver Code 
	   
