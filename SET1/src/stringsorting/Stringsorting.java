package stringsorting;
import java.util.Scanner;
public class Stringsorting {

    static Scanner sc=new Scanner (System.in);
    
    public static void bubbleSort(String[] arr, int n)  
    { 
        String temp; 
  
        // Sorting strings using bubble sort 
        for (int j = 0; j < n ; j++) 
        { 
            for (int i = j + 1; i < n; i++)  
            { 
                if (arr[j].compareTo(arr[i]) > 0) 
                { 
                    temp = arr[j]; 
                    arr[j] = arr[i]; 
                    arr[i] = temp; 
                } 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String[] arr;
        int i;
        System.out.println("enter the size of array of strings ");
        int n = sc.nextInt(); 
        System.out.println("enter the elements in array of strings ");
        arr=new String[n];
        for(i=0;i<n;i++)
        {
        	arr[i]=sc.next();
        }
        System.out.println("Choose  the sorting method ");
        System.out.println("1.bubblesort of strings\n2.Insertion sort of strings ");
        int ch;
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: bubbleSort(arr,n);

        System.out.println("Strings in sorted order using bubblesort are : "); 
        for (int j = 0; j < n; j++) 
        {
            System.out.print(arr[j]+", "); 
        }
        
        break;
        
       case 2: {
        insertionSort(arr,n);	
        }
       System.out.println("Strings in sorted order using insertionsort are : "); 
       for ( int k = 0; k < n; k++) 
       {
           System.out.print(arr[k]+" "); 
       }
      
       break;
    
        }
        
        
    

    }


//method for insertion sort

public static void insertionSort(String arr[],int n)
{
    
    for(int i = 1; i<n; i++)
    {
        String temp = arr[i];


        int j=i;
        while (j > 0 && (arr[j-1]).compareTo(temp)>0) 
        { 
           arr[j]=arr[j-1];
            j--;
        }
        arr[j]=temp;
    }
    
   
    
}




}
