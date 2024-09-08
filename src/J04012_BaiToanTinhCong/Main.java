package J04012_BaiToanTinhCong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongCoBan = sc.nextInt(), ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        NhanVien x = new NhanVien("NV01", ten, luongCoBan, ngayCong, chucVu);
        System.out.println(x);
    }
}
