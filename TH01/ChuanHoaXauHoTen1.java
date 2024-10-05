package TH01;

import java.util.Scanner;

import static java.lang.Character.*;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            String res = "";
            for (String x : a) {
                if (!x.isEmpty()) {
                    res += toUpperCase(x.charAt(0));
                    for (int i = 1; i < x.length(); i++) res += toLowerCase(x.charAt(i));
                    res += " ";
                }
            }
            System.out.println(res.trim());
        }
    }
}
