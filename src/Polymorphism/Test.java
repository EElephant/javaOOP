package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        Colorful colorful = new Colorful();
        colorful.print();

        BW bw = new BW();
        bw.print();
    }
}
