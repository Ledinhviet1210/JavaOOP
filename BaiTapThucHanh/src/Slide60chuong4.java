import java.util.LinkedHashSet;
import java.util.Set;

public class Slide60chuong4 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>(); 
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        linkedHashSet.add("C++");
        linkedHashSet.add("C#");

        for(String str : linkedHashSet){
            System.out.println(str);
        }
    }
}
