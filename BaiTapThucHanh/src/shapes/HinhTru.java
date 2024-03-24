package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron{
     public float chieucao ;

    public HinhTru(){
        ten = "Hinh Tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Cao = ");
        chieucao = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        thetich = dientich *chieucao;
    }
}

