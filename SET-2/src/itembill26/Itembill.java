package itembill26;

import java.util.*;
public class Itembill {
     int[] itemid ;
    float[] price ;
    Scanner s=new Scanner(System.in);
    public void crecord()
    {
      int c,purchaseid;
      int billid=0,quantity,cid=0; 
      float iprice=0.0f;
      float discount,billamount;

         System.out.println("no of items = ");
         c=s.nextInt();
         itemid =new int[c];
         price=new float[c];
   for (int i=0; i<c; i++)
           {
               
               System.out.println("item id:");
               itemid[i] = s.nextInt();
               System.out.println("price:");
               price[i] = s.nextFloat();
           } 
           System.out.println("item id\t\tprice");
           for (int i=0; i<c; i++)
                   {
                       System.out.println(itemid[i]+"\t\t" + price[i]);
                   }
                   System.out.println("purchase id:");
                   purchaseid = s.nextInt();
                   int found=0;
          for (int i=0; i<c; i++)
                   {  
                       if(purchaseid==itemid[i])
                       {
                           found++;
                           iprice=price[i];
                           billid=i;
                           cid=billid+1;
                       System.out.println("enter discount in %:");
                       discount=s.nextInt();
                      System.out.println("enter quantity:");
                       quantity=s.nextInt();
                       discount=iprice*(discount/100);
                       billamount=(iprice-discount)*quantity;
                       System.out.println("\nbill id:"+billid+"\ncustomer id:"+cid+"\npurchase id:"+purchaseid+"\nquantity:"+quantity+"\ndiscount:"+discount+"\nbill amount:"+billamount);
                        }
                      }
                      if(found==0)
                      System.out.println("item not found");
}
        
    public static void main(String args[]) {
    	Itembill m=new Itembill ();
          m.crecord();
        
     
    }
}