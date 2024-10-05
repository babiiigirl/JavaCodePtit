package TH01;

import java.util.Scanner;

public class SoDep2 {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (!sb.reverse().toString().equals(s)) return false;
        if (s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') return false;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) sum += Integer.parseInt(s.charAt(i) + "");
        if (sum % 10 != 0) return false;
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
