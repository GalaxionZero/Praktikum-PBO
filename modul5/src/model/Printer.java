package model;

public class Printer {
    public void main (String nama) {
        System.out.println("Hello " + nama);
    }

    public void print (int nomor) {
        System.out.println("Nomor pesanan anda: " + nomor);
    }

    public void print(String nama, int nomor) {
        System.out.println("Hello " + nama + ", Nomor pesanan anda: " + nomor);
    }

    public static double maxNumber(double a, double b) {
        return (a > b) ? a : b;
    }

    public static int maxNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    

}