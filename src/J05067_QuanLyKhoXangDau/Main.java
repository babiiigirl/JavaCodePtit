package J05067_QuanLyKhoXangDau;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        sc.nextLine();
        while (t-- > 0){
            String donHang = sc.nextLine();
            String maDonHang = donHang.split("\\s+")[0];
            long soLuong = Long.parseLong(donHang.split("\\s+")[1]);
            DonHang x = new DonHang(maDonHang, soLuong);
            x.thongTinMaDonHang();
            a.add(x);
        }
        for (DonHang x : a) System.out.println(x);
    }
}
