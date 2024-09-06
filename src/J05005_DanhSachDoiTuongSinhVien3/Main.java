package J05005_DanhSachDoiTuongSinhVien3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.chuanHoaNgaySinh(); x.chuanHoaTen();
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() < o2.getGpa()) return 1;
                else return -1;
            }
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
