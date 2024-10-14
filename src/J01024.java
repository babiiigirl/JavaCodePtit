import java.util.Scanner;

public class J01024 {
    public static boolean check(String s){
        for (char x : s.toCharArray()){
            if ((x != '1') && (x != '0') && (x != '2')){
                return false;
            }
        }
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
