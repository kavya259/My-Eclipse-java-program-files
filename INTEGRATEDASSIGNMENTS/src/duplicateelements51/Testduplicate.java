package duplicateelements51;

import java.util.Scanner;

public class Testduplicate {

	 public static void main(String[] args)   
	 {  
		 Duplicateelements d=new Duplicateelements();
	 int n,c=0;  
	 Scanner sc=new Scanner(System.in);  
	 System.out.print("Enter the number of elements you want to store: ");  
	 n=sc.nextInt();  
	 d.checkDuplicate(n, c);
	 }

}
