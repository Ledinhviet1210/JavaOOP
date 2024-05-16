import java.util.HashSet;
import java.util.Scanner;

public class Slide54Chuong4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInt.add(0);
        hashSetInt.add(2);
        hashSetInt.add(4);
        hashSetInt.add(6);
        hashSetInt.add(8);
        hashSetInt.add(10);
        hashSetInt.add(12);
        
        System.out.println("Cac phan tu co trong HashSetInt :");
        System.out.println(hashSetInt);
        System.out.print("Nhap phan tu can nhap them : ");
        int number = sc.nextInt();

        if(!hashSetInt.contains(number)){
            System.out.println("Them thanh cong ! ");
            System.out.println(hashSetInt);
        }else{
            System.out.println("Phan tu "+number +" da co trong HashSet");
        }
    }
}
