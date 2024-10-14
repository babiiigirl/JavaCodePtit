import java.util.Scanner;

public class J02008 {
    public static int gcd(int a, int b){
        if (a == 0 || b == 0) return a + b;
        else return gcd(b, a % b);
    }
    public static int lcm(int a, int b){
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int bcnn = 1;
            for (int i = 1; i <= n; i++){
                bcnn = lcm(bcnn, i);
            }
            System.out.println(bcnn);
        }
    }
}
