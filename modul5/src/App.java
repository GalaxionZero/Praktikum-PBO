import model.*;
import model.hewan.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Printer printer = new Printer();
        printer.main("John Doe");
        printer.print(12345);
        printer.print("Jane Doe", 67890);
        System.out.println("Max number (double): " + Printer.maxNumber(5.5, 3.2));
        System.out.println("Max number (int): " + Printer.maxNumber(10, 20));

        Hewan kucing = new Kucing();
        kucing.suara();
        kucing.makan();
        kucing.tidur();

    }
}
