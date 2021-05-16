package anglebethourandminhand;

import java.util.Scanner;

public class Angle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hh, mm;
		System.out.println("Enter the hour ");
		hh = sc.nextInt();
		System.out.println("Enter the minute ");
		mm = sc.nextInt();
		System.out.println(" time " + hh + ":" + mm);
		if (hh > 24 || hh < 0 || mm < 0 || mm > 60) {
			System.out.println("Hour should be only between 0 to 24 and minutes should be between 0 to 60 only");
		}
		if (hh > 12) {
			hh = hh - 12;
		}
		if (mm == 60) {
			hh = hh + 1;
		}
		if (hh == 12) {
hh=0;		}
		double a = calculateAngle(hh, mm);
		System.out.println("The angle between hour and minute hand in "+ hh + ":" + mm+" is "+a+"degrees");
		sc.close();


	}

	public static double calculateAngle(int h, int m) {
		double ang = 0;
		double hrang, mang;
		hrang = ((h * 60) ) * 0.5;
		mang = (6 * m);
		ang = absoluteAngle(hrang - mang);
		return ang;

	}

	public static double minAngle(double a) {
		double min = 360 - a;
		if (a < min) {
			return a;
		} else
			return min;
	}

	public static double absoluteAngle(double an) {
		double ang;
		if (an > 0) {
			ang = an;
		} else
			ang = (-1 * an);
		double result = minAngle(ang);
		return result;

	}

}
