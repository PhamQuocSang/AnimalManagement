package Buoi9Interface;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class ConCho extends DongVat implements NhungHanhViCuaDongVat, NhungHanhViKhacCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con chó ăn cơm");
    }

    @Override
    public void ngu() {
        System.out.println("Con chó ngủ 4 tiếng");
    }

    @Override
    public void diChoi() {
        System.out.println("Con chó đi du lịch");
    }

    @Override
    public void nhay() {
        System.out.println("Con chó nhảy cao 10m");
    }

    @Override
    public void noDua() {
        System.out.println("Con chó nô đùa");
    }

    @Override
    public void sinhSan() {
        System.out.println("Sinh sản!");
    }
}
