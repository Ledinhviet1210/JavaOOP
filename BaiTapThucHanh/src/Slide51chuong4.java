import java.util.HashSet;
import java.util.TreeSet;

public class Slide51chuong4 {
    public static void main(String[] args) {
        // Khai bao HashSet co kieu la Integer
        HashSet<Integer> hashSetInt = new HashSet<>();

        // Khai bao 1 HashSet co kich thuoc khoi tao = 32
        HashSet<Character> hashSetChar = new HashSet<>(32);

        // Khai bao 1 HashSet co kich thuoc khoi tao = 16 va yeu to tai = 0.75f(auto)
        HashSet<String> hashSet = new HashSet<>(16,0.75f);

        // Khai bao 1 HashSet duoc tao thanh tu 1 collection khac
        HashSet<Float> hashFl = new HashSet<>((new TreeSet<>()));
    }
}
