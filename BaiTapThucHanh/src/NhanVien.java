import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) {
        Employee nhanvien1 = new NhanVien().new Employee();
        nhanvien1.nhapThongTin();
        nhanvien1.xuatThongTin();
        nhanvien1.tinhLuong();
    }
    class Employee{
        String Ten ;
        float Luongparttime =25000 ;
        float Luongfulltime =40000 ;
        int n ;
        float Luong ;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien :");
        Ten = sc.nextLine();
        System.out.print("Nhap so gio lam :");
        n = sc.nextInt();
    }
    void xuatThongTin(){
        System.out.print("Ten nhan vien : "+Ten +" ");
        System.out.print("So gio lam : " +n+" ");
        
    }
    void tinhLuong(){
        if(n>=8){
            System.out.print("Luong = " +Luongfulltime*n);
        }else if(n<8 && n>0)
            System.out.print("Luong = " +Luongparttime*n);
    }
    }
}
