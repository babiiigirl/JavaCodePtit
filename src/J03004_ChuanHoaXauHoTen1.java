import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.*;

public class J03004_ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String[] arr = s.split("\\s+");
            String res = "";
            for (String x : arr) {
                if (x.length() > 0)
                    res += toUpperCase(x.charAt(0));
                for (int j = 1; j < x.length(); j++)
                    res += x.charAt(j);
                res += " ";
            }
            System.out.println(res.trim());
        }
    }
}
