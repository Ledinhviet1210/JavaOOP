import java.util.ArrayList;
import java.util.Scanner;

public class Slide25Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInt = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int number ;

        System.out.print("Nhap so pan tu cua arrList : ");
        int n = sc.nextInt();

        for(int i =0 ;i<n ;i++){
            System.out.print("Nhap phan tu thu "+i +": ");
            number = sc.nextInt();
            arrListInt.add(number);
        }
        int max = arrListInt.get(0);

        for(int i=1 ; i < arrListInt.size() ; i++){
            if (arrListInt.get(i).compareTo(max)>0)
            max = arrListInt.get(i);
        }
        System.out.println("Phan tu max : " +max);

    }
}
