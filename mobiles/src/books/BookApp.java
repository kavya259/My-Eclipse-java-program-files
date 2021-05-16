package books;

import java.util.Scanner;

public class BookApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of books");
		int size = sc.nextInt();
		Book[] books = new Book[size];
		for (int i = 0; i < size; i++) {
			books[i] = new Book();
		}
		System.out.println("Adding book details");
		books = addBookDetails(books);
		displayBookDetails(books);
		Book[] sorted = sortBooksById(books);
		displayBookDetails(sorted);

	}

	public static Book[] addBookDetails(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.println("Enter book id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book Name");
			String name = sc.nextLine();
			System.out.println("Enter Author of the Book");
			String author = sc.nextLine();
			System.out.println("#################");

			books[i].setBookId(id);
			books[i].setBookName(name);
			books[i].setBookName(author);
			books[i] = new Book(id, name, author);
		}

		return books;

	}

	public static void displayBookDetails(Book[] books) {
		System.out.println("BookId\tBookName\tAuthor");
		for (int i = 0; i < books.length; i++) {
			System.out.println(
					books[i].getBookId() + "\t\t" + books[i].getBookName() + "\t\t" + books[i].getBookAuthor());
		}

	}

	public static Book[] sortBooksById(Book[] books) {
		int tempId;
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {

				if (books[i].getBookId() > books[j].getBookId()) {
					tempId = books[i].getBookId();
					books[i].bookId = books[j].bookId;
					books[j].bookId = tempId;
					books[i].bookName = books[j].bookName;
					books[i].bookAuthor = books[j].bookAuthor;
					// prices[i]=new
					// Book(books[j].getBookId(),books[j].getBookName(),books[i].getBookAuthor());

				}
			}

		}

		return books;

	}
}
