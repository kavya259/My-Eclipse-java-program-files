package maximumofthree;

import java.util.Scanner;

public class Maximumofthreenumbers {
	public static void main(String[] args) {
		int max,a,b,c;
		System.out.println("enter the values of a ,b,c");

		Scanner s=new Scanner(System.in);

		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();

	System.out.println("Maximum of given three numbers is : "+Getmax(a,b,c));
	//Getmax(a,b,c);
	}
public static int Getmax(int a, int b , int c){
	int max;
	if(a>b&&a>c)
	{
			 max = a;
		System.out.println("a = "+a);
		}
	
	else if(b>a&&b>c)
	{
		 max = b;
		System.out.println("b ="+b);
	
	}
	else 
	{
		 max = c;
		System.out.println("c = "+c);
	
	}
	return max;

}
}