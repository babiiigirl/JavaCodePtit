package J04015_TinhThuNhapGiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine(), name = sc.nextLine();
        int salary = sc.nextInt();
        GiaoVien x = new GiaoVien(id, name, salary);
        x.tinhThuNhap();
    }
}
