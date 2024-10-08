package TH01;

import java.util.Scanner;

public class XauDoiXung {
    public static void check(String s) {
        int n = s.length();
        int cnt = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                cnt++;
            }
        }
        if (cnt == 1 || cnt == 0 && n % 2 == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            check(s);
        }
    }
}
