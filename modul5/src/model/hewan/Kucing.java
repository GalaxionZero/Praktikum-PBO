package model.hewan;

import model.Hewan;

public class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }

    @Override
    public void makan() {
        System.out.println("Kucing sedang makan ikan");
    }

    @Override
    public void tidur() {
        System.out.println("Kucing sedang tidur di atas sofa");
    }
}