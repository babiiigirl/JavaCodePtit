package J05027_TimKiemGiangVien;

import java.util.*;

import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String key = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for (GiangVien x : a) {
                if (x.getName().toLowerCase().contains(key.toLowerCase()))
                    System.out.println(x);
            }
        }
    }
}
