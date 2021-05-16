package review;

import java.util.Scanner;

public class Cake {

	private long id;
	private String name;
	private long revenue;
	private int gst;

	public Cake() {
			
	}

	public Cake(long id, String name, long revenue, int gst) {
		super();
		this.id = id;
		this.name = name;
		this.revenue = revenue;
		this.gst = gst;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		long cal = (gst * revenue) / 100;
		this.revenue = cal + revenue;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public void addDetails(Cake m[], int n) {
		int i;
		for (i = 0; i < n; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the ID number");
			long idno = s.nextLong();

			Scanner f = new Scanner(System.in);
			System.out.println("enter the Name");
			String na = f.nextLine();
			Scanner g = new Scanner(System.in);

			System.out.println("enter the GST");
			int gst = g.nextInt();

			Scanner r = new Scanner(System.in);

			System.out.println("enter the revenue");
			long reven = r.nextLong();

			m[i].setId(idno);
			m[i].setName(na);
			m[i].setRevenue(reven);
			m[i].setGst(gst);
		}
		System.out.println("shop Id  Name  Revenue  GST Number");
		for (i = 0; i < n; i++) {

			// m[i].Display(m, n);
			System.out.println(m[i].getId() + "\t" + m[i].getName() + "\t" + m[i].getRevenue() + "\t" + m[i].getGst());

		}
		/*
		 * for(int i=0;i<n;i++) { System.out.println(m[i].getId()+"\t" +
		 * m[i].getName()+"\t"+m[i].getRevenue()+"\t"+m[i].getGst());
		 * 
		 * }
		 */
	}

	public void displayHighest(Cake[] d, int n) {

		Cake t = new Cake();
		int i;
		int j;
		for (i = 0; i < d.length; i++) {
			for (j = i + 1; j < d.length; j++) {
				if (d[i].revenue < d[j].revenue) {
					t.revenue = d[i].revenue;
					d[i].revenue = d[j].revenue;
					d[j].revenue = t.revenue;

				}
			}

		}
		System.out.println(" revenue order is");
		for (i = 0; i < d.length; i++) {
			System.out.println(d[i].revenue);
		}
		if (d.length >= 3) {
			System.out.println("third highest revenue shop details ");
			System.out.println("shop Id  Name  Revenue  GST Number");

			System.out.println(d[2].getId() + "\t" + d[2].getName() + "\t" + d[2].getRevenue() + "\t" + d[2].getGst());
		} else {
			System.out.println("only two users are present,third highest can't be found");
		}

		// d[3].Display(d, n);

		long difference = d[0].revenue - d[2].revenue;

		System.out.println("Difference between first and third highest revenues is " + difference);

		/*
		 * for(int j=0;j<n;j++) { System.out.println(); }
		 */
	}

	public void searchId(Cake[] sh, int n) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the search ID: ");
		long search = s.nextLong();
		for (int p = 0; p < sh.length; p++) {
			for (int q = p + 1; q < sh.length; q++)

				if (sh[p].id > sh[q].id) {
					long t = sh[p].id;
					sh[p].id = sh[q].id;
					sh[q].id = t;
				}
		}

		System.out.println("sorted  ids");

		for (int p = 0; p < sh.length; p++) {
			System.out.println(sh[p].id);
		}

		int first = 0;
		int l = sh.length;
		int mid = (first + l) / 2;
		boolean flag = false;
		for (int i = 0; i < sh.length; i++) {
			for (int j = 0; j < sh.length; j++) {
				while (first < l) {
					if (sh[mid].id < search) {
						first = mid + 1;
					} else if (sh[mid].id == search) {
						flag = true;
						break;
					} else {
						l = mid - 1;
					}
					mid = (first + l) / 2;
				}
			}

		}

		if (flag == true) {
			System.out.println("id found at position " + (mid + 1) + " ");

		} else {
			System.out.println("id not found");

		}

	}

}
