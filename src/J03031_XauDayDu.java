import java.util.Scanner;
import java.util.TreeSet;

public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            TreeSet<Character> set = new TreeSet<>();
            for (char x : s.toCharArray()) set.add(x);
            if ((set.size() + k) < 26) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
