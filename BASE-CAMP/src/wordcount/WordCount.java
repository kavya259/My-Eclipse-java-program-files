package wordcount;
import java.util.Scanner;

public class WordCount {
	public  String toInput()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = s.nextLine();
		return " "+str;
		}

public  int toCountWords(String s)
{
	int wcount=0;
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)==' ')
	{
		wcount++;
	}
	}
	System.out.println(wcount);
	return wcount+1;
	}
public  void toCountVowel(String s)
{
	int vcount=0;
	int acount=0;
	int ecount=0;
	int icount=0;
	int ocount=0;
	int ucount=0;
	char a='\0';
	char e='\0';
	char I='\0';
	char o='\0';
	char u='\0';
	

	char c;
	for(int i=0;i<s.length();i++)
	{
		a='a';
		e='e';
		I='i';
		o='o';
		u='u';
		c=s.charAt(i);
		
		switch(c)
		{
		case 'a':
		case 'A':{
			a=c;
			acount++;
		//	System.out.println(a+" "+acount++);

		}break;
		
		case 'e':
		case 'E':
		{
			 e=c;
			ecount++;
		//	System.out.println(e+" "+ecount+", " );

		}	break;
		
		case 'i':
		case 'I':{
			 I=c;
			icount++;
		//	System.out.println(I+" "+icount++);

		}break;
		
		case 'o':
		case 'O':{
			 o=c;
			ocount++;
		//	System.out.println(o+" "+ocount++);

		}break;
		
		case 'u':
		case 'U':{		
			u=c;
			ucount++;
		//	System.out.println(u+" "+ucount++);

		}break;
		
			
		}
	}
	System.out.println(a+" "+acount+","+e+" "+ecount+", "+I+" "+icount+","+o+" "+ocount+","+u+" "+ucount );
	}

public  void toWordArray(String str)
{
	str=str+" ";
	String wordarr[]=new String[str.length()];
	String wrd="";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
			count++;
	}

	int ind=0;
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)!=' ')
	{
		wrd=wrd+str.charAt(i);
		
	}
	else
	{
		wordarr[ind]=wrd;
		ind++;
		wrd="";
	}
	}
	
	for(int i=0;i<count;i++)
	{
		System.out.println(wordarr[i]);
	}
	
	}

}
