import java.util.ArrayList;

public class Slide18Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        arrayListInteger.add(0);
        arrayListInteger.add(2);
        arrayListInteger.add(3);
        arrayListInteger.add(5);

        System.out.println("Cac phan tu co trong arrList : ");
        for(int number :arrayListInteger){
            System.out.print(number + "\t");
        }
    }
}
