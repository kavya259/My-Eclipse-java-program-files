package highestscore35;

import java.util.Scanner;


public class Highestscore {
	int[] ID;
	String[] Name;
	String[] Branch;
	int[] Score;
		Scanner s=new Scanner(System.in);
	
	public void Maxscore()
	{     int c; 
	Scanner s=new Scanner(System.in);

         System.out.println("no of records = ");
         c=s.nextInt();
       ID = new int[c];
       Name= new String[c];
         Branch = new String[c];
         Score=new int[c];
         int max=0;
   for (int i=0; i<c; i++)
           {
               
               System.out.println("ID:");
               ID [i] = s.nextInt();
               System.out.println("Name:");
               Name [i] = s.next();
               System.out.println("Branch:");
               Branch [i] = s.next();
               System.out.println("Score:");
              Score [i] = s.nextInt();
           } 
            for (int i=0; i<c; i++)
           {
               if(max<Score[i])
               {
                   max=Score[i];
               }
           }
           System.out.println(" ..........top student details..........");
           for (int i=0; i<c; i++)
           {
               if(max==Score[i])
               {
                  	System.out.println("ID:"+ID[i]+"\nName:"+Name[i]+"\nBranch:"+Branch[i]+"\nScore:"+Score[i]);
               }
           
           }
	}

	
	public static void main(String[] args) 
	{
		Highestscore m= new Highestscore();
			m.Maxscore();
	
	}
}






