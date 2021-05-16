package student33;
import java.util.Scanner;
public class Marks
{
    int sid;
    String sname;
    float Marks;
    boolean schance;
    public Marks(int stid,String stname,boolean sechance)
    {
        sid=stid;
        sname=stname;
        schance=sechance;
        Scanner s =new Scanner(System.in);
        
        if(schance==false)
        {
            float M1;
            System.out.println("marks:");
            M1=s.nextFloat();
            IdentifyMarks(M1);
        }
        else{
            float f1,s1;
             System.out.println(" first chance marks:");
            f1=s.nextFloat();
             System.out.println(" second chance marks:");
            s1=s.nextFloat();
            IdentifyMarks(f1,s1);
            
        }
            
        }
        public int getStudentId()
        {
            return sid;
        }
        public String getStudentName()
        {
            return sname;
        }
        public float getMarks()
        {
            return Marks;
        }
         public boolean getSecondChance()
        {
            return schance;
        }
        public void IdentifyMarks(float c1) 
        {
            Marks=c1;
            schance=false;
        }
        public void IdentifyMarks(float c2,float c3) 
        {
            float Max;
            if(c2>c3)
            {
                Max=c2;
            }
            else
            Max=c3;
            Marks=Max;
            schance=true;
        }
        public static void main(String[] args) {
        	Marks m1=new Marks(12,"John",false);
        	Marks m2=new Marks(56,"Robin",true);

		System.out.println("\ncleared in first chance\nID:"+m1.getStudentId()+"\nName:"+m1.getStudentName()+"\nMarks:"+m1.getMarks()+"\nSecond Chance:"+m1.getSecondChance());
	
            System.out.println("\nSecond Chance is required\nID:"+m2.getStudentId()+"\nName:"+m2.getStudentName()+"\nMarks:"+m2.getMarks()+"\nSecond Chance:"+m2.getSecondChance());
        }
}
