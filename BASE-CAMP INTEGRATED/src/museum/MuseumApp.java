package museum;
import java.util.Scanner;

public class MuseumApp {
		static 	Scanner sc=new Scanner(System.in);
		public static int visit=0;
		static int age;
		public static void main(String args[])
		{
			Museum[] details= new Museum[100];

		 
			boolean condition=true;
			do
			{
				display();
				int option=intValidate();
		
				switch(option)
				{
				case 1:
				{
					System.out.println("Enter Number of Visitors");
					int visitors = intValidate();
					visitors = checkIfPositive(visitors);
					insertDetails(visitors, details);
					break;
					
				}
				case 2:
				{ 
					 
					System.out.println("Total number of visitors per day: " +totalVisitors());
				break;
				}
				case 3:
				{
					System.out.println("Enter start  age");
					int minAge=sc.nextInt();
					System.out.println("enter end age");
					int maxAge=sc.nextInt();
					System.out.println("Fetching number of visitors between range:"+AgeRange(minAge,maxAge,details));
					break;
				}
				case 4:
				{
					FtoM(details);
					break;
				}
				case 5:
				{
					System.out.println(totalEarnings(details));
					break;
				}

				case 6:
					condition=false;
					break;
				}
					
				
			}while(condition);
		}
		public static int totalEarnings(Museum details[])
		{
			int fee=0;
	    	for(int i=0;i<visit;i++)
	    	{
	    		fee+=Entryfee(details[i].getAge());    	
	    	}
	    	return fee;
	    	
		}
		 public static void FtoM(Museum details[])
		 {
			 int mcount=0;
			 int fcount=0;
			 for(int i=0;i<visit;i++)
			 {
				 if(details[i].getGender().equalsIgnoreCase("male"))
						 mcount++;
				if(details[i].getGender().equalsIgnoreCase("female"))
			                fcount++;
				
			 }
			 double ratio=fcount/mcount;
			 //int sum=mcount+fcount;
			 //double femaleRatio= (double)(fcount/sum);
			 //double maleRatio=(double)(mcount/sum);
			 System.out.println("Ratio of Females to Males "+fcount+":"+mcount+" is");
			 System.out.println(ratio);
			 
		 }

		public static int AgeRange(int minAge,int maxAge,Museum details[]) {
			int count=0;
			for(int i=0;i<visit;i++) {
				if(details[i].getAge()>=minAge && details[i].getAge()<=maxAge)
				{
					count++;
				}
			}
			return count;
		}
		public static int totalVisitors() {
			return visit;
		}
		public static int Entryfee(int age)
		{ 
			
			int entryfees = 0;
			
				if(age<5)
				{
				entryfees=0;
				}
				else if(age>=5 && age<18)
				{
					entryfees=10;
				}
				else if(age>=18 && age<60)
				{
					entryfees=20;
				}
				else if(age>=60 && age<=100)
					entryfees=5;
				else 
					System.out.println("exceeded expected age");
				
			return entryfees;
	}

		private static Museum[] insertDetails(int visitors, Museum[] details) {
		
			for(int i=0;i<visitors;i++)
			{
				String name,gender;
				int age,fee;
				
				System.out.println("Enter name of the visitor");
				name=sc.next();
				 name=StringValidate(name);
				 System.out.println("Enter Age");
				 age=intValidate(); 
				 System.out.println("Enter Gender of the visitor");
				 gender=sc.next();
				 gender=StringValidate(gender);
				 
				 fee=Entryfee(age);
				 System.out.println("Entry fee based on age is : "+ fee);
				 
					 details[visit]=new Museum(name,age,gender,fee);
					 visit++;
				 }
			
			return details;
			// TODO Auto-generated method stub
			
		}
		/*private static Museum[] addDetails(String name, int age, String gender, Museum[] details) {
			// TODO Auto-generated method stub

			Museum res[] = new Museum[details.length + 1];
			for (int i = 0; i < details.length; i++) {
				res[i] = details[i];
			}

			return res;
		}*/

		private static String StringValidate(String data) {

			while (!data.matches("[a-zA-Z\\s]+")) {
				if (!data.isEmpty()) {
					System.out.println("Please retype the alphabetical string");
				}
				data = sc.nextLine();
			}
			return data;
		}

		private static int checkIfPositive(int integer) {
			// TODO Auto-generated method stub
			while (integer < 0) {
				System.out.println("you didn't type an integer value ! please type an integer");
				integer = sc.nextInt();
			}
			return integer;
		
		}

		private static void display() {
			// TODO Auto-generated method stub
			System.out.println("Enter ur Choice \n 1: Enter name,age,gender \n 2:Number of visitors per day \n 3:Number of Visitors according to Age \n 4:Ratio of males and females \n 5:Total earnings per day \n 6:EXIT");
			
		}

		private static int intValidate() {

			int data = 0;
			boolean validation = false;
			while (validation == false) {
				if (sc.hasNextInt()) {
					data = sc.nextInt();
					validation = true;
				} else if (!sc.hasNextInt()) {
					System.out.println("you didn't type an integer value ! please type an integer");
					sc.next();

				}
			}
			return data;
		}


	}


