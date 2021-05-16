package findstringinmatrix;

	import java.util.Scanner;
	public class Matrix {
		static Scanner sc=new Scanner(System.in);
		 
		public static void main(String args[])
		{
			char[][] matrix= new char[100][100];
			int n=0;
			int i,j;
			 String str;
			 
			do
			{
				System.out.println("enter your choice");
				 System.out.println("1:Enter the dimensions ");
					System.out.println("2:fill matrix");
					System.out.println("3:input string");
					System.out.println("4:exit");
					 int ch=sc.nextInt();
					
				 
				switch(ch)
				{
				case 1:
				{
					 System.out.println("enter number of rows and columns");
					n=sc.nextInt();
					 
					 break;
				}
				case 2:
				{
					System.out.println("enter matrix characters");
					for( i=0;i<n;i++)
					{
						for( j=0;j<n;j++)
						{
							matrix[i][j]=sc.next().charAt(0);
						}
						System.out.println();
					}
					break;
				}
				case 3:
				{
					System.out.println("enter String");
					  str=sc.next();
					  if(search(str,matrix,n))
						  System.out.println("string  " + str + "  found in the matrix");
					  
					  else
						  System.out.println("not found");
				
				break;
				}
				case 4:
					return;
					}
				
				}while(true);
			
		}
		public static boolean search(String str,char[][] matrix,int n)
		{
			int i,j;
			if(str.length()>n)
				return false;
			else
			{ 
				//searching rows
				String flag="";
					for( i=0;i<n;i++)
					{
						for( j=0;j<n;j++ )
						{
					flag=flag+matrix[i][j];
						}
					}
					if(flag.indexOf(str)!=-1) {
						return true;
					}
			//searching columns
					String flag1="";
					for( i=0;i<n;i++)
					{
						for( j=0;j<n;j++ )
						{
					flag1=flag1+matrix[i][j];
						}
					}
					if(flag1.indexOf(str)!=-1) {
						return true;
					}
			
				//search principal diagonal
				String flag2="";
					for(i=0;i<n;i++) {
	                flag2=flag2+matrix[i][i];
					}
					if(flag2.indexOf(str)!=-1) {
						return true;
					}
					//search secondary diagonal
					String flag3="";
					for (i = 0; i < n; i++) {
			            for (j = 0; j < n; j++) {
			 if ((i + j) == (n - 1))
	                flag3=flag3+matrix[i][j];
					}
					}
					if(flag3.indexOf(str)!=-1) {
						return true;
					}
			return false;
		}
	}

	}


