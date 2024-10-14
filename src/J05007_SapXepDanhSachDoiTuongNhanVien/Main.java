package J05007_SapXepDanhSachDoiTuongNhanVien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getYear() == o2.getYear()) {
                    if (o1.getMonth() == o2.getMonth()) return o1.getDay() - o2.getDay();
                    else return o1.getMonth() - o2.getMonth();
                }
                return o1.getYear() - o2.getYear();
            }
        });

        for (NhanVien x : a) System.out.println(x);
    }
}
