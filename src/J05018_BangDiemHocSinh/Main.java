package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double[] diem = new double[10];
            for (int j = 0; j < 10; j++) diem[j] = sc.nextDouble();
            HocSinh x = new HocSinh(i, ten, diem);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.diemTrungBinh() > o2.diemTrungBinh()) return -1;
                else return 1;
            }
        });
        for (HocSinh x : arr) System.out.println(x);
    }
}
