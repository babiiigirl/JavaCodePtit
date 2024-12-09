package J05062_HocBongSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> list = new ArrayList<>();
        ArrayList<Double> tbc = new ArrayList<>();
        while (n-- > 0){
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextInt());
            sc.nextLine();
            tbc.add(sinhVien.getTbc());
            list.add(sinhVien);
        }
        Collections.sort(tbc);
        double diemHB = tbc.get(m - 1);
        for (SinhVien sv : list){
            if (sv.getTbc() < diemHB) sv.setLoaiHB("KHONG");
        }
        for (SinhVien sv : list) System.out.println(sv);
    }
}
