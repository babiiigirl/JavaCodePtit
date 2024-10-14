import java.util.HashSet;
import java.util.Scanner;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            String[] a1 = s1.split("\\s+");
            String[] a2 = s2.split("\\s+");
            HashSet<String> set2 = new HashSet<>(), set = new HashSet<>();
            for (String x : a2) {
                set2.add(x);
            }
            for (String x : a1) {
                if (!set2.contains(x)) set.add(x);
            }
            for (String x : set) System.out.print(x + " ");
            System.out.println();
        }
    }
}
