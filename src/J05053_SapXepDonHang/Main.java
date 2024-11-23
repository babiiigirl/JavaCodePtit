package J05053_SapXepDonHang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            DonHang x = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                return o1.soThuTu().compareTo(o2.soThuTu());
            }
        });
        for (DonHang x : a) System.out.println(x);
    }
}

