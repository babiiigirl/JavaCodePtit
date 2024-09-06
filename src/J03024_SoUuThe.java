import java.util.Scanner;

import static java.lang.Character.*;

public class J03024_SoUuThe {
    public static int check(String s) {
        for (char x : s.toCharArray()) {
            if (!isDigit(x)) return -1;
        }
        int odd = 0, even = 0;
        for (char x : s.toCharArray()) {
            if ((x - '0') % 2 == 0) ++even;
            else ++odd;
        }
        if (s.length() % 2 == 0 && even > odd) return 1;
        else if (s.length() % 2 != 0 && even < odd) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s) == 1) System.out.println("YES");
            else if (check(s) == 0) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
