package Slide80Chuong3;

import java.io.ObjectInputFilter.Config;

public class TestMainSlide80C3 {
    public static void main(String[] args) {
    NhanVienFullTime Sep = new NhanVienFullTime();
    NhanVienFullTime nhanvien1 = new NhanVienFullTime();
    NhanVienFullTime nhanvien2 = new NhanVienFullTime();
    NhanVienPartTime nhanvien3 = new NhanVienPartTime();

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

