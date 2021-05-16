package complexnumber;

import java.util.Scanner;

public class ComplexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter real part of first complex number ");
		double real1 = sc.nextDouble();
		System.out.println("enter imaginary part of first complex number ");
		double imaginary1 = sc.nextDouble();
		Complex comp1 = new Complex();
		comp1.setReal(real1);
		comp1.setImaginary(imaginary1);

		System.out.println("enter real part of second complex number ");
		double real2 = sc.nextDouble();
		System.out.println("enter imaginary part of second complex number ");
		double imaginary2 = sc.nextDouble();
		Complex comp2 = new Complex();

		comp2.setReal(real2);
		comp2.setImaginary(imaginary2);
		comp2.setComplexNum(comp2.getReal() + "i" + comp2.getImaginary());

		System.out.print("Addition of two complex numbers is --->  ");
		comp1.add(comp2);
		System.out.print("\n Subtraction of two complex numbers is --->  ");
		comp1.subtract(comp2);
		System.out.print("\n Multiplication of two complex numbers is ---> ");
		comp1.multiply(comp2);
		System.out.print(" \n Division of two complex numbers is --->  ");
		comp1.divide(comp2);

		sc.close();

	}

}
