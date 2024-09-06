import java.util.*;

import static java.lang.Math.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long max = -1;
            for (int i = 2; i <= sqrt(n); i++){
                while (n % i == 0){
                    max = max(max, i);
                    n /= i;
                }
            }
            if (n > 1) max = n;
            System.out.println(max);
        }
    }
}
