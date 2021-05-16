package multiplicationtable;

import java.util.Scanner;

public class Multiplicationtableupto12 {
public static void main(String[] args) {

	int i,number;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number ");
	number = s.nextInt();
	for(i=1;i<=12;i++)
	{
	System.out.println(number + " * "+i+" = "+(number*i));
	
}

}
}
