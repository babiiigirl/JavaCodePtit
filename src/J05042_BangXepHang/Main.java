package J05042_BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getC() == o2.getC()) {
                    if (o1.getT() == o2.getT()) return o1.getName().compareTo(o2.getName());
                    else return o1.getT() - o2.getT();
                }
                else return o2.getC() - o1.getC();
            }
        });
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
