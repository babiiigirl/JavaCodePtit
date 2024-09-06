import java.util.Scanner;

import static java.lang.Character.*;

public class J03040_BienSoDep {
    public static boolean isBeautiful(String s) {
        String lastFiveDigits = s.substring(s.length() - 6).replace(".", "");
        int[] digits = new int[5];
        for (int i = 0; i < 5; i++) {
            digits[i] = lastFiveDigits.charAt(i) - '0';
        }
        boolean increasing = true;
        for (int i = 1; i < 5; i++) {
            if (digits[i] <= digits[i - 1]) {
                increasing = false;
                break;
            }
        }
        if (increasing) return true;

        boolean allEqual = true;
        for (int i = 1; i < 5; i++) {
            if (digits[i] != digits[i - 1]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return true;

        if (digits[0] == digits[1] && digits[1] == digits[2] && digits[3] == digits[4]) {
            return true;
        }
        boolean luckyNumbers = true;
        for (int i = 0; i < 5; i++) {
            if (digits[i] != 6 && digits[i] != 8) {
                luckyNumbers = false;
                break;
            }
        }
        if (luckyNumbers) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();

            if (isBeautiful(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
