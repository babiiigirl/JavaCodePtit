package J05044_LietKeNhanVienTheoChucVu;

import java.util.ArrayList;
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
        sc.nextLine();
        String chucVu = sc.nextLine();
        for (NhanVien x : a){
            if (chucVu.equals(x.getChucVu())) System.out.println(x);
        }
    }
}
