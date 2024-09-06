import java.util.Scanner;

public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() > 0 && s.charAt(i) == sb.charAt(sb.length() - 1)) 
                sb.deleteCharAt(sb.length() - 1);
            else sb.append(s.charAt(i));
        }
        if (sb.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(sb.toString());
        }
    }
}