package usn;
import java.util.Scanner;
public class USN {

	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int n=10;
		System.out.println("please enter the USN number of 10 digits:");
		String USN= sc.nextLine();
		validateUSN(USN,n);
		}
	
	public static void validateUSN(String USN,int n)
	{
		String u=USN;
		int count = 0;
		int gap=u.indexOf(5,6);
		for(int i=0;i<n;i++)
		{
			if((u.charAt(0)=='1')||(u.charAt(0)=='2') )
			{
				for(i=1;i<=2;i++)
				{
					if(((int)(u.charAt(i))>=65)&&((int)(u.charAt(i))<=90))
							{
						for(int j=3;j<=4;j++)
						{
							if((u.charAt(j)>='0')&&(u.charAt(j)<='9'))
							{
								if((u.substring(gap)=="CS")||(u.substring(gap)=="IS")||(u.substring(gap)=="EC")||(u.substring(gap)=="ME"))
										{
									 
									 for(int k=7;k<10;k++)
									 {
										  
										 if((u.charAt(k)>='0')&& (u.charAt(k)<='9'))
												 {
											 count++;
												 
										 
												 }
										 System.out.println("7,8,9");

									 }		

									
									
										}			System.out.println("5 n 6 ");

							}		
							System.out.println("3 and 4");

						}
						

						
					}
					System.out.println("1 and 2");

				}
				

				
			}
			
			System.out.println("0");

		/*if(count==3)
		{
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("FAILED");

		}*/
	}
	
		if(count==3)
		{
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("FAILED");

		}

		
	}

}
