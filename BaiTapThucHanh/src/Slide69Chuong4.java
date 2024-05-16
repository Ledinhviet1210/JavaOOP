import java.util.Scanner;
import java.util.TreeSet;

public class Slide69Chuong4 {
    public static void main(String[] args) {
        int number ;
        TreeSet<Integer> treeSetInt = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSetInt.add(2);
        treeSetInt.add(4);
        treeSetInt.add(6);
        treeSetInt.add(8);
        treeSetInt.add(10);

        System.out.println("Cac phan tu trong treeSetInt : ");
        System.out.println(treeSetInt);
        System.out.print("Nhap phan tu can them : ");
        number = sc.nextInt();

        if(!treeSetInt.contains(number)){
            treeSetInt.add(number);
            System.out.println("Cac phan tu trong treeSetInt sau khi them :");
            System.out.println(treeSetInt);
        }else{
            System.out.println("Phan tu " +number+ " da ton tai");
        }
    }
}
