package duplicateelements51;

import java.util.Scanner;  
public class Duplicateelements   
{  
public void checkDuplicate(int n,int c){  
	 Scanner sc=new Scanner(System.in);  

int[] arr = new int[n];  
int[] b = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{   
arr[i]=sc.nextInt();  
}

for (int i = 0; i < n; i++) { 
            for (int j =i+1; j < n; j++) 
               if (arr[i] == arr[j]) 
               {
                    c=c+1;
                     b[i] =arr[j];
                    
               }
                  
      }  
             
      System.out.print("{"); 
      if(c!=0){
        for (int i=0; i<b.length; i++) 
        {
            if(b[i]!=0)
             System.out.print( b[i] + " "); 
            // else
             //System.out.print(b[i]); 
             
        }
      }
      else
      System.out.print("-1");
          
     
      System.out.print("}");

}  
}