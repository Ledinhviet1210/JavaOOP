import java.util.LinkedList;

public class Slide38Chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("IT");

        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("listA : ");
        showList(listA);

        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");

        listA.retainAll(listB);
        System.out.println("listA : ");
        showList(listA);

        list.removeAll(listB);
        System.out.println("list : ");
        showList(list);
    }

        public static void showList(LinkedList<String> list){
            for (String obj : list){
                System.out.println("\t" +obj +" ,");
            }
            System.out.println();
        
    }
}

