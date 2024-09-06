package J05081_DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.loiNhuan() != o2.loiNhuan())
                    return o2.loiNhuan() - o1.loiNhuan();
                else return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }
}
