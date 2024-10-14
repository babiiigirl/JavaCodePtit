import java.util.Scanner;

public class J02028_DayConLienTiepTongBangK {
    public static boolean check(long[] a, long k) {
        int left = 0, right = 0;
        long sum = 0;
        int cnt = 0;
        while (right < a.length) {
            sum += a[right];
            ++cnt;
            while (sum > k && left <= right) {
                sum -= a[left];
                ++left;
                --cnt;
            }
            if (sum == k && cnt > 0) return true;
            right++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            if (check(a, k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
