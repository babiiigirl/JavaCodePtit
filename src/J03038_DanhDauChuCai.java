
import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (char x : s.toCharArray()) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}
