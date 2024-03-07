
    import java.util.Arrays;
import java.util.Scanner;

public class Slide74Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử trong mang :");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int k=0;k<n;k++){
            System.out.println("Nhập phần tử thứ : "+k);
            a[k] =sc.nextInt();
        }
        System.out.println("mang= "+Arrays.toString(a));
        int tong =0;
        for(int i=0;i<n;i++){
            if(a[i] % 2==0){
                tong += a[i];
            }
        }System.out.println("Tổng = "+tong);
    }
    
}

