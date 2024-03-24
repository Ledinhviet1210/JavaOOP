package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
     public float dai;
    public float rong;
    
    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai = ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu rong = ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi = (dai+rong)*2;
    }
    public void tinhDienTich(){
        dientich = dai*rong;
}
}
