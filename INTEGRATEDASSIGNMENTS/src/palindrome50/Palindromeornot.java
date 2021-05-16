package palindrome50;

import java.util.Scanner;

public class Palindromeornot {
 
    public void palinno()
    {
		int num;
		System.out.println("Enter a number to check if it is a palindrome"); 
		Scanner in = new Scanner(System.in); 
		num=in.nextInt();

		int rev = 0, remainder, original;

        		original= num;
        	while( num != 0 )
        	{
            	remainder = num % 10;
            	rev = rev * 10 + remainder;
            	num  /= 10;
        	}
        	if (original == rev)
            	System.out.println(original+ " is a palindrome.");
        	else
            	System.out.println(original + " is not a palindrome.");
   	}
   public void palinstr()
   	{
		String originalstring;
		String  reverse = "";
		System.out.println("Enter a string  to check if it is a palindrome"); 
		Scanner in = new Scanner(System.in); 
      		originalstring=in.nextLine();	     
      		int length = originalstring.length();   
      			for ( int i = length - 1; i >= 0; i-- )  //while(i>=0 && i=length
         	reverse = reverse + originalstring.charAt(i);  
      		if (originalstring.equals(reverse))  
         	System.out.println( originalstring+" is a palindrome.");  
     		 else  
         	System.out.println(originalstring+" isn't a palindrome.");  
}
 public int select()
 {
	int	choice;
	System.out.println("1.palidrome number\n2.palindrome string\n3.Exit");
		System.out.println("Enter your choice:"); 
Scanner in = new Scanner(System.in);  
choice=in.nextInt();
return  choice;
}


 
    
public static void main(String[] args) {
    int c;

	Palindromeornot p=new	Palindromeornot();
c=p.select();

do{
    switch(c) {

      case 1:p.palinno();
      System.out.println("");
            c=p.select();
		 

      case 2:p.palinstr();
      c= p.select();
        	   
             System.out.println("");

     
      case 3:break;

    }
}while(c<=3);



  
  }


}







//int n;




//int a[]=new int[n];

//bank a[]=new bank();

//int a[][]=new int[n][n];











