import java.util.*;
import java.lang.String;

public class J01010 {
    public static boolean check(String s){
        for (char x : s.toCharArray()){
            if (!(x == '0' || x == '1' || x == '8' || x == '9'))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0){
            String s = sc.nextLine();
            if (!check(s)) System.out.println("INVALID");
            else{
                String t = "";
                for (char x : s.toCharArray()){
                    if (x == '0' || x == '8' || x == '9') t += "0";
                    else if (x == '1') t += "1";
                }
                long res = Long.parseLong(t);
                if (res == 0) System.out.println("INVALID");
                else System.out.println(res);
            }
        }
    }
}
