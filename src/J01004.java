import java.util.Scanner;

import static java.lang.Math.*;

public class J01004 {
    public static boolean prime(int n){
        for (int i = 2; i < sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            if(prime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
