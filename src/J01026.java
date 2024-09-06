import java.util.Scanner;

import static java.lang.Math.*;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int can = (int)sqrt(n);
            if (can * can == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
