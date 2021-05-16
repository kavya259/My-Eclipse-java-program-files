package museum;

public class Museum {
	
		private String name;
		private int age;
		private String gender;
		private int fee;
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public int getAge()
		{
			return age;
		}
		public void setGender(String gender)
		{
			this.gender=gender;
		}
		public String getGender()
		{
			return gender;
		}
		public void setFee(int fee)
		{
			this.fee=fee;
		}
		public int getFee()
		{
			return fee;
		}
		public Museum()
		{

		}
		public Museum(String name,int age,String gender,int fee)
		{
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.fee=fee;
		}
		}


