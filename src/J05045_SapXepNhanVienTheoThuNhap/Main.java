package J05045_SapXepNhanVienTheoThuNhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.thuNhap() == o2.thuNhap()) return o1.getMa().compareTo(o2.getMa());
                else return o2.thuNhap() - o1.thuNhap();
            }
        });
        for (NhanVien x : a){
            System.out.println(x);
        }
    }
}
