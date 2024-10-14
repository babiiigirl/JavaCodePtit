package J05023_LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0){
           SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String year = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for (SinhVien x : a) {
                if (x.getCourse().equals(String.valueOf(year.charAt(2) + year.charAt(3)))) System.out.println(x);
            }
        }
    }
}
