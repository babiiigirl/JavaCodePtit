import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.*;

public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            int n = max(a.length(), b.length());
            BigInteger x = new BigInteger(a), y = new BigInteger(b);
            BigInteger sub = (x.subtract(y)).abs();
            System.out.println(String.format("%0" + n + "d", sub));
        }
    }
}
