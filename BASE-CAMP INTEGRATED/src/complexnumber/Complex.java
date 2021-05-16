package complexnumber;

public class Complex {
	private double real;
	private double imaginary;
	private String complexNum;

	public Complex() {

	}

	public Complex(double real, double imaginary, String complexNum) {
		super();
		this.real = real;
		this.imaginary = imaginary;
		this.complexNum = complexNum;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public String getComplexNum() {
		return complexNum;
	}

	public void setComplexNum(String complexNum) {

		this.complexNum = complexNum;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public Complex add(Complex otherNumber) {
		Complex add = new Complex();
		double othReal = otherNumber.real;
		double othImag = otherNumber.imaginary;
		add.setReal(real + othReal);
		add.setImaginary(imaginary + othImag);
		String complexRes = add.getReal() + "+ i( " + add.getImaginary() + ")";
		add.setComplexNum(complexRes);
		System.out.print(add.getComplexNum());
		return add;

	}

	public Complex subtract(Complex otherNumber) {
		Complex subtract = new Complex();
		double othReal = otherNumber.real;
		double othImag = otherNumber.imaginary;
		subtract.setReal(real - othReal);
		subtract.setImaginary(imaginary - othImag);
		String complexRes = subtract.getReal() + "+ i( " + subtract.getImaginary() + ")";
		subtract.setComplexNum(complexRes);
		System.out.print(subtract.getComplexNum());
		return subtract;

	}

	public Complex multiply(Complex otherNumber) {
		Complex multiply = new Complex();
		double othReal = otherNumber.real;
		double othImag = otherNumber.imaginary;
		double c1 = (real * othReal) + ((-1) * (imaginary * othImag));
		double c2 = (real * othImag) + (imaginary * othReal);
		multiply.setReal(c1);
		multiply.setImaginary(c2);
		String complexRes = multiply.getReal() + "+ i( " + multiply.getImaginary() + ")";
		multiply.setComplexNum(complexRes);
		System.out.print(multiply.getComplexNum());
		return multiply;

	}

	public Complex divide(Complex otherNumber) {
		Complex division = new Complex();
		double othReal = otherNumber.real;
		double othImag = otherNumber.imaginary;
		double c1 = (real * othReal) + (imaginary * othImag);
		double c2 = (imaginary * othReal) - (real * othImag);
		double c3 = (othReal * othReal) - ((-1) * othImag * othImag);
		division.setReal(c1);
		division.setImaginary(c2);

		String complexRes = division.getReal() + "+ i( " + division.getImaginary() + ") / (" + c3 + " )";
		division.setComplexNum(complexRes);
		System.out.print(division.getComplexNum());
		return division;

	}

}
