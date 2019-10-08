package Buoi9TnhKeThua;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ConCho c = new ConCho();

        c.soChan = "4";
        c.tenDongVat = "Con chó";

        System.out.println(c.tenDongVat + " có " + c.soChan);
        c.an();
        c.ngu();
    }
}
