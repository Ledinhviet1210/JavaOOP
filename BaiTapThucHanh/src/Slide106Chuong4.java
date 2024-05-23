import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Slide106Chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer,Character> treeMap = new TreeMap<>();

        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(4, 'C');
        treeMap.put(3,'D');
        treeMap.put(2, 'E');

        Set<Entry<Integer,Character>> setTreeMap = treeMap.entrySet();

        System.out.println("Cac entry co trong setTreeMap");
        System.out.println(setTreeMap);
    }
}
