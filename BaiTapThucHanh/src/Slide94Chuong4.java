import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Slide94Chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(100, "Mo");
        hm.put(101, "Dia");
        hm.put(102, "Chat");

        for(Map.Entry<Integer,String> m:hm.entrySet())
        System.out.println(m.getKey() +" "+m.getValue());
        
        System.out.println("Truoc khi remove :" +hm);
        hm.remove(101);
        System.out.println("Sau khi remove :"+hm);
    }
}
