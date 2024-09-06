import java.util.HashMap;
import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static HashMap<String, Integer> map = new HashMap<>();
    public static String solve(String[] a) {
        String email = "";
        int n = a.length;
        email += a[n - 1];
        for (int i = 0; i < n - 1; i++) {
            email += a[i].charAt(0);
        }
        if (!map.containsKey(email)) map.put(email, 1);
        else {
            int cnt = map.get(email);
            map.put(email, cnt + 1);
            email += (cnt + 1);
        }
        return email + "@ptit.edu.vn";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] arr = s.split("\\s+");
            System.out.println(solve(arr));
        }
    }
}
