package TH01;

import java.util.Scanner;

import static java.lang.Math.abs;

public class SoLienKe {
    public static boolean check(String s) {
        for (int i = 1; i < s.length() - 1; i++) {
            if (abs(s.charAt(i) - s.charAt(i + 1)) != 1 || abs(s.charAt(i) - s.charAt(i - 1)) != 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
