import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        HashSet<Integer> setA = new HashSet<>();
        TreeSet<Integer> giao = new TreeSet<>();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            setA.add(a[i]);
        }
        for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(setA.contains(b[i])) giao.add(b[i]);
        }
        for (int x : giao) System.out.print(x + " ");
    }
}
