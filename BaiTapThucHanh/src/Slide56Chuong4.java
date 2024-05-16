import java.util.HashSet;
import java.util.Scanner;

public class Slide56Chuong4 {
    public static void main(String[] args) {
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Java");
        hashSetString.add("C++");
        hashSetString.add("PHP");
        hashSetString.add("C#");
        hashSetString.add("JavaScrift");

        System.out.println(hashSetString);
        System.out.print("Nhap vao phan tu can xoa : ");
        String number = sc.nextLine();

        if(hashSetString.contains(number)){
            hashSetString.remove(number);
            System.out.println("Xoa thanh cong !");
            System.out.println(hashSetString);
        }else{
            System.out.println("Phan tu khong co trong HashSetString !");
        }

    }
   
}
