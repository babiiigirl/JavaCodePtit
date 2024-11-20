package J05040_LapBangTinhCong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            int luongNgay = sc.nextInt();
            int soNgayCong = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien x = new NhanVien(i, ten, luongNgay, soNgayCong, chucVu);
            a.add(x);
        }
        for (NhanVien x : a) {
            System.out.println(x);
        }
    }
}
