package J05064_BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<GiaoVien> a = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        int ht = 0, hp = 0;
        for (GiaoVien x : a){
            if (x.getChucVu().equals("HT") && ht == 0){
                ++ht;
                System.out.println(x);
            }
            else if (x.getChucVu().equals("HP") && hp < 2) {
                ++hp;
                System.out.println(x);
            }
            else if (x.getChucVu().equals("GV")) System.out.println(x);
        }
    }
}
