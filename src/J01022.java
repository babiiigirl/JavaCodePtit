import java.util.Scanner;

public class J01022 {
    public static final long[] f = new long[93];
    public static void ktao(){
        f[1] = 1; f[2] = 1;
        for (int i = 3; i <= 92; i++)
            f[i] = f[i - 1] + f[i - 2];
    }
    public static char xaunp(int n, long k){
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= f[n - 2]) return xaunp(n - 2, k);
        return xaunp(n - 1, k - f[n- 2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ktao();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(xaunp(n, k));
        }
    }
}
