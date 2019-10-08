package Buoi9Interface;

public class ConMeo extends DongVat implements NhungHanhViCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con mèo ăn cá");
    }

    @Override
    public void ngu() {
        System.out.println("Con mèo không ngủ");
    }

    public void diChoi() {
        System.out.println("Con mèo không đi chơi");
    }

    @Override
    public void nhay() {
        System.out.println("Con mèo không nhảy");
    }

    public void sanMoi(){
        System.out.println("Mèo không săn mồi");
    }
}
