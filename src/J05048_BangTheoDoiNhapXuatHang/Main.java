package J05048_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MaHang> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            MaHang x = new MaHang(sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        for (MaHang x : a)
            System.out.println(x);
    }
}
