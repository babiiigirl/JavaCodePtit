import java.util.Scanner;

public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            int id = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (i > 0 && a[i] < a[i - 1]) id = i;
            }
            System.out.println(id);
        }
    }
}
