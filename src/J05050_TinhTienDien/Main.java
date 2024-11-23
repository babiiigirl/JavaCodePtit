package J05050_TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        for (KhachHang x : a)
            System.out.println(x);
    }
}
