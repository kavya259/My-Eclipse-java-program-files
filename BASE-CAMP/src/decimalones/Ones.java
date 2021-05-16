package decimalones;

	import java.util.Scanner;
	public class Ones {
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[])
		{
			System.out.println("enter number");
			int n=sc.nextInt();
			int result=One(n);
			System.out.println(result);
		}
		public static int One(int number)
		{
			long one=1;
			int count=1;
			while(true)
			{
				if(one%number==0)
					break;
				else
					{
					one=one*10+1;
					count++;
					}
			}
			return count;
			
		}
		

	}

	
