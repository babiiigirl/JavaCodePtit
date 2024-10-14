package J05024_LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for (SinhVien x : a) {
                if (x.getNganh().equals("Cong nghe thong tin") || x.getNganh().equals("An toan thong tin")) {
                    if (x.getClassName().charAt(0) != 'E' && x.getNganh().equals(nganh)) System.out.println(x);
                }
                else if (x.getNganh().equals(nganh)) System.out.println(x);
            }
        }
    }
}
