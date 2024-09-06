package J05004_DanhSachDoiTuongSinhVien2;

import java.util.ArrayList;
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
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
