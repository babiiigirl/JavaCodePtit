import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.max;

public class J03015_HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        BigInteger x = new BigInteger(a), y = new BigInteger(b);
        BigInteger sub = (x.subtract(y));
        System.out.println(sub);
    }
}
