package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" canh = ");
        dai =rong = sc.nextFloat();
    }
}
