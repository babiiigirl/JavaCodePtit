package J05060_KetQuaXetTuyen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        for (ThiSinh x : a) System.out.println(x);
    }
}
