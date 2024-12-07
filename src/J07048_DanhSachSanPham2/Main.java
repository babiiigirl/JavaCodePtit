package J07048_DanhSachSanPham2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<SanPham> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a);
        for (SanPham x : a) System.out.println(x);
    }
}
