package trackbookdetails28;

import java.util.Scanner;


public class Trackbookdetails {
	String bookname;
	String author;
	double price;
	int year;
	public static void main(String[] args) {
		Trackbookdetails t=new Trackbookdetails();
		String b;
		System.out.println("Enter the title of the book : ");
		Scanner s= new Scanner(System.in);
		b=s.nextLine();
		t.book(b);
					
	}

public void  book(String a )
{
	if(a.equalsIgnoreCase("Robinson Crusoe"))
	{
		 bookname="Robinson Crusoe";
		 author="Daniel Defoe";
		 price=15.50;
		 year=1719;
		
		System.out.println( "bookname="+bookname+"\n"+" author="+author+"\n"+ "price=$"+price+"\n"+" year="+year);
	}
	
	else if(a.equalsIgnoreCase("Heart of Darkness"))
	{
		 bookname="Heart of Darkness";
		 author="Joseph Conrad";
		 price=12.80;
		 year=1902;
		
		System.out.println( "bookname="+bookname+"\n"+" author="+author+"\n"+ "price=$"+price+"\n"+" year="+year);
	}
	else if(a.equalsIgnoreCase("Beach music"))
	{
		 bookname="Beach music";
		 author="Pat Conroy";
		 price=9.50;
		 year=1996;
		
		System.out.println( "bookname="+bookname+"\n"+" author="+author+"\n"+ "price=$"+price+"\n"+" year="+year);
	}
	else
	{System.out.println("Book not found");}
}
		
	
	

}
