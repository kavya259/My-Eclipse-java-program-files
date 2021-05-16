package Employee27;
public class Employee {
	int empid;
	String empName;
	String empdesign;
	String empdept;

		
public Employee()
{
	empid= 0;
	empName= " ";
	empdesign= " ";
	empdept= " ";
	if(	empid== 0||empName==" "||	empdesign==" "||	empdept== " ")
		{System.out.println("no input given");
		}
}
	
	
public Employee(int employeeid,String employeeName ,String employeeDesig,String employeeDept) 
{
	
	empid=employeeid;
	empName= employeeName;
empdesign= 	employeeDesig;
	empdept=employeeDept ;
	
}


public int getEmpid()
{
return empid;	
}
public String getEmpname()
{
return empName;
	}
public String getEmpdesign()
{
return empdesign ;
}
public String getEmpdept()
{
return empdept;
}


public void setempid( int id) {

	empid=id;
		
}
public void setempName(String name) {
	empName = name;
	}
	
	
public void setempdes(String desg) {
	if(desg=="Developer"||desg=="tester"||desg=="lead"||desg=="manager") {
	empdesign =desg;
	}
	else
	{
		empdesign="invalid";
	}

	
	
}
public void setempdep(String dep) {
if(dep=="TTH"||dep=="RCM"||dep=="Digital"||dep=="DevOps")
	{
empdept=dep;
		}
	else
	{
		empdept="invalid";
	}
	
	
	
}



public static void main(String[] args)
{
Employee e1= new Employee();
Employee e2= new Employee(123,"jay","developer","TTH"  );

System.out.println("empID\t\tempName\t\t\tempdesignation\t\tempdepartment ");
System.out.println(e2.getEmpid()+ "\t\t"+e2.getEmpname()+"\t\t\t"+ e2.getEmpdesign()+"\t\t" +e2.getEmpdept());


e1.setempid(4);e1.setempName("guru"); e1.setempdes(" tester"); e1.setempdep( "RCM");
System.out.println(e1.getEmpid()+"\t\t"+e1.getEmpname()+"\t\t\t" +e1.getEmpdesign()+"\t\t\t" +e1.getEmpdept());
e2.setempid(12);e2.setempName("sai"); e2.setempdes("engineer"); e2.setempdep( "R0M");
System.out.println(e2.getEmpid()+ "\t\t"+e2.getEmpname()+"\t\t\t"+ e2.getEmpdesign()+"\t\t\t" +e2.getEmpdept());
	}
}