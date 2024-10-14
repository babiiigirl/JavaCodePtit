import java.util.*;

import static java.lang.Math.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++){
            int n = sc.nextInt();
            System.out.print("Test " + j + ": ");
            for (int i = 2; i <= sqrt(n); i++){
                if (n % i == 0){
                    int cnt = 0;
                    while (n % i == 0){
                        ++cnt;
                        n /= i;
                    }
                    System.out.print(i + "(" + cnt + ")" + " ");
                }
            }
            if (n > 1) System.out.print(n + "(" + 1 + ")");
            System.out.println();
        }
    }
}
