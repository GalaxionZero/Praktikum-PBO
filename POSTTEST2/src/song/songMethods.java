package song;

public class songMethods {
    private String title;
    private String artist;
    private String genre;
    private int year;

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

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
