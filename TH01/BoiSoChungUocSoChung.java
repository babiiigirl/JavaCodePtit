package TH01;

import java.util.Scanner;

public class BoiSoChungUocSoChung {
    public static long gcd(long a, long b) {
        if (a == 0 || b == 0) return (a + b);
        else return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
