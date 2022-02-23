package encapsulation2;

public class MainPrinter {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        Printer printerSimplex = new Printer(10, false);

        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed was: " + pagesPrinted + ", new total print count for printer: " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);

        System.out.println("Pages printed was: " + pagesPrinted + ", new total print count for printer: " + printer.getPagesPrinted());

        System.out.println("Initial page count = " + printerSimplex.getPagesPrinted());
        pagesPrinted = printerSimplex.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + ", new total print count for printer: " + printerSimplex.getPagesPrinted());
        pagesPrinted = printerSimplex.printPages(8);
        System.out.println("Pages printed was: " + pagesPrinted + ", new total print count for printer: " + printerSimplex.getPagesPrinted());
    }
}
