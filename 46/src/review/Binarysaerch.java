package review;

import java.util.Scanner;

public class Binarysaerch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int m = sc.nextInt();
		int key;
		System.out.println("enter the key element ");

		key = sc.nextInt();
		int a[] = new int[m];
		int temp[] = new int[m];
		System.out.println("enter the array elements ");
		for (int f = 0; f < a.length; f++) {

			a[f] = sc.nextInt();
		}
		for (int f = 0; f < a.length; f++) {

			System.out.println(a[f]);
		}
		for(int p=0;p<a.length;p++)
		{
			for(int q=p+1;q<a.length;q++)

			if(a[p]>a[q])
			{
				int t=a[p];
				a[p]=a[q];
				a[q]=t;
			}
		}
		
		for(int p=0;p<a.length;p++)
		{
			
			System.out.println(a[p]);
		}
		

		int first = 0;
		int l = m ;
		 int mid = (first + l) / 2;
     boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				while (first < l) {
					if (a[mid] < key) {
						first = mid + 1;
					} else if (a[mid] == key) {
						flag=true;
						break;
					} else {
						l = mid - 1;
					}
					mid = (first + l) / 2;
				}
			}
		
				}
			
		
		if(flag==true)
		{
			System.out.println("found at location " + (mid + 1));
			
		}
		else
		{
			System.out.println("not found");

		}
	}

}
