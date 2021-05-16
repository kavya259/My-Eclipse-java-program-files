package namingconvention;

public class NamingConvention {
	static final int VARIABLE_1=1;


	public static void main(String[] args)
	{
		int variable2=2;
		doSum(VARIABLE_1,variable2);
	}
	
public static  int	doSum(int var1,int var2)
	{
		int sum=var1+var2;
	
	return sum;
	}
}
