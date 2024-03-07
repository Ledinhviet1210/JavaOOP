
    import java.util.Scanner;

public class Slide30Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen bat ky :");
        int n = sc.nextInt();
        int S=0;
        while(n>0){
            S += n%10;
            n /= 10;
        } System.out.println("Tong so nguyen la S= "+S);
    }
}

    
