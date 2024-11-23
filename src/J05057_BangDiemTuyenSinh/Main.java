package J05057_BangDiemTuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        for (ThiSinh x : a) System.out.println(x);
    }
}
