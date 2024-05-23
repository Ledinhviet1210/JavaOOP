import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108Chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer,Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(2, 10.1d);
        treeMap.put(4, 7.3d);
        treeMap.put(7, 20.9d);

        System.out.println("Cac phan tu co trong treemap :");
        Set<Map.Entry<Integer,Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treeMap.replace(1, 20.11d);
        treeMap.replace(7, 7.7);

        System.out.println("Cac phan tu co trong treemap sau khi thay the:");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        
    }
}
