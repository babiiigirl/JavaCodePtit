import java.util.Scanner;

public class J01021 {
    public static final int mod = (int)1e9 + 7;
    public static long binPow(long a, long b){
        if (b == 0) return 1;
        long tmp = binPow(a, b / 2) % mod;
        if (b % 2 == 0) return (tmp * tmp) % mod;
        else return ((tmp * tmp) % mod * a) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while (true){
            a = sc.nextLong(); b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(binPow(a, b));
        }
    }
}
