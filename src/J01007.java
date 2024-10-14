import java.util.*;

public class J01007 {
    public static boolean fibo(long n){
        long[] f = new long[93];
        f[1] = f[2] = 1;
        for (int i = 3; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 1; i < 93; i++)
        {
            if (f[i] == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            if (fibo(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
