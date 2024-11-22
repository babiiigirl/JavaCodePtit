package J05049_LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        sc.nextLine();
        char nhom = sc.next().charAt(0);
        Collections.sort(a, new Comparator<MaHang>() {
            @Override
            public int compare(MaHang o1, MaHang o2) {
                return o2.thue() - o1.thue();
            }
        });
        for (MaHang x : a)
            if(x.getMa().charAt(0) == nhom) System.out.println(x);
    }
}
