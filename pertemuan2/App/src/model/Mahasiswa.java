package model;

public class Mahasiswa {
    String nama;
    int NIM;

    public Mahasiswa(String nama, int NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    public void tampilkanData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }
}