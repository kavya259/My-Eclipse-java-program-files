package doubts;
import java.util.Scanner;
public class prob {

	public static void main(String[] args) {
		String[] devices;	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int n;
		n=sc.nextInt();
		devices= new String[n];
		for(int i=0;i<n;i++)
		{
			devices[i]=sc.nextLine();
		}// TODO Auto-generated constructor stub
		for(int i=0;i<n;i++)
		{
			System.out.println(devices[i]);
		}

	}

}
