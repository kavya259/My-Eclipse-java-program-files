package mobiles;

import java.util.Scanner;


public class Mobile {
	private int mobileId;
	private String mobileBrand;
	private double mobilePrice;
	private String mobileColour;
	public Mobile()
	{}
	public Mobile(int mobileId, String mobileBrand, double mobilePrice, String mobileColour) {
		super();
		this.mobileId = mobileId;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
		this.mobileColour = mobileColour;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileColour() {
		return mobileColour;
	}
	public void setMobileColour(String mobileColour) {
		this.mobileColour = mobileColour;
	}
	

	public Mobile[] addMobileDetails(Mobile[] mobiles) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < mobiles.length; i++) {

			System.out.println("Please give mobile id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Please give mobile brand name");
			String brand = sc.nextLine();
			
			System.out.println("Please give mobile price");
			double price = sc.nextDouble();
			System.out.println("Please give mobile Colour");
			String colour=sc.nextLine();
			System.out.println("-----------------------");

			
			mobiles[i].setMobileId(id);
			mobiles[i].setMobileBrand(brand);
			mobiles[i].setMobilePrice(price);
			mobiles[i].setMobileColour(colour);
			
			//mobiles[i]=new Mobile(id,brand,price,colour);

			
			
		}
		sc.close();
		return mobiles;
	}

	public void printMobileDetails(Mobile[] mobiles) {
		System.out.println("mobileId\tmobileBrand\tPrice\tColour");
		for (int i = 0; i < mobiles.length; i++) {
			System.out.println(mobiles[i].getMobileId() + "\t\t" + mobiles[i].getMobileBrand() + "\t\t" + mobiles[i].getMobilePrice()+"\t\t"+mobiles[i].getMobileColour());

		}

	}



}
