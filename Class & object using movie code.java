class Movie{
    int serialno;
    String title;
    String theme;
    String author;
    int year;
    Movie(int serialno, String title, String theme, String author, int year)
    {
        this.serialno = serialno;
        this.title = title;
        this.theme = theme;
        this.author =author;
        this.year = year;
    }
    void display() {
        System.out.println("Serial no : " + serialno);
        System.out.println("Title   : " + title);
        System.out.println("Theme   : " + theme);
        System.out.println("Author : " + author);
        System.out.println("Year    : " + year);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

       Movie[] movies = new Movie[3];

        Movie s1 = new Movie(101, "Cars", "Fantasy", "Jon Lasseter", 2011);
       movies[0] = s1;

        Movie s2 = new Movie(102, "Jana nayagan", "action", "H.Vinoth", 2026);
        movies[1] = s2;

        movies[2] = new Movie(103, "Joe", "love", "Hariharn Ram", 2023);

        for (int i = 0; i < movies.length; i++) {
            movies[i].display();
        }
    }
}
