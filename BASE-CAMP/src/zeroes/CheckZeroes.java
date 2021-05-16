package zeroes;
import java.util.Scanner;

public class CheckZeroes {

	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer value");
		n=s.nextInt();
		Zeroes z=new Zeroes();
		int bz=z.tobinaryZeroes(n);
		System.out.println("Number of zeroes in binary form of "+n+" is "+bz);

		
	}
}
