import java.util.Scanner;

public class J01011 {
    public static long gcd(int a, int b){
        if (a == 0 || b == 0) return a + b;
        else return gcd(b, a % b);
    }
    public static long lcm(int a, int b){
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
