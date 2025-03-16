package song;

public class songMethods {
    String title;
    String artist;
    String genre;
    int year;

    public songMethods(String title, String artist, String genre, int year){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }
    
    public void tampilkanData(){
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Genre: " + this.genre);
        System.out.println("Year: " + this.year);
    }
}
