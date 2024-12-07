package J07034_DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        ArrayList<MonHoc> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (MonHoc x : a) System.out.println(x);
    }
}
