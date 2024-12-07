package J07046_DanhSachLuuTru;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a);
        for (KhachHang x : a) System.out.println(x);
    }
}
