import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
            Student student = new SinhVien().new Student();
               student.nhapThongTin();
               student.xuatThongTin();
               student.diemTongKet();
           }
     class Student {
        String name ;
        float a , b,c  ;
        double tongket ;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien : ");
        name = sc.nextLine();
        System.out.print("Nhap diem a : ");
        a = sc.nextFloat();
        System.out.print("Nhap diem b : ");
        b = sc.nextFloat();
        System.out.print("Nhap diem c : ");
        c = sc.nextFloat();
    }
    void xuatThongTin(){
        System.out.print("Ten : "+name +" ");
        System.out.print("Diem a = "+a+" ");
        System.out.print("Diem b = "+b+" ");
        System.out.print("Diem c = "+c+" ");
    }
    void diemTongKet(){
        tongket = 0.6*a +0.3*b+0.1*c;
        System.out.println("Diem tong ket = " +tongket);
    }
}
    }
