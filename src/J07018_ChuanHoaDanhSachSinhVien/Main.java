package J07018_ChuanHoaDanhSachSinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            SinhVien sinhVien = new SinhVien(i, sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            list.add(sinhVien);
        }
        for (SinhVien x : list) System.out.println(x);
    }
}
