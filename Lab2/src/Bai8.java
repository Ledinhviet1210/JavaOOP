
    import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day so :");
        int n = sc.nextInt();
        int avrage=0;
        for(int i=1;i<=n;i++){
            System.out.print("Nhap phan tu thu " +i+":");
            int tong=sc.nextInt();
            avrage += tong;
        }
        avrage /= n;
        System.out.print("Trung binh cong = "+avrage);
    }  
}
