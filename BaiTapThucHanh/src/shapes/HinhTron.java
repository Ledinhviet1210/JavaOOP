package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float bankinh ;
    public HinhTron(){
        ten = "Hinh Tron" ;
    }

    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban Kinh = ");
        bankinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi =2*Pi*bankinh;
    }
    public void tinhDienTich(){
        dientich = Pi*bankinh*bankinh;
    }
}
