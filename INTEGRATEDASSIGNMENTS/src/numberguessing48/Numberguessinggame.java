package numberguessing48;

import java.util.Scanner; 


public class Numberguessinggame {
		  
	    // 
	    //method  number guessing game 
	    public static void guessingNumberGame() 
	    { 
	        
	        Scanner sc = new Scanner(System.in); 
	 
	        // Generate the numbers 
	        int number = 1 + (int)(100
	                               * Math.random()); 
	 System.out.println("limit of trials is :");
	        
	        int K = sc.nextInt(); 
	  
	        int i, guess; 
	  
	        System.out.println("choose a number between 1 to 100"); 
	  
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
	                K++;
	            } 
	            else if (number < guess ) { 
	                System.out.println("your guess is too high ,please try again "); 
	                K++;
	            } 
	        } 
	  
	        if (i == K) { 
	           System.out.println("your "+ K+ " trials are over , sorry");  
	           System.out.println("the number is "+number);} 
	    } 
	  
	    // Driver Code 
	    public static void main(String arg[]) 
	    { 
	        guessingNumberGame(); 


	    }
}
