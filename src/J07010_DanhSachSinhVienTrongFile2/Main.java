package J07010_DanhSachSinhVienTrongFile2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> a = new ArrayList<>();
        try{
            File file = new File("SV.in");
            Scanner sc = new Scanner(file);
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                sc.nextLine();
                SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
                a.add(x);
            }
        } catch (Exception e) {
            System.out.println(e);;
        }
        for (SinhVien x : a) System.out.println(x);
    }
}
