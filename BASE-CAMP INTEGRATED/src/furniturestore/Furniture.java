package furniturestore;

import java.util.Scanner;

public class Furniture {
	String category;
	long price;
	double discount;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String selectCategory(int option) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		// int option=sc.nextInt();
		switch (option) {
		case 1:
			str = "Tables";

			break;
		case 2:
			str = "Chairs";
			break;
		case 3:
			str = "Beds";
			break;
		case 4:
			str = "Desks";
			break;
		case 5:
			str = "Dressers";
			break;
		case 6:
			str = "Cupboard";
			break;
		default:
			System.out.println("select from 1 to 6 options only ");
			break;

		}
		setCategory(str);
		sc.close();
		return str;

	}

	public void displayDetails(Furniture[] furn, String category) {
		long cost;
		double discount;
		int n = furn.length;

		for (int i = 0; i < furn.length; i++) {
			if (category == furn[i].getCategory()) {
				cost = price(furn, i);
				discount=discount(furn,i);
		
			}

		}

	}

	public long price(Furniture[] furn, long cost) {

		furn[0].price = 3999;
		furn[1].price = 799;
		furn[2].price = 7999;
		furn[3].price = 6999;
		furn[4].price = 9999;
		furn[5].price = 8999;

		for (int i = 0; i < furn.length; i++) {
			cost = furn[i].price;

		}

		return cost;

	}
	public long discount(Furniture[] furn, long cost) {

		//furn[0].setDiscount();
		furn[1].price = 799;
		furn[2].price = 7999;
		furn[3].price = 6999;
		furn[4].price = 9999;
		furn[5].price = 8999;

		for (int i = 0; i < furn.length; i++) {
			cost = furn[i].price;

		}

		return cost;

	}

	public void sortPrice(Furniture[] sort) {

	}

	public static void main(String[] args) {
		Furniture furniture = new Furniture();
		int n = 6;
		Furniture furn[] = new Furniture[n];
		for (int i = 0; i < n; i++) {
			furn[i].category = furniture.selectCategory(i + 1);

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option ");
		System.out.println(
				"1.Select Category of furniture  \n 2.Furniture according to price \n 3.Discount on sales \n ");
		int option = sc.nextInt();
		String info;
		do {
			switch (option) {
			case 1:
				System.out.println("........... select Furniture type .........");
				System.out.println("1.Tables \t 2.Chairs\t 3.Beds\t4.Desks\t5.Dressers \t6.Cupboard");
				int select = sc.nextInt();
				info = furniture.selectCategory(select);
				furniture.displayDetails(furn, info);
				break;
			case 2:// furniture.sortPrice();
				break;
			case 3:// furniture.discount();
				break;
			case 4:
				break;

			}

		} while (option != 4);

	}

}
