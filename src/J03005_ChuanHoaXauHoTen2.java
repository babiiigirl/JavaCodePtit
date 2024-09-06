import java.util.Scanner;

import static java.lang.Character.*;

public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim().toUpperCase();
            String[] arr = s.split("\\s+");
            String res = "";

            for (int i = 1; i < arr.length; i++) {
                res += arr[i].charAt(0);
                for (int j = 1; j < arr[i].length(); j++) {
                    res += toLowerCase(arr[i].charAt(j));
                }
                res += " ";
            }

            res = res.trim() + ", " + arr[0];

            System.out.println(res);
        }
    }
}