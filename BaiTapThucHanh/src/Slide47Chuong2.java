
    import java.util.Scanner;

public class Slide47Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S =0;
        do{
            System.out.print("Nhap n =");
        int n = sc.nextInt();
            S += n;
        }while(S<100);
        System.out.println("Tong S =" +S);
    }
}

