package song;

public class Song {
    private String title;
    private Artist artist;
    private String genre;
    private int year;
    private static int defaultYear = 2024;

    public Song(String title, Artist artist, String genre, int year){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public Song(String title, Artist artist, String genre) {
        this(title, artist, genre, defaultYear); 
    }

    public void updateSong(String newTitle, String newGenre) {
        this.title = newTitle;
        this.genre = newGenre;
    }

    public void updateSong(String newTitle, String newGenre, int newYear) {
        this.title = newTitle;
        this.genre = newGenre;
        this.year = newYear;
    }
    
    public void tampilkanData(){
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist.getName());
        System.out.println("Artist Type: " + this.artist.getArtistType());
        System.out.println("Genre: " + this.genre);
        System.out.println("Year: " + this.year);
    }

    public static int getDefaultYear() { return defaultYear; }

    public String getTitle() { return title; }

    public Artist getArtist() { return artist; }
    
    public String getGenre() { return genre; }
    
    public int getYear() { return year; }

    public static void setDefaultYear(int newYear) { defaultYear = newYear; }
    
    public void setTitle(String title) { this.title = title; }

    public void setArtist(Artist artist) { this.artist = artist; }

    public void setGenre(String genre) { this.genre = genre; }

    public void setYear(int year) { this.year = year; }
}
