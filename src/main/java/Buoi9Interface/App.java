package Buoi9Interface;

public class App {
    public static void main(String[] args) {
        ConCho c = new ConCho();
        c.an();
        c.diChoi();
        c.ngu();
        c.nhay();
        c.tenDv = "Lulu";
        c.tuoi = "10";
        c.sinhSan();
        c.noDua();
        c.sanMoi();

        System.out.println("────────────────────────────────");
        ConMeo m = new ConMeo();
        m.an();
        m.diChoi();
        m.ngu();
        m.nhay();
        m.tenDv="kitty";
        m.tuoi="5";
        m.sanMoi();
    }
}
