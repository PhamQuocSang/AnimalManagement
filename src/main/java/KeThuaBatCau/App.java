package KeThuaBatCau;

public class App {
    public static void main(String[] args) {
        ConDe d = new ConDe();
        d.mauLong = "xám";
        d.soChan = "4";
        d.sung = "2";
        d.ten = "Lucky";
        d.tuoi = "2";

        System.out.println(d.ten + " " + d.soChan + " " +  d.sung + " " + d.tuoi + " " + d.mauLong);
    }
}
