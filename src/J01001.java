import java.util.*;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a <= 0 || b <= 0){
            System.out.println(0);
            return;
        }
        else System.out.println((a + b) * 2 + " " + (a * b));
    }
}
