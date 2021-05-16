package uniquecharacters;
import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args)
	{
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a String");
		str=s.nextLine();
		CheckUnique u=new CheckUnique();
		u.tocheckUnique(str);
		s.close();

	}

}
