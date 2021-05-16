package numberguessing48;

import java.util.Scanner;

public class Testnumber {

	 public static void main(String arg[]) 
	    { 
	    	Numgues guess=new Numgues();
	    	String str;
	        Scanner sc = new Scanner(System.in); 
	        System.out.println("Enter your school name or college name or your tell what you are your hobbies ");
	        str=sc.nextLine();
	        guess.guessingNumberGame(str); 	
	        


	    }

}
