import java.util.ArrayList;
import java.util.Scanner;
import song.Artist;
import song.Band;
import song.SoloArtist;
import song.Song;

public final class App {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Song> songs = new ArrayList<>();
    ArrayList<Artist> artists = new ArrayList<>();

    public final static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Songs");
            System.out.println("2. Artists");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1 -> {
                    if (artists.isEmpty()) {
                        System.out.println("No artists currently, please add an artist first.");
                    } else {
                        handleSongs();
                    }
                }
                case 2 -> handleArtists();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid menu!");
            }
        }
    }

    private void handleArtists() {
        System.out.println("\n=== Artist Management ===");
        System.out.println("1. Add Artist");
        System.out.println("2. List Artists");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.println("\nAdd Artist");
                System.out.println("1. Solo Artist");
                System.out.println("2. Band");
                System.out.print("Type: ");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Stage Name/Band Name: ");
                String name = scanner.nextLine();
                System.out.print("Country: ");
                String country = scanner.nextLine();

                if (type == 1) {
                    System.out.print("Real Name: ");
                    String realName = scanner.nextLine();
                    artists.add(new SoloArtist(name, country, realName));
                } else {
                    System.out.print("Number of Members: ");
                    int members = scanner.nextInt();
                    scanner.nextLine();
                    artists.add(new Band(name, country, members));
                }
                System.out.println("Artist added!");
            }
            case 2 -> {
                System.out.println("\nArtists:");
                for (int i = 0; i < artists.size(); i++) {
                    Artist a = artists.get(i);
                    System.out.println((i+1) + ". " + a.getName() + 
                        " (" + (a instanceof SoloArtist ? "Solo" : "Band") + ")");
                }
            }
        }
    }

    private void handleSongs() {
        while (true) {
            System.out.println("\n=== Song Management ===");
            System.out.println("1. Add Song");
            System.out.println("2. Show Songs");
            System.out.println("3. Update Song");
            System.out.println("4. Delete Song");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 1 -> addSong();
                case 2 -> showSongs();
                case 3 -> updateSong();
                case 4 -> deleteSong();
                case 5 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addSong() {
        if (artists.isEmpty()) {
            System.out.println("No artists available! Create an artist first.");
            return;
        }
    
        System.out.println("\nAvailable Artists:");
        for (int i = 0; i < artists.size(); i++) {
            System.out.println((i + 1) + ". " + artists.get(i).getName());
        }
        System.out.print("Select Artist (number): ");
        int artistIndex = scanner.nextInt() - 1;
        scanner.nextLine();
    
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Add release year? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            songs.add(new Song(title, artists.get(artistIndex), genre, year));
        } else {
            songs.add(new Song(title, artists.get(artistIndex), genre));
        }
        System.out.println("Song added successfully!");
    }
    
    private void showSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs available!");
            return;
        }
    
        System.out.println("\nList of Songs:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("\nSong #" + (i + 1));
            songs.get(i).tampilkanData();
        }
    }
    
    private void updateSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs to update!");
            return;
        }
    
        showSongs();
        System.out.print("\nEnter song number to update: ");
        int songIndex = scanner.nextInt() - 1;
        scanner.nextLine();
    
        if (songIndex < 0 || songIndex >= songs.size()) {
            System.out.println("Invalid song number!");
            return;
        }
    
        Song song = songs.get(songIndex);
        
        System.out.print("New title (leave blank to keep current): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty()) {
            song.setTitle(newTitle);
        }
    
        System.out.println("\nCurrent artist: " + song.getArtist().getName());
        System.out.println("Available Artists:");
        for (int i = 0; i < artists.size(); i++) {
            System.out.println((i + 1) + ". " + artists.get(i).getName());
        }
        System.out.print("New artist number (0 to keep current): ");
        int artistChoice = scanner.nextInt();
        scanner.nextLine();
        if (artistChoice > 0 && artistChoice <= artists.size()) {
            song.setArtist(artists.get(artistChoice - 1));
        }
    
        System.out.print("New genre (leave blank to keep current): ");
        String newGenre = scanner.nextLine();
        if (!newGenre.isEmpty()) {
            song.setGenre(newGenre);
        }
    
        System.out.print("Update year? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.print("New year: ");
            int newYear = scanner.nextInt();
            scanner.nextLine();
            song.updateSong(newTitle.isEmpty() ? song.getTitle() : newTitle, 
                        newGenre.isEmpty() ? song.getGenre() : newGenre, 
                        newYear);
        } else {
            song.updateSong(newTitle.isEmpty() ? song.getTitle() : newTitle,
                        newGenre.isEmpty() ? song.getGenre() : newGenre);
        }
    
        System.out.println("Song updated successfully!");
    }
    
    private void deleteSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs to delete!");
            return;
        }
    
        showSongs();
        System.out.print("\nEnter song number to delete: ");
        int songIndex = scanner.nextInt() - 1;
        scanner.nextLine();
    
        if (songIndex < 0 || songIndex >= songs.size()) {
            System.out.println("Invalid song number!");
            return;
        }
    
        songs.remove(songIndex);
        System.out.println("Song deleted successfully!");
    }
}