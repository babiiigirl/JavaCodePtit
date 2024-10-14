import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
