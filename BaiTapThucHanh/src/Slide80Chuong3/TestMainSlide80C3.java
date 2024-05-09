package Slide80Chuong3;


public class TestMainSlide80C3 {
    public static void main(String[] args) {
    NhanVienFullTime Sep = new NhanVienFullTime("Tran Van Sep");
    Sep.setLoaichucvu(1);
    NhanVienFullTime nhanvien1 = new NhanVienFullTime("Nguyen Van Linh");
    NhanVienFullTime nhanvien2 = new NhanVienFullTime("Le Thi Linh ",3);
    NhanVienPartTime nhanvien3 = new NhanVienPartTime("Thoi Vu",240);

    Sep.setLoaichucvu(Configs.nvSep);
    nhanvien1.setLoaichucvu(Configs.nvLinh);
    nhanvien2.setLoaichucvu(Configs.nvLinh);

    Sep.tinhLuong();
    nhanvien1.tinhLuong();
    nhanvien2.tinhLuong();
    nhanvien3.tinhLuong();

    Sep.xuatThongTin();
    nhanvien1.xuatThongTin();
    nhanvien2.xuatThongTin();
    nhanvien3.xuatThongTin();
    }
}

