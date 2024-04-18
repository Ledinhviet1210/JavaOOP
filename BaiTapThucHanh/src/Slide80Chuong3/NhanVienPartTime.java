package Slide80Chuong3;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int giolamviec ;

    public nhanVienPartTime(String name , int giolamviec){
        this.name = name ;
        this.giolamviec=giolamviec;
    }
    @Override
     public String loaiNhanVien(){
        return "Nhan Vien Thoi Vu" ;
     }
     public void tinhLuong(){
        luong = Configs.LuongNhanVienPartTime_MoiGio*giolamviec;
     }
}
