public package Slide80Chuong3;

import java.util.Scanner;

class NhanVien {

    protected String name ;
    protected long luong ;

    public NhanVien(){
        ten = " ";
        luong = 0;
    }

    public void NhanVien(String name){
       this.name = name ;
    }
    protected String loaiNhanVien(){
        return " ";
    }
    public void xuatThongTin(){
        System.out.println("Nhan Vien : "+name);
        System.out.println("Loai nhan vien :" +loaiNhanVien());
        System.out.println("Luong = " +luong+" VND");
    }
}