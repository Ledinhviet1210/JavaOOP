package shapes;
import shapes.HinhTron;
import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        HinhTron hinhTron=new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();       
     
 
     HinhTru hinhTru = new HinhTru();
     hinhTru.xuatTen();
     hinhTru.nhapChieuCao();
     hinhTru.tinhTheTich();
     hinhTru.inTheTich();
 
     HinhChuNhat hinhChuNhat = new HinhChuNhat();
     hinhChuNhat.xuatTen();
     hinhChuNhat.nhapChieuDai();
     hinhChuNhat.nhapChieuRong();
     hinhChuNhat.tinhChuVi();
     hinhChuNhat.tinhDienTich();
     hinhChuNhat.inChuVi();
     hinhChuNhat.inDienTich();
 
     HinhVuong hinhvuong = new HinhVuong();
     hinhvuong.xuatTen();
     hinhvuong.nhapCanh();
     hinhvuong.tinhChuVi();
     hinhvuong.tinhDienTich();
     hinhvuong.inChuVi();
    }
}
