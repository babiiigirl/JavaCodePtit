import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        for (int i = 1; i <= n; i++){
            long gt = 1;
            for (int j = 1; j <= i; j++){
                gt *= j;
            }
            s += gt;
        }
        System.out.println(s);
    }
}
