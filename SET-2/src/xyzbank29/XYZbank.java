package xyzbank29;


public class XYZbank {
	int custid;
	String custname;
	String custaddress;
	String acctype;
	double balance;
	

	public XYZbank() {
		custid=0;
		 custname="";
		 custaddress=" ";
		 acctype=" ";
		 balance=0.0;
	}
	public XYZbank(int id,String N,String Ad)
	{
custid=id;
custname=N;
custaddress=Ad;
}
	
	public XYZbank(int id,String N)
	{
		custid=id;
		custname=N;
		}    
	
	public XYZbank(int id,String N,String Ad,String Ac,Double bal)
	{
		custid=id;
		custname=N;
		custaddress=Ad;
		acctype=Ac;
		balance=bal;
		}
	
	
	
	public void setid( int i) {

		custid=i;			
	}
	public void setname( String n) {

		custname=n;
			
	}
	public void setaddr( String d) {

		custaddress=d;
			
	}
	public void setacc( String a) {

		acctype=a;
			
	}
	public void setbal( int b) {

		balance=b;
			
	}


	
	
	
	
	public int getid()
	{
	return custid;
		}
	public String getname()
	{
	return custname ;
	}
	public String getaddr()
	{
	return custaddress;
	}
    public String getacc() 
{
	return acctype;
	}
    public double getbal() 
    {
    	return balance;
    }
	
	
	
	
	
	public static void main(String args[])
	{
		XYZbank b4=new XYZbank();
		XYZbank b1=new XYZbank(1001,"kumar","rajajinagar,Bangalore-10");
		XYZbank b2=new XYZbank(1002,"raja");
		XYZbank b3=new XYZbank(1003,"Shanthi","Jayanagar , Bangalore-20","SB",1500.12);
		System.out.println(b4.getid()+"\t\t"+b4.getname()+"\t\t\t" +b4.getaddr()+"\t\t\t" +b4.getacc()+"\t\t\t"+b4.getbal());
		System.out.println(b1.getid()+"\t\t"+b1.getname()+"\t\t\t" +b1.getaddr());
		System.out.println(b2.getid()+"\t\t"+b2.getname());
		System.out.println(b3.getid()+"\t\t"+b3.getname()+"\t\t\t" +b3.getaddr()+"\t\t\t" +b3.getacc()+"\t\t\t"+b3.getbal());
	

	}
}
