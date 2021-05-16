package laptops;

import java.util.Scanner;

public class Laptop {
	private int id;
	private String name;
	private double ramSize;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRamSize() {
		return ramSize;
	}

	public void setRamSize(double ramSize) {
		this.ramSize = ramSize;
	}

	public Laptop() {
	}

	public Laptop(int id, String name, double ramSize) {
		super();
		this.id = id;
		this.name = name;
		this.ramSize = ramSize;
	}

	public Laptop[] addLaptopDetails(Laptop[] laptop) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < laptop.length; i++) {
			System.out.println("-----------------------");

			System.out.println("Please give laptop id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Please give laptop name");
			String name = sc.nextLine();
			
			System.out.println("Please give laptop Ram Size");
			double ramsize = sc.nextDouble();
			laptop[i].setId(id);
			laptop[i].setName(name);
			laptop[i].setRamSize(ramsize);

		}
		sc.close();
		return laptop;
	}

	public void printLaptop(Laptop[] laptops) {
		System.out.println("laptopId\tlaptopName\tRamSize");
		for (int i = 0; i < laptops.length; i++) {
			System.out.println(laptops[i].getId() + "\t\t" + laptops[i].getName() + "\t\t" + laptops[i].getRamSize());

		}

	}

	public void ramSizeGreaterThanEight(Laptop[] laptops) {
		System.out.println("laptopId\tlaptopName\tRamSize");

		for (int i = 0; i < laptops.length; i++) {
			if (laptops[i].ramSize > 8) {
				System.out.println(laptops[i].getId() + "\t\t" + laptops[i].getName() + "\t\t" + laptops[i].getRamSize());

			}

		}

	}

}