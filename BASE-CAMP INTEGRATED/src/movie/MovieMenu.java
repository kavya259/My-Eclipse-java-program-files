package movie;

import java.util.Scanner;

public class MovieMenu {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of movies ");
		n = s.nextInt();
		int option;
		Movie movie = new Movie();
		Movie M[] = new Movie[n];
		for (int i = 0; i < n; i++) {
			M[i] = new Movie();
		}
		do {
			System.out.println();

			System.out.println("check out the menu ,select any option");
			System.out.println("1.Add movie details \n" + " 2.Display movie details \n " + "3.Delete movie details  \n"
					+ " 4.EXIT");
			System.out.println();

			option = s.nextInt();

			switch (option) {
			case 1:
				movie.addMovieDetails(M);
				System.out.println();

				break;
			case 2:
				movie.display(M);
				System.out.println();
				// park.toEnterVehicleNum(Park, n, a);

				break;
			case 3: {
				int op;
				Scanner sc = new Scanner(System.in);
				System.out.println(
						"select an option \n1.Sort\n2.Search by name\n3.Search by language\n4.Search by cast ");
				op = sc.nextInt();
				do {
					switch (op) {
					case 1:
						movie.sort(M);
						break;
					case 2:
						movie.searchByMovie(M);
						break;
					case 3:
						movie.searchByLanguage(M);
						break;
					case 4:
						movie.searchByCast(M);
						break;

					}

				} while (op != 5);
				sc.close();
			}

				System.out.println();

				break;

			case 4:
				movie.deleteDetails(M);
				System.out.println();
				// park.allocateSlot(Park, n, a);
				break;
			case 5:
				break;

			default:
				System.out.println("wrong option");
				break;
			}
		} while (option != 5);
		s.close();
	}

}
