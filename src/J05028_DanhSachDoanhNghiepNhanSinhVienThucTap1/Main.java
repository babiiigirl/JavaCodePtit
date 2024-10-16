package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if (o1.getSoSinhVien() == o2.getSoSinhVien())
                    return o1.getMa().compareTo(o2.getMa());
                else return o2.getSoSinhVien() - o1.getSoSinhVien();
            }
        });
        for (DoanhNghiep x : a) System.out.println(x);
    }
}
