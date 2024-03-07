
    import java.util.Scanner;

public class giaiptbac1bac2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a=");
        int a = sc.nextInt();
        System.out.print("Nhap b=");
        int b = sc.nextInt();
        System.out.print("Nhap c=");
        int c = sc.nextInt();
        if(a==0){
        System.out.printf("Giai phuong trinh bac 1: %dx+%d=0 ",b,c);
        int x = -c/b;
        System.out.println("pt co nghiem x = " +x);
        }else{
            System.out.printf("giai pt bac 2: %dx*x + %dx +%d =0",a,b,c);
            double D = b*b -4*a*c;
            if(D<0){
                System.out.println("phương trình vô nghiệm ");
            }else if(D==0){
                System.out.println("Phương trình có nghiệm duy nhất x=" +-b/2*a);
            }else{
            double x1 = (-b + Math.sqrt(D))/2*a;
            double x2 = (-b - Math.sqrt(D))/2*a;
        
            System.out.println("Có 2 nghiệm phân biệt x1=" +x1+ "và x2 =" +x2);
        }
    }
}
}
