package magicsquare40;

import java.util.Scanner;
public class Magicsquare {
	

	
	static Scanner sc=new Scanner(System.in);


	public static void main(String[] args)
	{
		
		int row;
		System.out.println("enter the size of rows: ");

		row=sc.nextInt();
		int col;
		System.out.println("enter the size of columns: ");

		col=sc.nextInt();

		
		if(row==col)
		{
		System.out.println("enter the elements in the array : ");
		
	/*
		int a[][]=new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 a[i][j]=sc.nextInt();
			}
						
		}
		
		to print array
		 System.out.println("array elements are :");
			System.out.println("");		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 System.out.print(" "+a[i][j]+" ");
			}
				System.out.println("");		
		}
		*/
		int arr[][]=new int[row][col];

		 isMagic(row,col,arr);
		}
		else System.out.println("rows and colums of the matrix must be same");
	}

	
	
	public static boolean isMagic(int r,int c,int ar[][])
	{
		
	
		
		int m=r;
		int n=c;
		

		int a[][]=new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 a[i][j]=sc.nextInt();
			}
						
		}
		
		//to print array
		 System.out.println("array elements are :");
			System.out.println("");		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 System.out.print(" "+a[i][j]+" ");
			}
				System.out.println("");		
		}

		//to do sum of each row
				int sum[]=new int[m];
			
				for(int i=0;i<m;i++)
				{		//sum[i]=0;

					for(int j=0;j<n;j++)
					{
					 sum[i]=sum[i]+a[i][j];
					}
					System.out.println("sum of row "+(i+1)+" = " +sum[i]);
										
				}
				
				//to check sum
				for(int i=0;i<m;i++)
				{
					int f=sum[0];
					if (sum[i] != f)
					  {

					    
					    System.out.println("not a magicsquare, rows sum is not equal");
					    return false;
					    
					  }
					
					
					else 
					{
				
						for(int j=0;j<n;j++)
						{		//sum[i]=0;

							for(int k=0;k<m;k++)
							{
							 sum[j]=sum[j]+a[k][j];
							}
							System.out.println("sum of column "+(j+1)+" = " +sum[j]);
												
						int C=sum[0];
							if(sum[j]!=C)
							{
								
							System.out.println("not a column magic and hence nota a square magic");
							return false;
							
							}
							else
							{
								int sumld=0,sumrd=0;
							
								for(int l=0;l<m;l++)
								{
									for(int p=0;p<n;p++)
									{
									 if(l==p)
									 {
										 sumld=sumld+a[l][p];
										 }
									 if((l+p)==n-1)
									 {
										 sumrd=sumrd+a[l][p];}
									 }
									
									 }
								System.out.println("sum of left diagonal elements is "+sumld);
								System.out.println("sum of right diagonal elements is "+sumrd);

									if(sumld!=sumrd)
									{
										System.out.println(" the two diagonals are not equal ");
										return false;
										
									}
				
									else
									{
										System.out.println("the diagonals have equal sum");
										System.out.println("The given matrix is a magic square");
										

									}
							}
									
						}
					}
				}
				return true;
	}
	}
								
				
	
	
	
	
	
	

