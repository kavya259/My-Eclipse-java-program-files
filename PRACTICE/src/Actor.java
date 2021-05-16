import java.util.Scanner;


public class Actor {
	private long actorID;
	private String actorName;
	private int Count;
	private int age;
	private String gender;

	public Actor() {
	}

	public Actor(long id, String na, int ct, int a, String gen) {
		actorID = id;
		actorName = na;
		Count = ct;
		age = a;
		gender = gen;
	}

	public long getActorID() {
		return actorID;
	}

	public void setActorID(long actorID) {
		this.actorID = actorID;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Actor[] addDetails(Actor m[], int n)  //TO ADD ENTRIES OF ACTORS
	{
		int i;
		for (i = 0; i < n; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the actor ID");
			long idno = s.nextLong();

			Scanner f = new Scanner(System.in);
			System.out.println("enter the actor Name");
			String na = f.nextLine();

			Scanner g = new Scanner(System.in);
			System.out.println("enter the movie count ");
			int cnt = g.nextInt();

			Scanner r = new Scanner(System.in);
			System.out.println("enter the age of the actor");
			int age = r.nextInt();

			Scanner k = new Scanner(System.in);
			System.out.println("enter the gender actor male/female/oters");
			String ge = k.nextLine();

			m[i].setActorID(idno);
			m[i].setActorName(na);
			m[i].setCount(cnt);
			m[i].setAge(age);
			m[i].setGender(ge);
		}
		displayDetails(m, n);

		return m;

	}

	public static void displayDetails(Actor m[], int n) //METHOD TO DISPLAY 
	{
		System.out.println("ActorId\t Name\t moviecount\t Age\t Gender\t");
		for (int i = 0; i < n; i++) {

			System.out.println(m[i].getActorID() + "\t " + m[i].getActorName() + "\t " + m[i].getCount() + "\t "
					+ m[i].getAge() + "\t " + m[i].getGender());

		}

	}
	
	public static Actor[] displayMale(Actor m[], int n)    //TO DISPLAY MALE ACTORS
	{
	Actor male[]=new Actor[n];
	int k=0;
		for (int i = 0; i < n; i++) {
			if(m[i].gender.equals("male"))
			{
				male[k].setActorID(m[i].actorID);
				male[k].setActorName(m[i].actorName);
				male[k].setGender(m[i].gender);
				k++;
			}
		}
		displayM(male,n);
	return m;	
	}
	public static void displayM(Actor m[], int n) //METHOD TO DISPLAY 
	{
		System.out.println("ActorId\t Name\t moviecount\t Age\t Gender\t");
		for (int i = 0; i < n; i++) {

			System.out.println(m[i].getActorID() + "\t " + m[i].getActorName() + "\t " + m[i].getCount()+ "\t " + m[i].getGender());

		}

	}

	
	public Actor[] sortAge(Actor[] d, int n)  //TO DISPLAY ACTORS ACCORDING TO AGE
	{

		Actor t = new Actor();
		int i;
		int j;
		for (i = 0; i < d.length; i++) {
			for (j = i + 1; j < d.length; j++) {
				if (d[i].age < d[j].age) {
					t.age = d[i].age;
					d[i].age = d[j].age;
					d[j].age = t.age;

				}
			}
			

		}
		displayDetails(d,n);
		return d;
		}
	
	public Actor[] sortCount(Actor[] c,int n)
	{
		Actor t[] = new Actor[n];
		int i;
		int j;
		for (i = 0; i < c.length; i++) {
			for (j = i + 1; j < c.length; j++) {
				if (c[i].Count >10) {
					t[i].actorName=c[i].actorName;
									}
			}
			

		}
		displayDetails(t,n);
	
	return c;	
	}
	

	
	
	

}
