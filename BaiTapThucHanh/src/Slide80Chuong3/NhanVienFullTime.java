package Slide80Chuong3;

import java.util.Scanner;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
   private int ngaylamthem ;
   private int loaichucvu ;

   public  nhanVienFullTime(String name){
    this.name = name ;
   }
   public  nhanVienFullTime(String name ,int ngaylamthem){
    this.name = name;
    this.ngaylamthem = ngaylamthem;
   }
   public void setLoaichucvu(int loaichucvu) {
       this.loaichucvu = loaichucvu;
   }
   @Override
   public String loaiNhanVien(){
    return "Nhan Vien Toan Thoi Gian ";
   }
   public void tinhLuong(){
    if(loaichucvu == Configs.nvSep){
        luong = Configs.LuongNhanVienFullTime_Sep +ngaylamthem *Configs.LuongLamThem_MoiNgay;
    }else {
    luong = Configs.LuongNhanVienFullTime_Linh +ngaylamthem*Configs.LuongLamThem_MoiNgay;
    }
   }
}
