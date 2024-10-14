import java.util.Scanner;

import static java.lang.Math.*;

public class J01018 {
    public static boolean check(String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (abs((int)s.charAt(i) - s.charAt(i + 1)) != 2)
                return false;
        }
        int sum = 0;
        for (char x : s.toCharArray()){
            sum += x - '0';
        }
        if (sum % 10 != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
