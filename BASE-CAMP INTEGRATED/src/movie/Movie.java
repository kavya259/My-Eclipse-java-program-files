package movie;

import java.util.Scanner;

public class Movie {
	private long id;
	private String movieName;
	private double rating;
	private String language;
	private String genre;
	int castNumber;
	private String casting[] = new String[castNumber];

	public Movie() {
	}

	public Movie(long id, String movieName, double rating, String language, String genre, int castNumber,
			String[] casting) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
		this.language = language;
		this.genre = genre;
		this.castNumber = castNumber;
		this.casting = casting;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {

		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		if (rating <= 5) {
			this.rating = rating;
		} else {
			System.out.println("please rate between 0 to 5 ");
		}
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getCastNumber() {
		return castNumber;
	}

	public void setCastNumber(int castNumber) {
		this.castNumber = castNumber;
	}

	public String[] getCasting() {
		return casting;
	}

	public void setCasting(String[] casting) {
		this.casting = casting;
	}

	public void addMovieDetails(Movie[] details) {
		long id;
		String strName;
		String strLang;
		String strGenre;
		double rate;
		int opt ;
		int n = details.length;

		for (int i = 0; i < n; i++) {


			Scanner sc = new Scanner(System.in);

			System.out.println("Movie id :");
			id = sc.nextInt();

			Scanner na = new Scanner(System.in);

			System.out.println("Movie name :");
			strName = na.nextLine();
			

			Scanner l = new Scanner(System.in);

			System.out.println("choose language of the movie ");
			System.out.println("1.Hindi\n2.English\n3.Telugu\n4.Kannada\n5.Tamil\n6.Malayalam\n");
			int option = l.nextInt();			
			System.out.println("language :");
			strLang = selectLanguage(option);


			
			

			System.out.println("genre:");
			strGenre = selectGenre();

			Scanner r = new Scanner(System.in);
			System.out.println("Rating(out of 5) :");
			rate = r.nextDouble();

			Scanner ca = new Scanner(System.in);

			System.out.println("number of cast :");
			int totalcast = ca.nextInt();
			details[i].setCastNumber(totalcast);
			String strCast[] = new String[totalcast];// array of cast
			details[i].setId(id);
			details[i].setMovieName(strName);
			details[i].setLanguage(strLang);
			details[i].setGenre(strGenre);
			details[i].setRating(rate);
			r.close();

			System.out.println("Casting details");
			
			for (int j = 0; j < totalcast; j++) {
				Scanner c = new Scanner(System.in);

				System.out.println("give cast " + j + " name  ");
				strCast[j] = c.nextLine();
				c.close();

			}
			
			for (int j = 0; j < totalcast; j++) {
				details[i].setCasting(strCast);
			}

		}


	}

	public String selectLanguage(int option) {
		Scanner sc = new Scanner(System.in);
		String lang = "";
		
		switch (option) {
		case 1:
			lang = "Hindi ";
			break;
		case 2:
			lang = "English";
			break;
		case 3:
			lang = "Telugu";
			break;
		case 4:
			lang = "Kannada";
			break;
		case 5:
			lang = "Tamil";
			break;
		case 6:
			lang = "Malayalam";
			break;
		default:
			System.out.println("select from above 6 options only ");
			break;

		}
		sc.close();
		return lang;
	}

	public String selectGenre() {
		System.out.println("choose genre of the movie ");

		System.out.println(	"1.Action\n2.Horror\n3.Comedy\n4.Romance\n5.Thriller\n6.Adventure\n7.Mystery\n8.Fiction9.Animation\n10.Drama");

		Scanner g = new Scanner(System.in);


		int option=g.nextInt();
		String gnr="" ;
		
		switch (option) {
		case 1:
			gnr = "Action";
			break;
		case 2:
			gnr = "Horror";
			break;
		case 3:
			gnr = "Comedy";
			break;
		case 4:
			gnr = "Romance";
			break;
		case 5:
			gnr = "Tamil";
			break;
		case 6:
			gnr ="Thriller";
			break;
		case 7:
			gnr = "Adventure";
			break;
		case 8:
			gnr = "Mystery";
			break;
		case 9:
			gnr = "Fiction";
			break;
		case 10:
			gnr = "Drama";
			break;
		default:
			System.out.println("select from above 10 options only ");
			break;
			

		}
		return gnr;
	}

	public void display(Movie[] display) {
		System.out.println("........... MOVIE DETAILS .........");
		System.out.println("");
		for (int i = 0; i < display.length; i++) {

			System.out.println("MOVIE ID : " + display[i].getId() + "\n " + "MOVIE NAME : " + display[i].getMovieName()
					+ "\n " + "GENRE : " + display[i].getGenre() + "\n" + "LANGUAGE : " + display[i].getLanguage()
					+ "\n" + "RATING : " + display[i].getRating() + "\n " + "CAST : " + display[i].getCasting()
					+ "\n..........................................................");
		}

	}

	public void sort(Movie[] category) {
		System.out.println("According to what ,do you want to sort movie details...slect from the option..");
		System.out.println("1.Based on id \n2.Based on movie rating\n");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			sortId(category);
			break;
		case 2:
			sortRating(category);
			break;

		default:
			System.out.println("select from above 10 options only ");
			break;

		}
		sc.close();

	}

	public void sortId(Movie[] sort) {
		int n = sort.length;
		Movie strMovie[] = new Movie[n];
		Movie tempArray[] = new Movie[n];
		for (int i = 0; i < sort.length; i++) {
			strMovie[i] = sort[i];
		}
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length; j++) {

				if (strMovie[i].id > strMovie[j].id) {
					tempArray[0] = strMovie[i];
					strMovie[i] = strMovie[j];
					strMovie[j] = tempArray[0];

				}
			}
		}

		display(strMovie);

	}

	public void sortRating(Movie[] sort) {
		int n = sort.length;
		Movie strMovie[] = new Movie[n];
		Movie tempArray[] = new Movie[n];
		for (int i = 0; i < sort.length; i++) {
			strMovie[i] = sort[i];
		}
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length; j++) {

				if (strMovie[i].rating > strMovie[j].rating) {
					tempArray[0] = strMovie[i];
					strMovie[i] = strMovie[j];
					strMovie[j] = tempArray[0];

				}
			}
		}

		display(strMovie);

	}

	public void searchByMovie(Movie[] search) {
		String strMovieName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie name to search ");
		strMovieName = sc.nextLine();
		for (int i = 0; i < search.length; i++) {

			if (search[i].movieName.equalsIgnoreCase(strMovieName)) {
				System.out.println("Movie found ");
				System.out.println("MOVIE ID : " + id + "\n " + "MOVIE NAME : " + movieName + "\n " + "GENRE : " + genre
						+ "\n" + "LANGUAGE : " + language + "\n" + "RATING : " + rating + "\n " + "CAST : " + casting
						+ "\n..........................................................");

			}
		}

		sc.close();
	}

	public void searchByLanguage(Movie[] search) {
		String strMovieLang;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the language to search movies ");
		
		System.out.println("1.Hindi\n2.English\n3.Telugu\n4.Kannada\n5.Tamil\n6.Malayalam\n");
		int option = sc.nextInt();
		strMovieLang = selectLanguage(option);
		for (int i = 0; i < search.length; i++) {

			if (search[i].language.equalsIgnoreCase(strMovieLang)) {
				System.out.println("MOVIE ID : " + search[i].id + "\n " + "MOVIE NAME : " + search[i].movieName + "\n "
						+ "GENRE : " + search[i].genre + "\n" + "LANGUAGE : " + search[i].language + "\n" + "RATING : "
						+ search[i].rating + "\n " + "CAST : " + search[i].casting
						+ "\n..........................................................");

			}
		}

	}

	public void searchByCast(Movie[] search) {
		String strMovieCast;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the language to search movies ");
		strMovieCast = sc.nextLine();
		for (int i = 0; i < search.length; i++) {
			for (int j = 0; j < search[i].casting[i].length(); j++) {

				if (search[i].casting[j].equalsIgnoreCase(strMovieCast)) {
					System.out.println("MOVIE ID : " + search[i].id + "\n " + "MOVIE NAME : " + search[i].movieName
							+ "\n " + "GENRE : " + search[i].genre + "\n" + "LANGUAGE : " + search[i].language + "\n"
							+ "RATING : " + search[i].rating + "\n " + "CAST : " + search[i].casting
							+ "\n..........................................................");

				}
			}
		}

		sc.close();
	}

	public void deleteDetails(Movie[] delete) {
		System.out.println("1.to delete particular movie details select 1 ,to delete whole movies details select 2");
		Scanner sc = new Scanner(System.in);

		int op = sc.nextInt();
		switch (op) {
		case 1:
			deleteMovie(delete);
			break;
		case 2:
			deleteAll(delete);
			break;
		}
		sc.close();

	}

	public void deleteMovie(Movie[] movie) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie name to delete details ");
		String movieName = sc.nextLine();
		for (int i = 0; i < movie.length; i++) {
			if (movie[i].movieName.equalsIgnoreCase(movieName)) {
				movie[i] = null;

			}

		}
		sc.close();

	}

	public void deleteAll(Movie[] movie) {
		for (int i = 0; i < movie.length; i++) {
			movie[i] = null;

		}

	}

}
