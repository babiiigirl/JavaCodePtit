import java.util.Scanner;

public class J03006_SoDep1 {
    public static boolean check(String s){
        for (char x : s.toCharArray()) {
            if ((x - '0') % 2 != 0) return false;
        }
        StringBuilder sb = new StringBuilder(s);
        if (!s.equals(sb.reverse().toString())) return false;
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
