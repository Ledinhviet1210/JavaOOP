
    import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count =0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap chuoi bat ky :");
        chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        System.out.print("Nhap ky tu muon tim kiem :");
        kytu = sc.next().charAt(0);
        for(int i=0;i<chuoi.length();i++){
            if(kytu == chuoi.charAt(i)){
                count ++;
            }
        }
        System.out.print("So lan xuat hien chuoi la :" +count);
    }
}

