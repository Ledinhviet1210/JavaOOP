package Person;

import java.util.Scanner;

public class Employee extends Person {
    public float LuongFullTime = 35000 ;
        public float LuongPartTime = 25000 ;
        public float luong ;
        public int n ;
        public String job ;
        public void nhapThongTinNhanVien(){
            nhapThongTin();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so gio lam trong thang :");
            n = sc.nextInt();
        }
        public void xuatThongTinNhanVien(){
            xuatThongTin();
            System.out.print("So gio lam viec la : "+n +"\n");
            System.out.println("Kieu nhan vien : "+job);
        }          
}
