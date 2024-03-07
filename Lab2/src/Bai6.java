
    import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = sc.nextInt();
        int result = 1;
        do{
            if(n<0){
            System.out.println("Moi ban nhap lai :");
            break;
        }else{
            for(int i=1;i<=n;i++) {
                result = result*i;
            }
        }
        System.out.print("Giai thua cua "+n+" la : "+result);
    }
    while(n<0); {
      }   
    }
}

