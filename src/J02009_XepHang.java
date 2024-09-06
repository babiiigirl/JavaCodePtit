import java.util.Scanner;
import java.util.TreeMap;

public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (n-- > 0) {
            int t = sc.nextInt(), d = sc.nextInt();
            map.put(t, d);
        }

    }
}
