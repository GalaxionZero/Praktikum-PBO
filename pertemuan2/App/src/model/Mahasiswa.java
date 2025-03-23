package model;

public class Mahasiswa {
    String nama;
    int NIM;
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getNIM(){
        return NIM;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    // public Mahasiswa(String nama, int NIM){
    //     this.nama = nama;
    //     this.NIM = NIM;
    // }

    public void tampilkanData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }
}