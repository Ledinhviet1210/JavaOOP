
    import java.util.Scanner;

public class Slide90Chuong2 {
    public static void main(String[] args) {
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap choi bat ky :");
        String a = sc.nextLine();
        System.out.println("Chuoi ban vua nhap la :" );
        for(int i=0;i<a.length();i++){
            kytu = a.charAt(i);
            System.out.println("\n"+kytu);
        }
    }
    }

