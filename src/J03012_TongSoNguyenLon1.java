import java.math.BigInteger;
import java.util.Scanner;

public class J03012_TongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            BigInteger x = new BigInteger(sc.next());
            BigInteger y = new BigInteger(sc.next());
            System.out.println(x.add(y));
        }
    }
}
