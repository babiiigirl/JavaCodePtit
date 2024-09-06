import java.util.HashSet;
import java.util.Scanner;

public class J02016_BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashSet<Long> set = new HashSet<>();
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++){
                int tmp = sc.nextInt();
                a[i] = (long)tmp * tmp;
                set.add(a[i]);
            }
            boolean check = false;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++)
                {
                    if (set.contains(a[i] + a[j])) {
                        System.out.println("YES");
                        check = true;
                        break;
                    }
                }
            }
            if (!check) System.out.println("NO");
        }
    }
}