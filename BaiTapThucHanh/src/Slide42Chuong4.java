import java.util.LinkedList;
import java.util.Scanner;

public class Slide42Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String>  linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.print("Nhap vao phan tu can lay : ");
        int index = sc.nextInt();

        if((index <0) || (index > linkedList.size()-1)){
            System.out.println("So can lay phai lon hon 0 hoac "+ (linkedList.size()-1));
        }
        else{
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = "+ index+ " trong LinkedList la : " +node);
        }

        String firstNode = linkedList.getFirst();
        System.out.println("Phan tu dau tien trong linkedList la : "+firstNode);

        String lastNode = linkedList.getLast();
        System.out.println("Phan tu dau tien trong linkedList la : "+lastNode);
    }
}
