package J05022_LietKeSinhVienTheoLop;

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
            String className = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + className + ":");
            for (SinhVien x : a) {
                if (x.getClassName().equals(className)) System.out.println(x);
            }
        }
    }
}
