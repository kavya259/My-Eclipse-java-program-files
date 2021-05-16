package one;

import java.util.Scanner;

public class Parking {
	private String Num;
	private int startHr;
	private int startMin;
	private long fee;
	private int totalSlots;
	private int availSlot;
	private int endHr;
	private int endMin;
	private String startTime;
	private String endTime;
	private String slot;

	public Parking() {

	}

	public Parking(String Num, int startHr, int startMin, long fee, int totalSlots, int availSlot, int endHr,
			int endMin, String startTime, String endTime, String slot) {
		super();
		this.Num = Num;
		this.startHr = startHr;
		this.startMin = startMin;
		this.fee = fee;
		this.totalSlots = totalSlots;
		this.availSlot = availSlot;
		this.endHr = endHr;
		this.endMin = endMin;
		this.startTime = startTime;
		this.endTime = endTime;
		this.slot = slot;

	}

	public String getNum() {
		return Num;
	}

	public void setNum(String Num) {
		this.Num = Num;
	}

	public int getStartHr() {
		return startHr;
	}

	public void setStartHr(int startHr) {
		if (startHr > 12 && startHr < 24) {
			startHr = 24 - startHr;
		}
		this.startHr = startHr;
	}

	public int getStartMin() {
		return startMin;
	}

	public void setStartMin(int startMin) {
		if (startMin == 60) {
			startMin = 0;
			setStartHr(startHr + 1);
		}
		this.startMin = startMin;
	}

	public long getFee() {
		return fee;
	}

	public void setFee(long fee) {
		this.fee = fee;
	}

	public int getTotalSlots() {
		return totalSlots;
	}

	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}

	public int getAvailSlot() {
		return availSlot;
	}

	public void setAvailSlot(int availSlot) {
		this.availSlot = availSlot;
	}

	public int getEndHr() {
		return endHr;
	}

	public void setEndHr(int endHr) {
		if (endHr > 12 && endHr < 24) {
			endHr = 24 - endHr;
		}

		this.endHr = endHr;
	}

	public int getEndMin() {
		return endMin;
	}

	public void setEndMin(int endMin) {
		if (endMin == 60) {
			endMin = 0;
			setEndHr(endHr + 1);
		}

		this.endMin = endMin;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {

		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public boolean checkSlotAvailability(int n, int a) {
		boolean available = false;
		if (a < n) {
			System.out.println(" Slot is available : slot " + (a + 1));
			available = true;
		} else {
			System.out.println("No slots available ");
			available = false;
		}
		return available;

	}

	public void toEnterVehicleNum(Parking[] num, int n, int a) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle number : ");
		String num1 = sc.nextLine();
		num[a].setNum(num1);
		sc.close();

	}

	public void entryTime(Parking[] entry, int n, int a) {
		int shour;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the entry hour : ");
		shour = sc.nextInt();

		entry[a].setStartHr(shour);
		int smin;
		System.out.println("Enter the entry minute : ");
		smin = sc.nextInt();

		entry[a].setStartMin(smin);
		System.out.println("Start time is ");
		entry[a].setStartTime(shour + ":" + smin);
		

		displayTime(entry[a].getStartHr(), entry[a].getStartMin());
		sc.close();

	}

	public void displayTime(int hh, int mm) {
		System.out.println(hh + ":" + mm);
	}

	public void allocateSlot(Parking[] slot, int n, int a) {
		slot[a].setSlot("slot " + a + " Booked");
		System.out.println(slot[a].slot);
	}

	public void calculateParkingFee(Parking[] fee, int n, int a) {
		exitTime(fee, n, a);
		int hourDiff = fee[a].endHr - fee[a].startHr;
		int minDiff = fee[a].endMin - fee[a].startMin;
		int hoursToMin = hourDiff * 60;
		int totalMin = hoursToMin + minDiff;
		int fees = 0;

		if (totalMin == 120) {
			fees = 50;
		} else if (totalMin > 120) {

			totalMin = totalMin / 60;
			fees = 50 + ((totalMin) * 30);

		}
		System.out.println("Total fee for vehicle parking is Rs. " + fees + " only \n");
		System.out.println("..............Thank you for visiting............");

	}

	public void exitTime(Parking[] exit, int n, int a) {
		int endhr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the exit hour : ");
		endhr = sc.nextInt();
		exit[a].setEndHr(endhr);

		int endmin;
		System.out.println("Enter the exit minute : ");
		endmin = sc.nextInt();

		exit[a].setEndMin(endmin);
		System.out.println("exit time is ");

		displayTime(exit[a].getEndHr(), exit[a].getEndMin());
		exit[a].setEndTime(endhr + " " + endmin);

		sc.close();
	}

}
