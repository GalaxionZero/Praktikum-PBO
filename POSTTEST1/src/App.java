import java.util.ArrayList;
import java.util.Scanner;
import song.songMethods;

public class App {
    Scanner scanner = new Scanner(System.in);
    ArrayList<songMethods> songs = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }

    public void run(){
        while (true){
            System.out.println("Menu Pilihan:");
            System.out.println("1. Songs");
            System.out.println("2. Artists (Coming Soon)");
            System.out.println("3. Genres (Coming Soon)");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Songs");
                    System.out.println("1. Add Song");
                    System.out.println("2. Show Songs");
                    System.out.println("3. Update Song");
                    System.out.println("4. Delete Song");
                    System.out.println("5. Back to Menu");
                    System.out.println("Choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice){
                        case 1:
                            System.out.println("Add Song");
                            System.out.print("Title: ");
                            String title = scanner.nextLine();
                            System.out.print("Artist: ");
                            String artist = scanner.nextLine();
                            System.out.print("Genre: ");
                            String genre = scanner.nextLine();
                            System.out.print("Year: ");
                            int year = scanner.nextInt();
                            songMethods song = new songMethods(title, artist, genre, year);
                            songs.add(song);
                            System.out.println("Song added successfully");
                            break;
                        case 2:
                            System.out.println("Show Songs");
                            if (songs.isEmpty())
                                System.out.println("No songs available");
                            
                            for (int i = 0; i < songs.size(); i++){
                                System.out.println("Song " + (i+1));
                                songs.get(i).tampilkanData();
                            }
                            break;
                        case 3:
                            System.out.println("Update Song");
                            for (int i = 0; i < songs.size(); i++){
                                System.out.println("Song " + (i+1));
                                songs.get(i).tampilkanData();
                            }
                            System.out.print("Song number: ");
                            int songNumber = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Title: ");
                            title = scanner.nextLine();
                            System.out.print("Artist: ");
                            artist = scanner.nextLine();
                            System.out.print("Genre: ");
                            genre = scanner.nextLine();
                            System.out.print("Year: ");
                            year = scanner.nextInt();
                            song = new songMethods(title, artist, genre, year);
                            songs.set(songNumber-1, song);
                            System.out.println("Song updated successfully");
                            break;
                        case 4:
                            System.out.println("Delete Song");
                            for (int i = 0; i < songs.size(); i++){
                                System.out.println("Song " + (i+1));
                                songs.get(i).tampilkanData();
                            }
                            System.out.print("Song number: ");
                            songNumber = scanner.nextInt();
                            songs.remove(songNumber-1);
                            System.out.println("Song deleted successfully");
                            break;
                        case 5:
                            run();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Artists (Placehold Coming Soon)");
                    break;
                case 3:
                    System.out.println("Genres (Placehold Coming Soon)");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
