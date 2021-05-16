package bikeshowroom;

import java.util.Scanner;

public class BikeShowroom {
	private String make;
	private String model;
	private String type;
	private String EngCC;
	private long price;

	public BikeShowroom() {
	}

	public BikeShowroom(String make, String model, String type, String engCC, long price) {
		super();
		this.make = make;
		this.model = model;
		this.type = type;
		EngCC = engCC;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEngCC() {
		return EngCC;
	}

	public void setEngCC(String engCC) {
		EngCC = engCC;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


	public static void addInventory(BikeShowroom[] add, int newbike) {
		Scanner sc = new Scanner(System.in);


		System.out.println("make :");
		String makin = selectMake();
		add[newbike].setMake(makin);
		System.out.println("model :");
		String modname;
		modname= sc.nextLine();
		add[newbike].setModel(modname);

		System.out.println("Type :");
		String typ = sc.nextLine();
		add[newbike].setType(typ);

		System.out.println("Engine CC :");
		String engcc = sc.nextLine();
		add[newbike].setEngCC(engcc);

		System.out.println("Price :");
		long price = sc.nextLong();
		add[newbike].setPrice(price);


		

		display(add);
		sc.close();

	}
	
	
	public static String selectMake()
	{
		Scanner sc = new Scanner(System.in);
		String str="";
		System.out.println("........... select Make .........");
		System.out.println("1.Bajaj \t 2.Honda\t 3.TVS\t4.Yamaha\t5.Suzuki \t6.RoyalEnfield");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:str="Bajaj";
		break;
		case 2:str="Honda";
			break;
		case 3:str="Tvs";
			break;
		case 4:str="Yamaha";
			break;
		case 5:str="Suzuki";
			break;
		case 6:str="RoyalEnfield";
			break;
			default:System.out.println("select from 1 to 6 options only ");
			break;
			
		}
		return str;
		
	}

	public static void display(BikeShowroom[] display) {
		System.out.println("........... Bike details .........");
		System.out.println("Make\t Model\tType\tEngineCC\tPrice");
		for (int i = 0; i < display.length; i++) {
			System.out.println(display[i].getMake() + " " + display[i].getModel() + " " + display[i].getType() + " "
					+ display[i].getEngCC() + " " + display[i].getPrice());
		}

	}

	public static  BikeShowroom[] sortByMake(BikeShowroom[] bikes) {
		BikeShowroom tempbike[] = new BikeShowroom[bikes.length];
		BikeShowroom makeOrder[] = new BikeShowroom[bikes.length];

		for (int i = 0; i < bikes.length; i++) {
			makeOrder[i] = bikes[i];
		}
		for (int i = 0; i < bikes.length; i++) {
			for (int j = 0; j < bikes.length; j++) {
				if (makeOrder[i].make.compareTo(makeOrder[j].make) > 0) {
					tempbike[0] = makeOrder[i];
					makeOrder[i] = makeOrder[j];
					makeOrder[j] = makeOrder[0];
				}
			}
		}
		display(makeOrder);
		return makeOrder;

	}

	public static void sortTypeMake(BikeShowroom[] bikes) {
		BikeShowroom tempbike[] = new BikeShowroom[bikes.length];
		BikeShowroom makeOrder[] = new BikeShowroom[bikes.length];

		for (int i = 0; i < bikes.length; i++) {
			makeOrder[i] = bikes[i];
		}
		for (int i = 0; i < bikes.length; i++) {
			for (int j = 0; j < bikes.length; j++) {
				if (makeOrder[i].type.compareTo(makeOrder[j].type) > 0) {
					tempbike[0] = makeOrder[i];
					makeOrder[i] = makeOrder[j];
					makeOrder[j] = makeOrder[0];
				}
			}
		}
		display(sortByMake(makeOrder));

	}

	public static void expensive(BikeShowroom[] bikes) {
		BikeShowroom tempbike[] = new BikeShowroom[bikes.length];
		BikeShowroom makeOrder[] = new BikeShowroom[bikes.length];

		for (int i = 0; i < bikes.length; i++) {
			makeOrder[i] = bikes[i];
		}
		for (int i = 0; i < bikes.length; i++) {
			for (int j = 0; j < bikes.length; j++) {
				if (makeOrder[i].price > (makeOrder[j].price)) {
					tempbike[0] = makeOrder[i];
					makeOrder[i] = makeOrder[j];
					makeOrder[j] = makeOrder[0];
				}
			}
		}

		display(makeOrder);

		int countLeast = 0;
		int n = bikes.length;

		for (int i = 0; i < bikes.length; i++) {
			if (makeOrder[0].price == makeOrder[i].price) {
				countLeast = i;
			}

		}
		int countHigh = 0;

		for (int i = 0; i < bikes.length; i++) {
			if (makeOrder[n - 1].price == makeOrder[i].price) {
				countHigh = i;
			}

		}

		System.out.println("leastexpensive \t Price ");
		for (int i = 0; i <= countLeast; i++) {

			System.out.println(makeOrder[i].make + "\t\t" + makeOrder[i].price);
		}
		System.out.println();
		System.out.println("mostexpensive   age ");
		for (int i = 0; i <= countHigh; i++) {

			System.out.println(makeOrder[n - 1].make + "  \t\t" + makeOrder[n - 1].price);
		}

	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of bikes in a showroom");
		n = sc.nextInt();
		BikeShowroom bike = new BikeShowroom();
		BikeShowroom[] Bike = new BikeShowroom[n];
		int newbike = -1;
		int option;

		for (int i = 0; i < n; i++) {
			Bike[i] = bike;
		}
		do {
			System.out.println();

			System.out.println("check out the menu ,select any option");
			System.out.println("1.Add a new bike to the inventory. \n" + " 2.Display the bikes sorted by make . \n "
					+ "3.Display the bikes sorted by type and then  make. \n"
					+ " 4.Find the least and most expensive bikes  \n " + "5.EXIT");
			System.out.println();

			option = sc.nextInt();
			if (option == 1 && newbike < n) {
				newbike++;
			}

			switch (option) {
			case 1:
				addInventory(Bike, newbike);

				break;
			case 2:
				System.out.println();
				sortByMake(Bike);

				break;
			case 3:
				System.out.println();
				sortTypeMake(Bike);
				System.out.println();

				break;

			case 4:expensive(Bike);
				System.out.println();
				break;
			case 5:
				break;
			default:
				System.out.println("wrong option");
				break;
			}
		} while (option != 5);
		sc.close();


	}

}
