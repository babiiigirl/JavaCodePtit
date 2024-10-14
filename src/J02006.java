import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        TreeSet<Integer> hop = new TreeSet<>();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            hop.add(a[i]);
        }
        for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            hop.add(b[i]);
        }
        for (int x : hop) System.out.print(x + " ");
    }
}
