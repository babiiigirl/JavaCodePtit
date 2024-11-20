package J05038_BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        int chiPhi = 0;
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            int luongNgay = sc.nextInt();
            int soNgayCong = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien x = new NhanVien(i, ten, luongNgay, soNgayCong, chucVu);
            a.add(x);
            chiPhi += x.thucLinh();
        }
        for (NhanVien x : a) {
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + chiPhi);
    }
}
