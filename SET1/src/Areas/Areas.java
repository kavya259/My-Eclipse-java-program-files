package Areas;
import java.util.Scanner;
public class Areas {
	

	static Scanner sc=new Scanner(System.in);
	
	public static double triangleArea()
	{
		double side,height,area;
		System.out.println("Triangle");
		System.out.println("Enter the value of side ");
		side=sc.nextDouble();
		System.out.println("side :"+side);
		System.out.println("Enter the value of height ");
		height=sc.nextDouble();
		System.out.println("Height :"+ height);
		area=0.5*side*height;
		System.out.println("Area of triangle is : ");
		System.out.printf("%.2f ",area);

		return area;
	}
	
	public static double squareArea()
	{
		double side,area;
		System.out.println("Square");
		System.out.println("Enter the value of side ");
		side=sc.nextDouble();
		System.out.println("side :"+side);
		area=side*side;
		System.out.println("Area of square is : ");
		System.out.printf("%.2f ",area);
		return area;
	
		
	}
public static double rectangleArea()
	{
	double width,height,area;
	System.out.println("Rectangle");
	System.out.println("Enter the value of width ");
	width=sc.nextDouble();
	System.out.println("width :"+width);
	System.out.println("Enter the value of side ");
	height=sc.nextDouble();
	System.out.println("Height :"+ height);
	area=width*height;
	System.out.println("Area of Rectangle is : ");
	System.out.printf("%.2f ",area);

	return area;
	
	}
	public static double circleArea()
	{
		double radius,area,pi=3.14;
		System.out.println("Circle");
		System.out.println("Enter the value of radius");
		radius=sc.nextDouble();
		System.out.println("radius :"+radius);
		area=pi*radius*radius;
		System.out.println("Area of Circle is : ");
		System.out.printf("%.2f ",area);

		return area;
	
	}

	
	
	
	public static void main(String[] args)
	{
		System.out.println("Choose number from the following to calculate area of geometric figure required : ");
		System.out.println("1.Triangle \n2.Square \n 3.Rectangle \n4.Circle\n");
		int ch;
		ch=sc.nextInt();
		Areas A=new Areas();
		switch(ch)
		{
		case 1:
			A.triangleArea();
			break;
		case 2:{
			A.squareArea();
			break;
			
		}
		case 3:{
			A.rectangleArea();
			break;
			
		}
		case 4:{
			A.circleArea();
			break;
			
		}
		default:System.out.println("Choose only from 1 to 4");
		
		
		
		
		}
	}
}
