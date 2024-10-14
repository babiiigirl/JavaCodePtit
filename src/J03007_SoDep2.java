import java.util.Scanner;

public class J03007_SoDep2 {
    public static boolean check(String s){
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        int sum = 0;
        for (char x : s.toCharArray()) {
            sum += (x - '0');
        }
        if (sum % 10 != 0) return false;
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
