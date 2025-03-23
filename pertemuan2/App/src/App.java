import java.util.ArrayList;
import java.util.Scanner;
import model.Mahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        OUTER:
        while (true) {
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa mahasiswa = new Mahasiswa();
                    System.out.print("Nama: ");
                    mahasiswa.setNama(scanner.nextLine());
                    System.out.print("NIM: ");
                    mahasiswa.setNIM(scanner.nextInt());
                    listMahasiswa.add(mahasiswa);
                }
                case 2 -> {
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        mahasiswa.tampilkanData();
                    }
                }
                case 3 -> {
                    break OUTER;
                }
                default -> {
                }
            }
        }

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Budi");
        mahasiswa1.setNIM(12345);



        mahasiswa1.tampilkanData();
    }
}