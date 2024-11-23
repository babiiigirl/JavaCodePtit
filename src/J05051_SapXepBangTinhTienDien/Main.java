package J05051_SapXepBangTinhTienDien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.tongTien() - o1.tongTien();
            }
        });
        for (KhachHang x : a)
            System.out.println(x);
    }
}
