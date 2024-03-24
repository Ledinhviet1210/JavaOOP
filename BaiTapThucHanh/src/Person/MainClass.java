package Person;

public class MainClass {
    public static void main(String[] args) {
        Employeefulltime nhanvien1 = new Employeefulltime();
        nhanvien1.nhapThongTinNhanVien();
        nhanvien1.xuatThongTinNhanVien();
        nhanvien1.tinhLuongFullTime();
               

        Employeeparttime nhanvien2 = new Employeeparttime();
        nhanvien2.nhapThongTinNhanVien();
        nhanvien2.xuatThongTinNhanVien();
        nhanvien2.tinhLuongPartTime();
        
        
    }
}
