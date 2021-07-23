class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie");
	}
	void showIt() {
		System.out.println("Title - "+title+"\nGenre - "+genre+"\nRating - "+rating);
	}
}

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
		one.showIt();
		two.showIt();
		three.showIt();
	}
}

