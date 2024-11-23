package J05061_SapXepKetQuaXetTuyen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.diemTrungBinh() == o2.diemTrungBinh()) return o1.getMa().compareTo(o2.getMa());
                else return o2.diemTrungBinh() - o1.diemTrungBinh();
            }
        });
        for (ThiSinh x : a) System.out.println(x);
    }
}
