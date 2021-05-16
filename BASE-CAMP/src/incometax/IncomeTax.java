package incometax;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

	double income;	
	System.out.println("Enter your income");
	income=sc.nextDouble();

	calculateTax(income);
	sc.close();
	}
	
	public static void calculateTax(double in)
	{
		double tax=0;
		if(in<=50000)
		{
			tax=0;
			
		}
		else if( in<=60000)
		{
			tax=0.1*(in-50000);
		}
		else if( in<=150000)
		{
			double in1=(in-60000);
			double in2=in1-50000;
			tax=(0.2*(in1))+(0.1*(in2));
			
		}
		else
		{
			double in1=(in-150000);
			double in2=in1-60000;
			double in3=(in-50000);
		
			tax=(0.3*(in1))+(0.2*(in2)+(0.1*(in3)));
	
		}
		System.out.println("income : "+in);

		System.out.println("Income tax is : "+tax);
		System.out.println("Income afer Deduction of total tax   : "+(in-tax));

		
		
	}

}
